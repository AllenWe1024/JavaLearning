public class ArraySort { //冒泡排序，实现数组从小到大排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } //打印数组的元素

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArraySort tools = new ArraySort();
        int[] nums = {4, 3, 1, 6, 7};
        System.out.println("排序之前：");
        tools.print(nums);
        tools.sort(nums);//对nums数组进行排序
        System.out.println("排序之后：");
        tools.print(nums);//输出nums数组的元素
    }
}