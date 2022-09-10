import java.util.Scanner;

/**
 * 作者:Whale Fall 001
 * 2022/9/10
 */
public class TestOpen02 {
    public static void main(String[] args){
        //男孩女孩选择吃什么
        Scanner sc=new Scanner(System.in);
              System.out.println("请男孩选择今晚吃什么:  1.火锅 2.烧烤 3.麻辣烫 4.西餐");
              int a=sc.nextInt();
              System.out.println("请女孩选择今晚吃什么:  1.火锅 2.烧烤 3.麻辣烫 4.西餐");
              int b=sc.nextInt();
              //通过三目运算符实现,也可以通过if  else语句实现
           System.out.println(a==b?"听男孩的":"听女孩的");
    }
}
