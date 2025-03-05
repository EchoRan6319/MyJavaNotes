package chapter01;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int money1 =7988-1500;
    double money2 =7988*0.8;
    if (money1 > money2) {
        System.out.printf("不要以旧换新");
    }
    else {
        System.out.println("要以旧换新");
    }
    }
}
