import java.util.Calendar;
import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year!");
        int year = input.nextInt();
        System.out.println("Enter a month!");
        int month = input.nextInt();
//打印一个月的日历，如果要打印一年的话，使用循环从第一个月开始就行。
        printMonth(year, month);
//关闭接口，养成好习惯
        input.close();
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.err.println("\t" + getMonthName(month) + "\t" + year);
        System.out.println("---------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
    }

    public static String getMonthName(int month) { //获取月份名称,这里采取英文的
        if (month > 12 || month < 1) { //非法输入检测
            System.err.println("错误的月份！");
            System.exit(0);
        }
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "";
    }

    public static int[] getMonthDays(int year, int month) {
        int[] days = {0, 0};
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);//月份从0开始
        cal.set(Calendar.DAY_OF_MONTH, 1);
        days[0] = cal.get(Calendar.DAY_OF_WEEK);
        cal.roll(Calendar.DAY_OF_MONTH, -1);//最后一天
        days[1] = cal.get(Calendar.DAY_OF_MONTH);
        return days;
    }

    public static void printMonthBody(int year, int month) {
        Calendar cal = Calendar.getInstance();
        int[] days = getMonthDays(year, month);
        int startDay = days[0] - 1;//startDay从1开始，打印要从0开始
        int numberOfDaysInMonth = days[1];
        int i = 0;
        for (i = 0; i < startDay; i++) {
            System.out.printf("\t");
        }
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%d\t", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println("\n---------------------------------------------");
    }
}