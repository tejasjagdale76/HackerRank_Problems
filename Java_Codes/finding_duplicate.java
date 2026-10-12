
public class finding_duplicate {

    public static int findDuplicate(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }

            }
        }

        return -1; // No duplicate found
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 3};

        int duplicate = findDuplicate(arr);

        if (duplicate != -1) {
            System.out.println("Duplicate number: " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }
    }
}