package chapter01;

import java.util.Scanner;

public class Demo4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 输入存款金额
            System.out.print("请输入存款金额（至少1000元）：");
            double principal = scanner.nextDouble();
            if (principal < 1000) {
                System.out.println("存款金额不能少于1000元！");
                return;
            }

            // 输入存期
            System.out.print("请输入存期（1、2、3、5年）：");
            int years = scanner.nextInt();

            // 确定年利率
            double rate;
            switch (years) {
                case 1:
                    rate = 2.25;
                    break;
                case 2:
                    rate = 2.7;
                    break;
                case 3:
                    rate = 3.25;
                    break;
                case 5:
                    rate = 3.6;
                    break;
                default:
                    System.out.println("存期输入错误，请输入1、2、3或5年。");
                    return;
            }

            // 计算本息总额
            double total = principal + principal * (rate / 100) * years;
            System.out.printf("到期本息总额为：%.2f元", total);
        }
}

