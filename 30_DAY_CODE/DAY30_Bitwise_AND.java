import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static int bitwiseAnd(int N, int K) {

        int max = 0;

        for (int i = 1; i <= N; i++) {

            for (int j = i + 1; j <= N; j++) {

                int value = i & j;

                if (value < K && value > max) {
                    max = value;
                }
            }
        }

        return max;
    }
}

public class DAY30_Bitwise_AND {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] input = bufferedReader.readLine().split(" ");

                int N = Integer.parseInt(input[0]);
                int K = Integer.parseInt(input[1]);

                int result = Result.bitwiseAnd(N, K);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
