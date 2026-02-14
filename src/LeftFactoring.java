import java.util.*;

public class LeftFactoring {

    // Function to find common prefix
    public static String commonPrefix(List<String> list) {
        if (list.size() == 0) return "";

        String prefix = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            while (!list.get(i).startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Non-Terminal: ");
        String nonTerminal = sc.next();

        System.out.print("Enter number of productions: ");
        int n = sc.nextInt();

        List<String> productions = new ArrayList<>();

        System.out.println("Enter productions (without arrow):");
        for (int i = 0; i < n; i++) {
            productions.add(sc.next());
        }

        // -------- First Level Factoring --------
        List<String> groupA = new ArrayList<>();
        List<String> others = new ArrayList<>();

        // Group productions starting with same first character
        char firstChar = productions.get(0).charAt(0);

        for (String p : productions) {
            if (p.charAt(0) == firstChar)
                groupA.add(p);
            else
                others.add(p);
        }

        String prefix1 = commonPrefix(groupA);

        System.out.println("\nAfter Left Factoring:\n");

        // S → aS' | b
        System.out.print(nonTerminal + " -> " + prefix1 + nonTerminal + "'");

        for (String o : others) {
            System.out.print(" | " + o);
        }

        System.out.println();

        // Create S'
        List<String> remaining1 = new ArrayList<>();
        for (String g : groupA) {
            remaining1.add(g.substring(prefix1.length()));
        }

        // -------- Second Level Factoring --------
        List<String> groupS = new ArrayList<>();
        List<String> others2 = new ArrayList<>();

        for (String r : remaining1) {
            if (r.startsWith("S"))
                groupS.add(r);
            else
                others2.add(r);
        }

        String prefix2 = commonPrefix(groupS);

        System.out.print(nonTerminal + "' -> ");

        if (!groupS.isEmpty()) {
            System.out.print(prefix2 + nonTerminal + "''");
            if (!others2.isEmpty())
                System.out.print(" | " + String.join(" | ", others2));
            System.out.println();
        }

        // Create S''
        System.out.print(nonTerminal + "'' ->");

        List<String> remaining2 = new ArrayList<>();
        for (String g : groupS) {
            remaining2.add(g.substring(prefix2.length()));
        }

        System.out.println(String.join(" | ", remaining2));

        sc.close();
    }
}
