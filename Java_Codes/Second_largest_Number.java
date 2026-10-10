public class Second_largest_Number{
     static void main(String []arg){

int arr[]={10,4,7,9,1};
int max=arr[0];
int second_largest=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++) 
        {
        if(max<arr[i])
        {
          second_largest=max;
            max=arr[i];

        }
        else if(arr[i]>second_largest && arr[i]<max)
        {
          second_largest=arr[i];
        }
     }

     System.out.println(max);
          System.out.println(second_largest);


}
}