public class L209 {
    public int minSubArrayLen(int target, int[] nums) {
        int index1 = 0;
        int index2 = 0;
        int sum = 0;
        int subLength = 0;
        int results = Integer.MAX_VALUE;
        for (; index2 < nums.length; index2++) {
            sum += nums[index2];
            while (sum >= target) {
                subLength = index2 - index1 + 1;
                results = Math.min(results, subLength);
                sum -= nums[index1];
                index1++;

            }
        }
    return results==Integer.MAX_VALUE?0:results;

    }


    public static void main(String[] arg) {
        int[] a1 = {1, 2, 3, 4, 5};
        L209 s1 = new L209();
        int b = s1.minSubArrayLen(12, a1);
        System.out.println(b);
    }
}
