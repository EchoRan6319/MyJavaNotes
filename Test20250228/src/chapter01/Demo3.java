package chapter01;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int a=input.nextInt();
        System.out.print("请输入一个整数: ");
        int b=input.nextInt();
        System.out.print("请输入一个整数: ");
        int c=input.nextInt();

        int min;

        if(a<=b&&a<=c){
            min=a;
        }else if(b<=a&&b<=c){
            min=b;
        }else{
            min=c;
        }System.out.println("最小值是"+min);
    }
}
