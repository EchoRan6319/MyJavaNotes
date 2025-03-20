package chapter01;

class Student1 {
        String name;        //定义name属性（姓名）
        int sno;            //定义sno属性（学号）
        String gender;      //定义gender属性（性别）
        void speak(){  //定义行为（讲话）
            System.out.println(name+"的学习目标是：立志成为一名优秀的Java开发工程师！");
        }
    }
    public class Demo {
        public static void main(String[] args) {
            // TODO 自动生成的方法存根
            Student1 stu1=new Student1();    //创建对象stu1
            Student1 stu2=new Student1();     //创建对象stu2
            stu1.name = "张军";    //为对象stu1的name属性赋值
            stu1.sno = 1001;       //为对象stu2的sno属性赋值
            stu1.gender = "男";    //为对象sut3的gender属性赋值
            stu1.speak();    //调用对象stu1的speak()方法
            stu2.speak();    //调用对象stu2的speak()方法
            new Student1().speak();  //调用匿名对象的speak()方法
        }
    }
