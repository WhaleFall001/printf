import java.util.Scanner;

/**
 * 作者:Whale Fall 001
 * 2022/9/9
 */
import java.util.Scanner;
public class Test1 {
    public static void main(String[]  args){
        //求圆的周长与面积
        //求周长
        //定义半径,提取变量
        final double pi=3.14;
        int r;
        System.out.println("请输入圆的半径");
        //从键盘获得圆的半径
        Scanner sc=new Scanner(System.in);
         r=sc.nextInt();
        double c =2*pi*r;
        double s=2*pi*r*r;
        System.out.println("圆的面积为"+s);
        System.out.println("圆的周长"+c);
    }
}
