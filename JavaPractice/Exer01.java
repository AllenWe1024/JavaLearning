import org.junit.Test;

public class Exer01 {

    //编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
    public static <E> void method( E[] arr,int a,int b){
        E temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    @Test
    public void testMethod(){
        Integer[] arr = new Integer[] {10,20,30,40};
        method(arr,2,3);

        for(Integer i : arr){
            System.out.println(i);
        }
    }
}