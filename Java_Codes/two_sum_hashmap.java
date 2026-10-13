
import java.util.HashMap;

class two_sum_hashmap{
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 8};
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                System.out.println("[" + map.get(needed) + ", " + i + "]");
                return;
            }

            map.put(nums[i], i);
        }
    }
}
