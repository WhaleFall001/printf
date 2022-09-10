import java.util.Scanner;

/**
 * 作者:Whale Fall 001
 * 2022/9/10
 */
public class TestOpen03 {
    public static  void main(String[] args) {
        //利用函数生成随机数
        //达到中奖随机效果
        int num1=(int)(Math.random()*6);
        int num2=(int)(Math.random()*6);
        int num3=(int)(Math.random()*6);
      /*System.out.println("请输入1~5之间的数字:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int num2=sc.nextInt();
        Scanner sc2=new Scanner(System.in);
        int num3=sc.nextInt();*/
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        System.out.println("几个数字的和为" + sum);
        //多次利用if循环达到目的
       /* if (sum >= 14){
            System.out.println("获得的奖项为一等奖");
        }
        if(sum>=10&&sum<14){
            System.out.println("获得的奖项为二等奖");
        }
        if(sum>=6&&sum<10){
            System.out.println("获得的奖项为三等奖");
        }
        if(sum>0&&sum<6){>
            System.out.println("获得的奖项为四等奖");*/
        if(sum>14){
            System.out.println("获得的奖项为一等奖");
        } else if(sum>=10&&sum<14){
            System.out.println("获得的奖项为二等奖");
         } else if (sum>=6&&sum<10) {
            System.out.println("获得的奖项为三等奖");
        }
        else{
            System.out.println("获得的奖项为四等奖");
            }
         }
      }

