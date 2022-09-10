/**
 * 作者:Whale Fall 001
 * 2022/9/10
 */
public class Exchange {
    public static void main(String[] arges){
        //首先定义两个整形
        int num1=10;
        int num2=20;
        System.out.println("交换前的数值为"+num1+"   "+num2);
        //int num3=num1;
        //通过引入新的int整形来实现交换目的
        //num1=num2;
        //num2=num3;
        //也可以通过另一种方法(method)
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("交换后的数值为"+num1+"   "+num2);
    }
}
