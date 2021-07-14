package util.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 创建人： 19697
 * 创建时间： 2019/10/26
 * 作用：
 * 修改信息：
 */
public class TestSystem {

    public static void main(String[] args) {


        try {

            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");

            System.setOut(ps);
            int age = 11;
            System.out.println("年龄变量成功定义，初始值为11");
            String sex = "女";
            System.out.println("年龄变量成功定义，初始值为女");
            // 整合2个变量
            String info = "这是个" + sex + "孩子，应该有" + age + "岁了";
            System.setOut(out);
            System.out.println("程序运行完毕，请查看日志");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }


}
