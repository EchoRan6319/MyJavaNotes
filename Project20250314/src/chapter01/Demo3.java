package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
    int []a = new int[6];
    Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
        System.out.println("请输入第"+(i+1)+"个学生成绩");
        a[i]= sc.nextInt();
    }
			Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
        System.out.print(a[i]+"\t");
        }
    }
}