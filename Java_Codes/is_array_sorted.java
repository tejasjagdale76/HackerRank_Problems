public class is_array_sorted {
    public static void main(String[] args) {
        
    
    int arr[] = {1,3,2,4,5};
boolean sorted = true;

for (int i = 1; i < arr.length; i++) {
    if (arr[i]<arr[i-1]) {
        sorted = false;
        break;
    }
}

System.out.println(sorted ? "Sorted" : "Not Sorted");
}
}
