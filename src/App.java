import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, yas, tutar, indirimliTutar = 0, yolculukTipi;

        while (true) { 
            System.out.print("Mesafeyi km cinsinden giriniz: ");
            km = input.nextDouble();

            System.out.print("Yaşınızı giriniz: ");
            yas = input.nextDouble();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
            yolculukTipi = input.nextDouble();

            if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
                break;  
            } else {
                System.out.println("Hatalı veri girdiniz! Lütfen tekrar deneyin.\n");
            }
        }

        
        tutar = km * 0.10;
        if (yas < 12) {
            indirimliTutar = tutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimliTutar = tutar * 0.10;
        } else if (yas >= 65) {
            indirimliTutar = tutar * 0.30;
        }
        tutar -= indirimliTutar;

        if (yolculukTipi == 2) {
            tutar = tutar * 0.8 * 2;  
        }

        System.out.printf("Toplam Tutar: %.1f TL%n", tutar);

        input.close();
    }
}
