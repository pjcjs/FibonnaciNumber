import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonnaciNumber {
    // Kullanıcıdan bir pozitif tamsayı alın.
    // Bu sayıya kadar olan sayılardan asal sayıları bulmak için bir döngü kullanın.
    // Bulduğunuz asal sayıları bir diziye veya listeye kaydedin.
    // Programın sonunda, asal sayıları ve toplam asal sayı miktarını yazdırın.
    // Ek olarak, asal sayılar arasındaki en büyük asal sayıyı da belirleyin ve yazdırın.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz");
        int sayi= input.nextInt();

        if (sayi>=2){
            asalSayi(sayi);
        } else if (sayi==1) {
            System.out.println("1 Asal sayı değildir");
        }else {
            System.out.println("Lütfen geçerli bir sayı giriniz");
        }

    }

    private static void asalSayi(int sayi) {
        List<Integer> asalaSayi= new ArrayList<>();
        int sayac=0;//kendinden ve 1'den başka kaç tane tam boleni var bunu sayıyor

        for (int i = 2; i <=sayi ; i++) { //başlangıçtan girilen sayıya kadar sırayla dönderecek
            for (int j = 2; j <i ; j++) {  //sayının çarpanlarını kontrol edecek
                if (i%j==0){//tam bolenlerin tamamını almamızı saglar
                    sayac++;
                }
            }
            if (sayac==0){
                asalaSayi.add(i);
            }
            sayac=0;

        }
        System.out.println(asalaSayi);
        System.out.println("bu sayıdan küçük " +asalaSayi.size() + " adet asal sayı vardır");
        System.out.println("listedeki en büyük asal sayı : "+ (asalaSayi.get(asalaSayi.size()-1)));
    }
}