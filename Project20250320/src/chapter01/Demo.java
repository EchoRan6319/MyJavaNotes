package chapter01;

public class Demo {
    public static void main(String[] args) {
        //分别创建三个对象p1,p2,p3
        Person p1 = new Person();
        Person p2 = new Person(18);
        Person p3 = new Person("李思思",18);
        //分别调用三个对象的speak()方法
        p1.speak();
        p2.speak();
        p3.speak();
    }
}
