package xingshou;
import java.util.Scanner;


public class Scanner_next {

    public static void main(String[] args) {

        System.out.println("hello wold");
        //创建一个扫描对象，用于接收键盘数据
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入：");
        //判断用户有没有输入字符串
        if (scanner.hasNextLine()) {
            //使用next方式接收
            String str = scanner.nextLine();
            System.out.println("输入内容为：" + str);
            //凡是属于IO流的类必须关闭
            scanner.close();
        }

    }
}
