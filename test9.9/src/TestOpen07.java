import java.util.Scanner;

/**
 * 作者:Whale Fall 001
 * 2022/9/11
 */
/*根据学生的分数,判断学生的等级
>=90   A
>=80   B
>=70   C
>=60   D
<60    E*/
public class TestOpen07 {
   public static void main(String[] args){
       int score;
       Scanner sc=new Scanner(System.in);
       score=sc.nextInt();
       switch (score/10){
           case 10:System.out.println("A");
           break;
           case 9:System.out.println("A");
           break;
           case 8:System.out.println("B");
           break;
           case 7:System.out.println("C");
           break;
           case 6:System.out.println("D");
           break;
           case 5:System.out.println("E");
           break;
           case 4:System.out.println("E");
           break;
           case 3:System.out.println("E");
           break;
           case 2:System.out.println("E");
           break;
           case 1:System.out.println("E");
           break;
           case 0:System.out.println("E");
           break;
           default:System.out.println("你输入的成绩错误");
       }
   }
}
