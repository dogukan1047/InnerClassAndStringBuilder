public class NonStatic {

    private int result=10;

     class inner{
    int result=4;

    public void resultBy(){
        System.out.println(result);
        System.out.println(this.result);
        NonStatic nonStatic=new NonStatic();
        System.out.println(nonStatic.result);
    }

    }


}
