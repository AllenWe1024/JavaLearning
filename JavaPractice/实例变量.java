public class 实例变量 {
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public 实例变量 (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args){
        实例变量 empOne = new 实例变量("RUNOOB");
        empOne.setSalary(1000.0);
        empOne.printEmp();
    }
}
