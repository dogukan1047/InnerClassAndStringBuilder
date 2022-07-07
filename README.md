# InnerClassAnd StringBuilder,StringBuffer

## Inner Classes 
<p>Bazen bir sınıfı başka bir sınıfın içinde tanımlayabiliriz, bu tür sınıflara iç sınıf denir.İç sınıf kavramı, Olay İşleme'nin bir parçası olarak GUI hatalarını
düzeltmek için Java sürüm 1.1'de bulunur, ancak iç sınıfın güçlü özelliği nedeniyle geliştirici yavaş yavaş normal programlama uygulamasında kullanmaya başladı.

***Hangi durumda bir iç sınıfa ihtiyacımız var?***<br>
Bir nesne türü olmadan, başka bir nesne türü mevcut değilse, o zaman iç sınıf kavramını kullanmalıyız.
 
4'e ayrılır<br>

1. Normal or Regular inner class
2. Method local inner class.
3. Anonymous inner class.
4. Static Nested class

```1. Normal veya Normal İç sınıf```
Herhangi bir adlandırılmış sınıfı statik bir değiştirici olmadan doğrudan bir sınıfın içinde bildirirsek, bu tür iç sınıfa normal veya normal iç sınıf denir.

```2. Method local inner class.```
Bazen bir yöntemin içinde bir sınıf bildirebiliriz, bu tür bir iç sınıfa Yöntem yerel iç sınıfı denir. yöntemin yerel iç sınıfının temel amacı, yönteme özel bir işlevsellik tanımlamaktır.
yöntem yerel iç sınıf sınıflarına yalnızca yöntem içinde erişebiliriz.
<br>
<br>
```3. Anonymous inner class.```
Bazen iç sınıfı isimsiz olarak bildirebiliriz, bu tür iç sınıflara isimsiz iç sınıf denir.

Yavaşlama ve davranışa dayalı olarak, anonim iç sınıfın üç türü vardır.
1. Bir sınıfı genişleten anonim iç sınıf
2. Bir arabirim uygulaBazen statik bir değiştirici ile bir iç sınıf bildirebiliriz, bu tür iç sınıflara statik iç içe sınıf denir.yan anonim iç sınıf.
3. İç argümanları tanımlayan anonim iç sınıf.<br>

```4. Static Nested class.```
Mevcut dış sınıf nesnesi olmadan normal iç sınıf olması durumunda, bir iç sınıf nesnesi oluşturmak mümkün değildir, ancak mevcut dış sınıf nesnesi olmadan statik iç içe sınıf olması durumunda, iç içe sınıf nesnesinin mevcut olma şansı olabilir.


```STATİK İNNER CLASS NASIL TANIMLANIR```

```public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    //Creating Node as static class which is a helper of LinkedList class
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void printLL() {
        System.out.print("LinkedList is : ");
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + "]-->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node " + newNode.data + " added successfully!");
        printLL();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(null);
        //Creating an object of Node class.
        LinkedList.Node newNode;
        newNode = new LinkedList.Node(10, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(20, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(30, null);
        linkedList.addNode(newNode);
    }
} 
```

```İNNER CLASS NASIL TANIMLANIR```

``` public class DataStructure {

    private static final int SIZE = 10;
    private int arr[] = new int[SIZE];

    private DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = i * 10;
        }
    }

    //Creating Inner class
    private class Printer {
        private void printMultipleOfTen() {
            //accessing outer class variables
            for (int i = 0; i < SIZE; i++) {
                if (arr[i] % 10 == 0) {
                    System.out.printf("arr{%d}=%d ", i, arr[i]);
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        //Creating an object of outer class
        DataStructure ds = new DataStructure();
        //Creating an object of inner class within outer class
        Printer printer = ds.new Printer();
        printer.printMultipleOfTen();
    }
}  
```

##Java'da String,StringBuilder ve StringBuffer nedir

![String vs StringBuffer in Java 2](https://user-images.githubusercontent.com/70372233/177829867-c9173cbf-6d0c-45a0-80c9-25ab8e894536.jpg)

***String Nedir?***

<p>String her şeyden önce bir sınıftır. En basit tanımıyla char dizilerini temsil eder diyebiliriz. String ilkel bir veri tipi değildir. Bir class’tır ve kendine ait özellikler barındırmaktadır.Konumuzla ilgili bir String özelliğinden bahsetmek gerekirse, String’ler immutable’dır. Yani değiştirilemez.Daha net anlaşılır bir örnek vermek gerekirse; bir String değişkenimiz olduğunu düşünün. Belli işlemler yapıyoruz ve her seferinde sonuna + ile elde ettiğimiz diğer verileri ekliyoruz. Yaptığımız bu her + işleminde hafızada yeni bir alan açılmış oluyor. Bu bizim için hem performans kaybı hem de zaman kaybına neden oluyor.Bu durumda ```StringBuffer``` ve ````StringBuilder``` kullanmak işimize yarayacaktır
<br>

***StringBuilder Nedir?***

StringBuilder sınıfı en kısa tanımla bize “mutable” yani değiştirilebilir string elde etmemize olanak tanır. Böylece hafızada her seferinde yeni bir alan açılmadan var olan alan üzerinde değişiklik yapılabilir. Bu da StringBuilder sınıfını hafıza kullanımı olarak String sınıfının önüne geçirir.

StringBuilder thread-safe değildir. Yani synchronized değildir. Thread’li bir işlem kullanılacaksa StringBuilder kullanılması güvenli değildir.

***StringBuffer Nedir?***

<p>StringBuffer ile StringBuilder aynı metodlara sahiptir. Aynı mantıkla ilerler. Aralarındaki tek fark ise StringBuffer thread-safe yani synchronized ‘tır. Bu durum da StringBuffer’ı thread’li işlemlerde kullanılmasını güvenli yapar. Thread’li işlemlerde güvenli olmasının getirdiği bir dezavantaj da mevcuttur. Bu durum StringBuffer’ın StringBuilder’dan daha yavaş çalışmasına neden olur.


![1_r3jfVMjoPZH9s2xXdLZdsw](https://user-images.githubusercontent.com/70372233/177831308-b69532d3-a2c0-41ce-bcc4-a8b70887e50f.png)


