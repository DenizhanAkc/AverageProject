import java.util.Scanner;

public class ProjectAverage {
    public static void main(String[] args) {
        //Degiskenlerimizi tanimlayalim.
        int matematik, fizik, kimya, turkce, tarih, muzik;


        //Scanner sinifimizi tanimladik.
        Scanner input = new Scanner(System.in);

        //kullanicidan degerleri al.
        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();
        System.out.println(matematik);

        System.out.print("Fizik Notunuz : ");
        fizik  = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya  = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        //Not ortalamasini hesaplayalim.
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        //Gecme notumuz icin bir degisken tanimlayalim.
        int gecmeNotu = 60;

        //Kosul operatoru kullanarak sonucu belirleyelim.
        String kiyaslama = (sonuc >= gecmeNotu) ? "Ogrenci gecti" : "Ogrenci kaldi.";
        System.out.println(kiyaslama);



    }
}