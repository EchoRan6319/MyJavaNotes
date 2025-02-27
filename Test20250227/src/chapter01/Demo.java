package chapter01;

import java.util.Scanner;

public class Demo {
    /*以下是直接判断num=85时的情况
    public static void main(String[] args) {
        int num=85;
        if(num<=100&&num>=90){
            System.out.println("A级");
        } else if (num>=80) {
            System.out.println("B级");
        } else if (num>=70) {
            System.out.println("C级");
        } else if (num>=60) {
            System.out.println("D级");
        }else {
            System.out.println("E级");
        }
    }
}*/

    /*以下是自己输入一个值进行判断
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=100&&num>=90){
            System.out.println("A级");
        } else if (num>=80) {
            System.out.println("B级");
        } else if (num>=70) {
            System.out.println("C级");
        } else if (num>=60) {
            System.out.println("D级");
        }else {
            System.out.println("E级");
        }
    }
}*/

    /*以下是判断会员卡号四位相加是否等于16的程序
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 10 % 10;
        int b = num / 10 % 10;
        int c = num % 100 % 10;
        int d = num / 1000;
        int sum = a + b + c + d;
        if (sum == 16) {
            System.out.println("你的会员卡号是："+num+"恭喜您中奖了");
        } else {
            System.out.println("你的会员卡号是："+num+"感谢参与");
        }
    }
}*/
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入一个分数: ");
    int score = sc.nextInt();
        if(score<=100&&score>=95){
            System.out.println("自行车一辆");
        } else if (score>=90) {
            System.out.println("游乐场玩一次");
        } else if (score>=80) {
            System.out.println("玩具一个");
        }else {
            System.out.println("揍一顿");
        }
    }
}

