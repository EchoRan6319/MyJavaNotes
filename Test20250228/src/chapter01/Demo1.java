package chapter01;

//引入 Scanner 类
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
    System.out.println("郑州职业技术学院创建于哪一年？");
        System.out.println("\t1.1975年");
        System.out.println("\t2.1976年");
        System.out.println("\t3.1977年");
        System.out.println("\t4.1978年");
        System.out.println("----------");
        System.out.println("请选择，输入选项前的数字: ");

        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int num = sc.nextInt(); // 读取用户输入的整数值
        switch (num) {
            case 2:
                System.out.println("正确");
                break;
            case 1:
            case 3:
            case 4:
                System.out.println("错误");
                break;

                }
            }
            else {
            System.out.println("请输入正确的内容");
        }
    }
}

