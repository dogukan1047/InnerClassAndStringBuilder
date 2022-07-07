public class Static {
private int result=8;
    static class inner1{
        int result=4;

        public void ResultD(){

            System.out.println(result);
            System.out.println(this.result);

        }


    }

}
