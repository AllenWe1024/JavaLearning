public class L27 {
    public int removeElement(int[] nums, int val) {
        int fastIndex=0;
        int slowIndex=0;
        for(;fastIndex<nums.length;fastIndex++){
            if(val!=nums[fastIndex]){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }
    public static void main(String[] arg) {
        int[] a1 = {1, 2, 3, 4, 5};
        L27 s1 = new L27();
        int b = s1.removeElement(a1, 3);
        System.out.println(b);
    }
}


