// public class GetClassObject {
//     ClassLoader cl = this.getClass().getClassLoader();
//     Class clazz4 = cl.loadClass("类的全类名");
//
//     public GetClassObject() throws ClassNotFoundException {
//     }
//
//     @Test
//     public void test01() throws ClassNotFoundException{
//         Class c1 = GetClassObject.class;
//         GetClassObject obj = new GetClassObject();
//         Class c2 = obj.getClass();
//         Class c3 = Class.forName("com.atguigu.classtype.GetClassObject");
//         // Class c4 = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.classtype.GetClassObject");
//
//         System.out.println("c1 = " + c1);
//         System.out.println("c2 = " + c2);
//         System.out.println("c3 = " + c3);
//         // System.out.println("c4 = " + c4);
//
//         System.out.println(c1 == c2);
//         System.out.println(c1 == c3);
//         // System.out.println(c1 == c4);
//     }
// }