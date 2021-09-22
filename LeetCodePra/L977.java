public class L977 {
    public int[] sortedSquares(int[] nums) {
        int s1 = 0;
        int s2 = nums.length - 1;
        int[] results = new int[nums.length];
        int index = nums.length - 1;
        while (s1 <= s2) {
            if (nums[s1] * nums[s1] > nums[s2] * nums[s2]) {
                results[index] = nums[s1] * nums[s1];
                index--;
                s1++;
            } else {
                results[index] = nums[s2] * nums[s2];
                index--;
                s2--;
            }

        }
        return results;
    }


    public static void main(String[] arg) {
        int[] a1 = {1, 2, 3, 4, 5};
        L27 s1 = new L27();
        int b = s1.removeElement(a1, 3);
        System.out.println(b);
    }
}
