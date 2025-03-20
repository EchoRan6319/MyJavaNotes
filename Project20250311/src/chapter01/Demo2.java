package chapter01;

public class Demo2 {
    public static void main(String[] args) {
        //1.外层循环代表5行
        for (int i = 0; i < 5; i++) {
            //2.内层循环代表每行打印i+1个
            for (int j = 0; j <= i; j++) {
                //3.打印每个@
                System.out.print("@");
            }
            //4.每行结尾执行换行操作
            System.out.println();
        }
    }
}