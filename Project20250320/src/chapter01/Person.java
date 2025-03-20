package chapter01;

public class Person {
    String name;
    int age;
    //定义一个无参的构造方法
    public Person() {
        System.out.println("我是无参的构造方法！");
    }
    //定义一个有参的构造方法
    public Person(int a) {
        age = a;
    }
    //定义一个有两个参数的构造方法
    public Person(String p_name,int p_age) {
        name = p_name;
        age = p_age;
    }
    //定义一个成员变量
    void speak() {
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了！");
    }
}
