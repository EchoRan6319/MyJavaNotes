package chapter02;

class QQ {
    long number;
    public QQ(long number) {
        this.number = number;
    }
    public static void systemMessage() {
        System.out.println("网络聊天，文明用语");
    }
    public String getMessage() {
        return "QQ号码是："+number;
    }
}
