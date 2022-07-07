public class Main {

    public static void main(String[] args) {
        NonStatic nonStatic=new NonStatic();
        NonStatic.inner I1=nonStatic.new inner();
        I1.resultBy();
       Static.inner1 I2=new Static.inner1();
       I2.ResultD();

    }
}
