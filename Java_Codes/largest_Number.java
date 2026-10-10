public class largest_Number{
     static void main(String []arg){

int arr[]={2,4,7,9,1};
int max=arr[0];
for(int i=0;i<arr.length;i++) 
        {
        if(max<arr[i])
        {
            max=arr[i];
        }
     }

     System.out.println(max);

}
}