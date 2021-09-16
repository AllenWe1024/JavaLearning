public class 局部变量 {
    public class test2{//第二层嵌套
        public void a1(){
            String str1 = "111111";
        }
    }

        public void pupAge() {
            int age = 0;
            age = age + 7;
            System.out.println("小狗的年龄是: " + age);
        }

        public static void main(String[] args) {
            局部变量 test1 = new 局部变量();
            局部变量.test2 t1 = new 局部变量().new test2();

            test1.pupAge();
        }

}
