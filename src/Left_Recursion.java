import java.util.*;

public class Left_Recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Non-Terminal: ");
        String nonTerminal = sc.next();

        System.out.print("Enter number of productions: ");
        int n = sc.nextInt();

        List<String> alpha = new ArrayList<>();
        List<String> beta = new ArrayList<>();

        System.out.println("Enter productions (without arrow):");
        for (int i = 0; i < n; i++) {
            String prod = sc.next();

            if (prod.startsWith(nonTerminal)) {
                alpha.add(prod.substring(nonTerminal.length()));
            } else {
                beta.add(prod);
            }
        }

        if (alpha.isEmpty()) {
            System.out.println("No Left Recursion Found.");
        } else {
            System.out.println("\nAfter Removing Left Recursion:");

            // A → βA'
            System.out.print(nonTerminal + " -> ");
            for (int i = 0; i < beta.size(); i++) {
                System.out.print(beta.get(i) + nonTerminal + "'");
                if (i < beta.size() - 1)
                    System.out.print(" | ");
            }

            System.out.println();

            // A' → αA' | ε
            System.out.print(nonTerminal + "' -> ");
            for (int i = 0; i < alpha.size(); i++) {
                System.out.print(alpha.get(i) + nonTerminal + "' | ");
            }
            System.out.println("epsilon");
        }

        sc.close();
    }
}