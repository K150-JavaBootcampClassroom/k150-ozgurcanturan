import java.util.Scanner;

public class fiyatDegistirme extends araclar {

    public void fiyatGunluk1(double gunluk1) {
        setGunluk1(gunluk1);
    }

    public void fiyatGunluk2(double gunluk2) {
        setGunluk2(gunluk2);
    }

    public void fiyatGunluk3(double gunluk3) {
        setGunluk3(gunluk3);
    }

    public void fiyatAylik1(double aylik1) {
        setAylik1(aylik1);
    }

    public void fiyatAylik2(double aylik2) {
        setAylik2(aylik2);
    }

    public void fiyatAylik3(double aylik3) {
        setAylik3(aylik3);

    }

    Scanner scanner = new Scanner(System.in);

    public void fiyatDegistirGunluk() {
        System.out.println("Günlük1: ");
        double gunluk1 = scanner.nextDouble();
        this.fiyatGunluk1(gunluk1);
        System.out.println("Günlük2: ");
        double gunluk2 = scanner.nextDouble();
        this.fiyatGunluk2(gunluk2);
        System.out.println("Günlük3: ");
        double gunluk3 = scanner.nextDouble();
        this.fiyatGunluk3(gunluk3);
        System.out.println("Günlük Fiyatlar Başarı ile değiştirildi.");
    }

    public void fiyatDegistirAylik() {
        System.out.println("Aylık1: ");
        double aylik1 = scanner.nextDouble();
        this.fiyatAylik1(aylik1);
        System.out.println("Aylık2: ");
        double aylik2 = scanner.nextDouble();
        this.fiyatAylik2(aylik2);
        System.out.println("Aylık3: ");
        double aylik3 = scanner.nextDouble();
        this.fiyatAylik3(aylik3);
        System.out.println("Aylık Fiyatlar Başarı ile değiştirildi.");
    }
}
