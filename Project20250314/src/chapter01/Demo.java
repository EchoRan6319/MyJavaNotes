package chapter01;

import java.util.Arrays;  // 添加Arrays类导入
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        int[] a = {55, 66, 77, 88, 99};
        Arrays.sort(a);  // 现在可以正确识别Arrays类
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}