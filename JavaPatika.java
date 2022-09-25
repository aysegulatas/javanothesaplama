import java.util.Scanner;
public class JavaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int mat, fiz, kim, turk, tar, muz, ort,not1, not2;
        System.out.println("matematik notunuzu giriniz :");
        mat=input.nextInt();

        System.out.println("fizik notunuzu giriniz :");
        fiz=input.nextInt();

        System.out.println("kimya notunuzu giriniz :");
        kim=input.nextInt();

        System.out.println("türkçe notunuzu giriniz :");
        turk=input.nextInt();

        System.out.println("tarih notunuzu giriniz :");
        tar=input.nextInt();

        System.out.println("müzik notunuzu giriniz :");
        muz=input.nextInt();

        ort=(mat+fiz+kim+turk+tar+muz)/6;
        System.out.println("cevap :" +ort);

        not1=60;
        not2=59;
        boolean kosul1 =ort==not1;
        boolean kosul2= ort>=not1;
        boolean sonuc= kosul1 || kosul2;
        System.out.println("geçti:" +sonuc);
        boolean kosul3= ort==not2;
        boolean kosul4= ort<=not2;
        boolean sonuc2= kosul3 || kosul4;
        System.out.println("kaldı:"+sonuc2);

    }
}
