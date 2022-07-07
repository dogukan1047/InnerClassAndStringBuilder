public class Main {
    public static void main(String[] args) {
        String namePol = "Dogukan";
        String surName = " Polatel";
        String result = "Fasas";
        // System.out.println("Name:"+name);
        //String name="Dogukan"; burada da görüldüğü gibi string sınıfı immutable bir sınıftır
    /*    if (name.equals(surName)) {
            System.out.println("True");
        }else{

            System.out.println("false");
        }
        */
        BufferAndBuilder bufferAndBuilder = new BufferAndBuilder("Dogukan", "Polatel", 15);
        System.out.println(bufferAndBuilder);
        namePol = namePol.concat(surName);//string birleştirme işlemi yapar
        System.out.println(namePol);
    /*    System.out.println(result.compareTo(surName));
        System.out.println("Lenght:"+result.length());
        System.out.println("Where:"+result.charAt(1));//birinci indexte ne var
        System.out.println("Lower:"+namePol.toLowerCase());
        System.out.println("Space:"+surName.trim());
*/
        StringBuffer stringBuffer = new StringBuffer("Change veraible");
        stringBuffer.append(" " + 10);//sona ekler
        System.out.println(stringBuffer);
        int capacity = stringBuffer.capacity();
        System.out.println(capacity);
        stringBuffer.insert(2, "aa");
        System.out.println(stringBuffer);
//        stringBuffer.replace(1,4,"degis");
//        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}
