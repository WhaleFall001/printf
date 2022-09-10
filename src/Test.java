/**
 * 作者:Whale Fall 001
 * 2022/9/9
 */
public class Test {
    public static void main(String[] args) {
        Test test =new Test();
        int intVal=9;
        BirthDate d1=
        new BirthDate(7,7,197);
        BirthDate d2=
                new BirthDate(1,1,2000);
        test.change1(intVal);
        test.change2(d1);
        test.change3(d2);
    }
    public void change1(int i){
        i=1234;
    }
    public void change2(BirthDate b){
        b=new BirthDate(22,2,2004);
    }
    public void change3(BirthDate b){
        b.setDay(22);
    }
}
