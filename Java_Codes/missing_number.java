public class missing_number {
 public static void main(String[]arg){

    int arr[]={1,2,3,5,6};
    int n=6;
    int expected_sum=(n*(n+1))/2;
    int sum=0;

    for(int i=0;i<arr.length;i++)
    {

        sum=sum+arr[i];
    }

    int missing_value=expected_sum-sum;
    System.out.println(missing_value);
 }   
}
