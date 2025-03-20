package chapter02;

public class Demo {
    public static void main(String[] args) {
        QQ.systemMessage();
        QQ q = new QQ(148973422);
        q. systemMessage();
        System.out.println(q.getMessage());
    }
}
