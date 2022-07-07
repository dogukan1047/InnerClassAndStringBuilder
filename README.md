# InnerClassAndStringBuilder

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

```
class OuterClass {
    class InnerClass {
        public void m1() {
            System.out.println("Inner class m1 method");
        }
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i1 = o.new InnerClass();
        i1.m1(); // 1st way to function call
        OuterClass.InnerClass i2 = new OuterClass().new InnerClass();
        i2.m1();// 2nt way to function call
        new OuterClass().new InnerClass().m1(); // 3rd way to function call
        System.out.println("Outer class main method");
    }
}

Output :- 
Inner class m1 method
Inner class m1 method
Inner class m1 method
Outer class main method ```
