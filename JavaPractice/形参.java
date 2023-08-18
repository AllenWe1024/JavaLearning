public class 形参 {

    public void swap(MyData my) {
        my = new MyData(); //考虑堆空间此新创建的对象，和main中的data对象是否有关
        int temp = my.x;
        my.x = my.y;
        my.y = temp;
    }

    public static void main(String[] args) {
        形参 tools = new 形参();
        MyData data = new MyData();
        data.x = 1;
        data.y = 2;
        System.out.println("交换之前：x = " + data.x + ",y = " + data.y);
        tools.swap(data);//调用完之后，x与y的值交换？
        System.out.println("交换之后：x = " + data.x + ",y = " + data.y);//
    }

}

class MyData {
    int x;
    int y;
}
