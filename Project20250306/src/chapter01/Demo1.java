package chapter01;

public class Demo1 {
    //实例6：打印输出所有的水仙花数。所谓水仙花数，是指一个3位数，且它的每位上的数字的3次幂之和等于它本身。
    public static void main(String[] args) {
        int a,b,c,sum;  //用a,b,c分别来存放百位数，十位数，个位数
        for(int i=100;i<=999;i++) {
            a=i%10;
            b=i/10%10;
            c=i/10/10;
            sum=a*a*a+b*b*b+c*c*c;
            if(i==sum) {
                System.out.println(i);
            }
        }
    }
}