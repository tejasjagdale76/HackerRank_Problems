import java.io.*;
import java.util.*;

public class DAY28_DATABASE {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        List<String> gmailUsers = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            String[] input = bufferedReader.readLine().split(" ");

            String firstName = input[0];
            String emailID = input[1];

            if (emailID.endsWith("@gmail.com")) {
                gmailUsers.add(firstName);
            }
        }

        Collections.sort(gmailUsers);

        for (String name : gmailUsers) {
            System.out.println(name);
        }

        bufferedReader.close();
    }
}
