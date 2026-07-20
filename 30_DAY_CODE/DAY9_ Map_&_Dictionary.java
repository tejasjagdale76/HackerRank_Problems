import java.util.*;

class DAY9_ Map_&_Dictionary.java{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int n = in.nextInt();

        // Input phone book
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }

        // Process queries (until input ends)
        while (in.hasNext()) {
            String s = in.next();

            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
