package chapter01;

import java.util.Scanner;

public class Demo2 {
    //实例7：循环嵌套实现抽奖程序
    public static void main(String[] args) {
        int in;
        System.out.println("请输入数字（0-9）抽取大奖！");
        System.out.println("温馨提示：输入非数字键后可退出该程序！");
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt()) {  //循环判断控制台输入的字符是否为数字
            in=input.nextInt();
            switch(in) {
                case 0:System.out.println("恭喜您获得大奖，汽车一辆！");break;
                case 2:System.out.println("恭喜恭喜,您获得笔记本电脑一台！");break;
                case 5:System.out.println("来了您不用走路回去，送您自行车一辆！");break;
                default:System.out.println("谢谢您的参与，欢迎下次再来！");break;
            }
        }
        System.out.println("感谢您参与抽奖活动！");
    }
}
