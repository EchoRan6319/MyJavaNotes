package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5位学生的成绩：");
        for (int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        Arrays.sort(scores);
        System.out.println("学生成绩按升序排列：");
        for (int i = 0; i < scores.length; i++){
            System.out.print(scores[i]+" ");
        }
    }
}
