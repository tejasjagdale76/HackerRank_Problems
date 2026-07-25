import java.util.*;

public class DAY26_Time_Complexity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {

            int j = sc.nextInt();

            if (j == 1) {
                System.out.println("Not prime");
                continue;
            }

            boolean prime = true;

            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}
