package chapter01;

public class Demo3 {
    //用do-while循环实现1+2+3+...+100的求和计算
    public static void main(String[] args) {
                int sum=0;
                int i=1;
                do {
                    sum=sum+i;
                    i++;
                }while(i<=100);
                System.out.println("sum="+sum);

    }
}
