import java.util.Scanner;

/**
 * 作者:Whale Fall 001
 * 2022/9/10
 */
/*小朋友搬桌子;
年龄大于七岁可以搬桌子;
年龄大于五岁,性别男,可以搬桌子;
年龄小于五岁,提示:你还太小了,不可以搬桌子;*/

public class TeseOpen06 {
    public static void main(String[] args){
        //定义年龄
        int age;
        //定义性别
        char sex;
        //获取年龄,性别
        System.out.println("请输入你的年龄");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        //进行判断
        if(age>=7){
            System.out.println("可以搬桌子");
        }
        else if(age>5){
            System.out.println("请输入你的性别  男    女");
//            Scanner sc1=new Scanner(System.in);
//            sex=sc.nextInt();
            String str=sc.next();
            sex=str.charAt(0);
            if(sex=='男'){
                System.out.println("你可以搬桌子");
            }
            else {
                System.out.println("你年龄太小了,不可以搬桌");
            }
        }
    }
}