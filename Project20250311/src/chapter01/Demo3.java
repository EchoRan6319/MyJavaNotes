package chapter01;

public class Demo3 {
    public static void main(String[] args) {
        //1. 定义对年份的循环
        for (int year = 1988; year <= 2019; year++) {
            //2. 判断当年是否符合闰年条件
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println(year + "是闰年");
            }
        }
    }
}
