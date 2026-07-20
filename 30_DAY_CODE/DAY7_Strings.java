import java.io.*;
import java.util.*;

public class DAY7_Strings{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
        sc.nextLine();
         
        for(int j=1;j<=T;j++)
        {
            String evenString="";
        String oddString="";
        String str=sc.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
            evenString+=str.charAt(i);
            }
            else{
            oddString+=str.charAt(i);
            }
        }
        System.out.println(evenString+" "+oddString);
    }
    }
}
