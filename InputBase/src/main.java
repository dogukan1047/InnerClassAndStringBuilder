import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please birth day input");
        int birthDay= scanner.nextInt();
        System.out.println("Please name input");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println(name+"  "+birthDay);
     //Buradaki temel sorun "/n" dir nextInt den sonra scanner.nextLine(); tanımlamayı gerektirir

    }
}
