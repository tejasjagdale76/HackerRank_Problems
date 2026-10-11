public class zeros_At_end {
    public static void main(String [] arg){    int arr[]={1,0,3,6,0,5};
    int j=0;
    for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }

        }
    while(j<arr.length){
        arr[j]=0;
        j++;
    }
    for(int i:arr){
        System.out.print(i+" ");
    }
}
}
