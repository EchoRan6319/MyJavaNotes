package chapter01;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //int a = 7;
        //int b = 2;
        //int c = a%b;
        //System.out.println(c);
        //取余必须是整数类型

        //int m = 10;
        //int n= ++m;
        //赋值运算，++在前边，所以是使用m自增后的值赋值给n,m 本身自增 1
        //System.out.println("m:"+m+",m"+m);
        //m:11,m:11

        /*
        int a= 7;
        a+=10;
        System.out.println(a);
        */

        /*
        int a= 7;
        a-=10;
        System.out.println(a);
        */

        /*
        int a= 7;
        a*=10;
        System.out.println(a);
         */


        /*
        int a= 7;
        a/=10;
        System.out.println(a);
        */

        /*
        int a= 7;
        a-=10;
        System.out.println(a);
         */

        /*int a = 10;
        int b = 20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);

        boolean flag = a > b;
        System.out.println(flag);

        */


        /*
        int i = 10;
        int j = 20;
        int k = 30;

        System.out.println((i > j) & (i > k));
        System.out.println((i < j) & (i > k));
        System.out.println((i > j) & (i < k));
        System.out.println((i < j) & (i < k));
        System.out.println("------");

        System.out.println((i > j) | (i > k));
        System.out.println((i < j) | (i > k));
        System.out.println((i > j) | (i < k));
        System.out.println((i < j) | (i < k));
        System.out.println("------");

        System.out.println((i > j) ^ (i > k));
        System.out.println((i < j) ^ (i > k));
        System.out.println((i > j) ^ (i < k));
        System.out.println((i < j) ^ (i < k));
        System.out.println("------");

        */

        /*int a= 10;
        int b= 20;
        int c= a>b ? a:b;
        System.out.println(c);
         */

        //数据输入+计算圆的面积
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double PI = 3.14;
        double p = PI*2*r;
        System.out.println(p);
    }

}
