import java.util.Scanner;

public class OrtalamaHesapla
{
    public static void main(String[] args)
    {
        int matPuan, fizikPuan, kimyaPuan, turkcePuan, tarihPuan, muzikPuan;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Dersi Notunu Giriniz. :");
        matPuan=input.nextInt();

        System.out.println("Fizik Dersi Notunu Giriniz. :");
        fizikPuan=input.nextInt();

        System.out.println("Kimya Dersi Notunu Giriniz. :");
        kimyaPuan=input.nextInt();

        System.out.println("Turkce Dersi Notunu Giriniz. :");
        turkcePuan=input.nextInt();

        System.out.println("Tarih Dersi Notunu Giriniz. :");
        tarihPuan=input.nextInt();

        System.out.println("Muzik Dersi Notunu Giriniz. :");
        muzikPuan=input.nextInt();

        double ort= (matPuan + fizikPuan + kimyaPuan + turkcePuan + tarihPuan + muzikPuan)/6.0;
        String gecmeKalma = (ort >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ogrencinin Ortalaması :" + ort);
        System.out.println(gecmeKalma);
    }
}