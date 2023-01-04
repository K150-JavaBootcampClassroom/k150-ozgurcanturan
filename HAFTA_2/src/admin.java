import java.util.Scanner;

public class admin extends musteriler {
    String kullaniciAdi;
    String sifre;
    Scanner scanner = new Scanner(System.in);

    public admin(String isim, String telelfonNo, String kullaniciAdi, String sifre) {
        super(isim, telelfonNo);
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public void hatchbackEkle() {
        System.out.println("Marka Model: ");
        String marka = scanner.nextLine();
        System.out.println("Müşteri Tipi: ");
        int tip = scanner.nextInt();
        System.out.println("Model Yılı: ");
        int yil = scanner.nextInt();
        System.out.println("Renk: ");
        scanner.next();
        String renk = scanner.nextLine();
        hacbakler hacbak = new hacbakler(marka, tip, yil, true, renk);
        hacbak.setHacbakler(marka);
    }


    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }


    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void sedanEkle() {
        System.out.println("Marka Model: ");
        String marka = scanner.nextLine();
        System.out.println("Müşteri Tipi: ");
        int tip = scanner.nextInt();
        System.out.println("Model Yılı: ");
        int yil = scanner.nextInt();
        System.out.println("Renk: ");
        scanner.next();
        String renk = scanner.nextLine();
        sedanlar sedan = new sedanlar(marka, tip, yil, true, renk);
        sedan.setSedanList(marka);
    }

    public void suvEkle() {
        System.out.println("Marka Model: ");
        String marka = scanner.nextLine();
        System.out.println("Müşteri Tipi: ");
        int tip = scanner.nextInt();
        System.out.println("Model Yılı: ");
        int yil = scanner.nextInt();
        System.out.println("Renk: ");
        scanner.next();
        String renk = scanner.nextLine();
        suvlar suv = new suvlar(marka, tip, yil, true, renk);
        suv.setSuvAraclar(marka);
    }

    public void kullaciAdiSifreDegistirme() {
        System.out.println("Yeni Kullanıcı Adı ve Şifre Giriniz: \n" +
                "Kullanıcı Adı: ");
        String yeniKullanici = scanner.nextLine();
        System.out.println("Kullanıcı Adını Tekrar Giriniz: ");
        String yeniKullanici1 = scanner.nextLine();
        System.out.println("Yeni Şifreyi Giriniz: \n");
        String yeniSifre = scanner.nextLine();
        System.out.println("Şifreyi Tekrar Giriniz: \n");
        String yeniSifre1 = scanner.nextLine();
        if (yeniKullanici.equals(yeniKullanici1) & yeniSifre.equals(yeniSifre1)) {
            this.setKullaniciAdi(yeniKullanici);
            this.setSifre(yeniSifre);
            System.out.println("Kullanıcı Adı ve Şifre Başarı ile değiştirildi.");
        } else {
            System.out.println("Kullanıcı adı veya şifre eşleşmedi.");
        }

    }

}
