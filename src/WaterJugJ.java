import java.util.*;

class WaterJugJ {

    static class State {
        int a, b;
        State(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            State state = (State) obj;
            return a == state.a && b == state.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    private static boolean isValidState(State state, Set<State> visited) {
        return !visited.contains(state);
    }

    public static List<State> bfs(int x, int y, int z1, int z2) {
        Queue<State> queue = new LinkedList<>();
        Set<State> visited = new HashSet<>();
        Map<State, State> path = new HashMap<>();
        List<State> result = new ArrayList<>();

        queue.add(new State(0, 0));

        while (!queue.isEmpty()) {
            State current = queue.poll();
            if (visited.contains(current)) continue;
            visited.add(current);

            if (current.a == z1 && current.b == z2) {
                State state = current;
                while (state != null) {
                    result.add(state);
                    state = path.get(state);
                }
                Collections.reverse(result);
                return result;
            }

            List<State> possibleMoves = Arrays.asList(
                    new State(x, current.b), new State(current.a, y), new State(0, current.b),
                    new State(current.a, 0),
                    new State(current.a - Math.min(current.a, y - current.b), current.b + Math.min(current.a, y - current.b)),
                    new State(current.a + Math.min(current.b, x - current.a), current.b - Math.min(current.b, x - current.a))
            );

            for (State newState : possibleMoves) {
                if (isValidState(newState, visited)) {
                    queue.add(newState);
                    path.put(newState, current);
                }
            }
        }
        return result;
    }

    public static List<State> dfs(int x, int y, int z1, int z2, State current, Set<State> visited, Map<State, State> path) {
        List<State> result = new ArrayList<>();

        if (visited.contains(current)) return result;
        visited.add(current);

        if (current.a == z1 && current.b == z2) {
            State state = current;
            while (state != null) {
                result.add(state);
                state = path.get(state);
            }
            Collections.reverse(result);
            return result;
        }

        List<State> possibleMoves = Arrays.asList(
                new State(x, current.b), new State(current.a, y), new State(0, current.b),
                new State(current.a, 0),
                new State(current.a - Math.min(current.a, y - current.b), current.b + Math.min(current.a, y - current.b)),
                new State(current.a + Math.min(current.b, x - current.a), current.b - Math.min(current.b, x - current.a))
        );

        for (State newState : possibleMoves) {
            if (!visited.contains(newState)) {
                path.put(newState, current);
                List<State> res = dfs(x, y, z1, z2, newState, visited, path);
                if (!res.isEmpty()) return res;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity of first jug (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter capacity of second jug (y): ");
        int y = scanner.nextInt();
        System.out.print("Enter target amount of water for first jug (z1): ");
        int z1 = scanner.nextInt();
        System.out.print("Enter target amount of water for second jug (z2): ");
        int z2 = scanner.nextInt();

        System.out.println("\nBFS Solution:");
        List<State> bfsResult = bfs(x, y, z1, z2);
        if (bfsResult.isEmpty()) {
            System.out.println("No solution found.");
        } else {
            for (State state : bfsResult) {
                System.out.println("(" + state.a + ", " + state.b + ")");
            }
        }

        System.out.println("\nDFS Solution:");
        List<State> dfsResult = dfs(x, y, z1, z2, new State(0, 0), new HashSet<>(), new HashMap<>());
        if (dfsResult.isEmpty()) {
            System.out.println("No solution found.");
        } else {
            for (State state : dfsResult) {
                System.out.println("(" + state.a + ", " + state.b + ")");
            }
        }

        scanner.close();
    }
}
