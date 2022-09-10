import java.util.Scanner;
import java.util.Stack;

/**
 * 作者:Whale Fall 001
 * 2022/9/10
 */
/*购物,根据不同积分享受不同折扣
x>=8000     60%
 4000=<x<8000  70%
2000=<x<=4000  80%
x<2000         90%
本题中输入积分为4500
折扣输出显示为70%*/
public class TestOpen04 {
    public static void main(String[] args){
        //定义一个变量,存取积分
        int integral;
        //从键盘中获取积分
        Scanner sc=new Scanner(System.in);
        integral=sc.nextInt();
        String discount="";
        if(sc.hasNextInt()==true){
            System.out.println("请输入积分");
            if(integral>=8000){
//                System.out.println("本次购物享受折扣为六折");
                discount="0.6";
            } else if (integral>=4000&&integral<8000) {
//                System.out.println("本次购物享受折扣为七折");
                discount="0.7";
            } else if (integral>=2000&&integral<=4000) {
//                System.out.println("本次购物享受折扣为八折");
                discount="0.8";
            }
            else{
                discount="0.9";
//                System.out.println("本次购物享受折扣为九折");
            }
        }
        else{
            System.out.println("你录入的积分不是整数");
        }
        System.out.println("本次购物的折扣为"+discount);
    }
}
