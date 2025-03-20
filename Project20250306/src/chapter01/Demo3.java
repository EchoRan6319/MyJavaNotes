package chapter01;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int score;
        int sum = 0;
        int avg;
        boolean inNegative = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入学生姓名：");
        String name = sc.next();
        for(int i=0;i<5;i++) {
            System.out.print("请输入第"+(i+1)+"门课的成绩：");
            score = sc.nextInt();
            if(score < 0) {
                inNegative = true;
                break;
            }
            sum = sum + score;
        }
        if(inNegative) {
            System.out.println("抱歉，分数输入错误，请重新进行输入");
        }else{
            avg = sum/5;
            System.out.println(name + "的平均分是："+ avg);
        }
    }
}
