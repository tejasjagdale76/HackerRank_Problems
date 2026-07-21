import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class DAY11_Binary_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary="";
        while(n>0)
        {
            int reminder=n%2;
            binary=reminder+binary;
            n=n/2;
        }
        int count=0;
        int max=0;
        for(int i=0;i<binary.length();i++)
        {
            
            if(binary.charAt(i)=='1')
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
