import java.util.Scanner;

/**
 * 作者:Whale Fall 001
 * 2022/9/9
 */
public class TestOpen01 {
    public static void main(String[] args){
         //任意给出一个四位数
          int num;
          //从键盘获取一个四位数
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         //输出千位数
        int num1;
        num1=num/1000;
         //输出百位
        int num2;
        num2=num/100;
        num2=num2%10;
        //输出十位
        int num3;
        num3=num%100;
        num3=num3/10;
        //输出个位
        int num4;
        num4=num%10;
        System.out.println("四位数的千位是"+num1+"四位数的百位是"+num2+
                "四位数的十位是"+num3+"四位数的十位是"+num4);
    }
}
