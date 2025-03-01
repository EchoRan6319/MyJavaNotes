package chapter01;

import java.util.Scanner;

public class Demo3Fix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 获取三个整数输入
        System.out.print("请输入一个整数: ");
        int a = input.nextInt();
        System.out.print("请输入一个整数: ");
        int b = input.nextInt();
        System.out.print("请输入一个整数: ");
        int c = input.nextInt();

        // 直接对比
        int min = a;  // 步骤1：先假设第一个数是最小值
        if (b < min) { // 步骤2：如果第二个数更小，更新最小值
            min = b;
        }
        if (c < min) { // 步骤3：如果第三个数更小，更新最小值
            min = c;
        }
            System.out.println("最小值是" + min);
    }
}