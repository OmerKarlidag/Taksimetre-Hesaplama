import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double km, tutar, perKm = 2.20;
        int  startPrice = 10;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Gidilecek KM Giriniz : ");
        km = girdi.nextDouble();

        tutar = (km * perKm) + startPrice;
        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Ödenecek Tutar : " + tutar + " TL");

    }
}
