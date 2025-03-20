package chapter01;

class Student {
    String name;        //定义name属性（姓名）
    int sno;            //定义sno属性（学号）
    String gender;      //定义gender属性（性别）
    void speak(){      //无参的方法
        System.out.println(name+"的学习目标是：立志成为一名优秀的Java开发工程师！");
    }
    void speak (String method){    //有参的方法
        System.out.println(name+"希望通过"+method+"的方式成为一名Java开发工程师！");
    }
}

