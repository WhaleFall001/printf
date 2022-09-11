/**
 * 作者:Whale Fall 001
 * 2022/9/11
 */
//实现数字1+2+3+4+5
public class TestOpen08 {
    public static void main(String[] args){
        int num=1;
        int sum=0;
        while (num<=5){
            sum+=num;
            num++;
        }
        System.out.println(sum);
    }
}
