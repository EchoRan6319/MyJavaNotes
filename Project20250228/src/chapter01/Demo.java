// 导入必要的类库
package chapter01;

//引入 Scanner 类
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 提示用户输入一个两位数字（实际代码允许输入更多位数）
        System.out.println("请输入一个两位数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 读取用户输入的整数值

        // 根据数值的十位数部分进行等级判定
        switch(num/10){ // 通过除以10取整数部分，获取十位数的值
            case 10:    // 处理100分的情况（当输入为100时，num/10=10）
            case 9:     // 90-99分（或100分）的情况
                System.out.println("A级");
                break;  // 跳出switch语句
            case 8:     // 80-89分的情况
                System.out.println("B级");
                break;
            case 7:     // 70-79分的情况
                System.out.println("C级");
                break;
            case 6:     // 60-69分的情况
                System.out.println("D级");
                break;
            default:    // 60分以下的所有情况
                System.out.println("E级");
                break;
        }
    }
}