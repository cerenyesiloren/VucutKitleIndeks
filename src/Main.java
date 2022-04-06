import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double boy, kilo , indeks;

        Scanner read = new Scanner (System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = read.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = read.nextDouble();

        indeks = kilo / ( boy*boy) ;
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}
