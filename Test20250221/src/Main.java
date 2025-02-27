public class Main {
    public static void main(String[] args) {
        final double PI=3.14;
        int r=5;
        double p=PI*r*2;
        double s=PI*r*r;
        //System.out.println("圆的周长是"+p);
        //System.out.println("圆的面积是"+s);
        //这两行是分别输出
        System.out.println("圆的周长是"+p+"\n"+"圆的面积是"+s);
        //这是一次性输出，中间以逗号隔开，\n可以换行
        //以下是这节课学的东西
        //强制类型转换
        //int a=(int)10.8;
        //System.out.println(a);

    }
}