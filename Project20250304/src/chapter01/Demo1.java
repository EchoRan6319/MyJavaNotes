package chapter01;

public class Demo1 {
        //使用while循环结构实现打印10份试卷。
            public static void main(String[] args) {
                int count = 1;
                while(count <= 10){
                    System.out.println("打印第" +count+ "份试卷");
                    count++;
                }
            }
}
