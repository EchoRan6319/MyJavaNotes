package chapter01;

public class Demo {
    public static void main(String[] args) {
        //1.循环开始是1949 结束是2019
        for (int year = 1949; year <= 2019; year++) {
            //2.如果年份和2019年的差值是12的倍数 则说明是猪年
            if ((2019 - year) % 12 == 0) {
                //3.打印符合条件的年份
                System.out.println(year);
            }
        }
    }
}