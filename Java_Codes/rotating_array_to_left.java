public class rotating_array_to_left {
    public static void main(String[]arg){
    int[] arr = {10, 20, 30, 40, 50};

int temp = arr[0];

for (int i = 0; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}

arr[arr.length - 1] = temp;

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}    
    }
}
