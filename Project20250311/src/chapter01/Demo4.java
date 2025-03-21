package chapter01;

public class Demo4 {
    public static void main(String[] args) {
        //1.定义桶中已有的水量开始是0L;
        int currentWater = 0;
        //2.定义变量代表分钟数
        int minute = 0;
        //3.循环判断
        while(currentWater < 10){
            //3.1每次循环给分钟数加1
            minute++;
            //3.2每分钟计算桶里的水量
            int inflow = minute;
            int outflow = 3;
            currentWater += inflow - outflow;
            //3.3桶里的水不可能是负数
            if(currentWater < 0){
                currentWater = 0;
            }
        }
        //4.打印所用分钟数
        System.out.println(minute);
    }
}