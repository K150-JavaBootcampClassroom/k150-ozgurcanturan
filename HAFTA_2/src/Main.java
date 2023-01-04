import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean dongu = true;
        boolean dongu1 = true;
        boolean dongu2 = true;

        Scanner scanner = new Scanner(System.in);
        while (dongu) {
            System.out.println("Lütfen Giriş Tipinizi Seçiniz: \n 1-Admin \n 2-Şirket \n 3-Vatandaş \n 4-Çıkış");

            System.out.println("Seçim: ");
            int kullaniciIndex = scanner.nextInt();
            scanner.nextLine();
            switch (kullaniciIndex) {
                case 1:
                    admin a = new admin("Emine ÖZBEK", "5551234567", "admin", "123");
                    System.out.println("Kullanıcı Adı:");
                    String kontroladmin = scanner.nextLine();
                    System.out.println("Şifre:");
                    String kontrolsifre = scanner.nextLine();
                    if (kontroladmin.equals(a.kullaniciAdi) & kontrolsifre.equals(a.sifre)) {
                        System.out.println("Admin Girişi Yapıldı.");
                        System.out.println("Hoşgeldin " + a.getIsim());
                        while (dongu2) {
                            System.out.println("İşlemi Seçiniz\n" +
                                    "1- Araç İşlemleri\n" +
                                    "2- Admin İşlemleri\n" +
                                    "3- Çıkış");
                            System.out.println("Seçim: ");
                            int secim = scanner.nextInt();
                            switch (secim) {
                                case 1:
                                    System.out.println("İşlemi Seçiniz\n" +
                                            "1- Araç Ekle\n" +
                                            "2- Fiyat Düzenle\n");
                                    System.out.println("Seçim: ");
                                    int islem = scanner.nextInt();
                                    if (islem == 1) {
                                        System.out.println("Araç Tipini Seçiniz\n" +
                                                "1- Hactchback\n" +
                                                "2- Sedan\n" +
                                                "3- SUV\n");
                                        int islemTipi = scanner.nextInt();
                                        if (islemTipi == 1) {
                                            a.hatchbackEkle();
                                        } else if (islemTipi == 2) {
                                            a.sedanEkle();
                                        } else if (islemTipi == 3) {
                                            a.suvEkle();
                                        }

                                    } else if (islem == 2) {
                                        System.out.println("Değiştirilecek Fiyat Tipini Seçiniz\n" +
                                                "1- Günlük\n" +
                                                "2- Aylık\n");
                                        int fiyatIslem = scanner.nextInt();
                                        fiyatDegistirme fiyat = new fiyatDegistirme();
                                        if (fiyatIslem == 1) {
                                            fiyat.fiyatDegistirGunluk();
                                        } else if (fiyatIslem == 2) {
                                            fiyat.fiyatDegistirAylik();
                                        }

                                    }
                                    break;
                                case 2:
                                    System.out.println("İşlemi Seçiniz\n" +
                                            "1- Kullanıcı Adı Şifre Değiştirme\n");
                                    System.out.println("Seçim: ");
                                    int adminIslem = scanner.nextInt();
                                    if (adminIslem == 1) {
                                        a.kullaciAdiSifreDegistirme();
                                    }
                                    break;
                                case 3:
                                    dongu2 = false;
                                    break;

                            }
                        }
                    } else {
                        System.out.println("Kullanıcı adı veya Şifre yalnış!!!");
                    }


                    break;
                case 2:
                    System.out.println("Şirket Adı:");
                    String sirketIsim = scanner.nextLine();
                    System.out.println("Telefon:");
                    String sirketTel = scanner.nextLine();
                    System.out.println("Vergi Dairesi:");
                    String sirketVergiDairesi = scanner.nextLine();
                    System.out.println("Vergi No:");
                    int sirketVergiNo = scanner.nextInt();
                    sirket s = new sirket(sirketIsim, sirketTel, sirketVergiDairesi, sirketVergiNo);
                    while (dongu1) {
                        System.out.println("Araç Tipini Seçiniz\n" +
                                "1- Hactchback\n" +
                                "2- Sedan\n" +
                                "3- SUV\n" +
                                "4- Çıkış");
                        System.out.println("Seçim: ");
                        int aractipi = scanner.nextInt();
                        switch (aractipi) {
                            case 1:
                                hacbakler hacbak = new hacbakler("Kia Ceed", 2, 2022, false, "Mavi");
                                hacbak.kiralama();
                                System.out.println("Hesaplama Türünü Seçiniz:\n" +
                                        "1- Günlük\n" +
                                        "2- Aylık\n");
                                System.out.println("Seçim: ");
                                int hesap = scanner.nextInt();
                                if (hesap == 1) {
                                    double hgunluk = hacbak.gunlukHesaplama(1);
                                    double hkdv = hacbak.kdvHesapla(hgunluk);
                                    System.out.println("Sayın " + s.getIsim() + " ,Hatchback aracımızın günlük kiralama bedelleri aşağıda listelenmektedir.\n" +
                                            "Günlük Tutar: " + hgunluk + "₺\n" +
                                            "Kdv: " + hkdv + "₺\n" +
                                            "Toplam: " + (hgunluk + hkdv) + "₺");
                                } else if (hesap == 2) {
                                    double haylik = hacbak.aylikHesaplama(2);
                                    double hkdv = hacbak.kdvHesapla(haylik);
                                    System.out.println("Sayın " + s.getIsim() + " ,Hatchback aracımızın aylık kiralama bedelleri aşağıda listelenmektedir.\n" +
                                            "Aylık Tutar: " + haylik + "₺\n" +
                                            "Kdv: " + hkdv + "₺\n" +
                                            "Toplam: " + (haylik + hkdv) + "₺");
                                } else {
                                    System.out.println("Yalnış bir tuşlama yaptınız.");

                                }
                                break;
                            case 2:
                                sedanlar suv = new sedanlar("Kia Cerato", 2, 2022, true, "Mavi");
                                suv.kiralama();
                                System.out.println("Hesaplama Türünü Seçiniz:\n" +
                                        "1- Günlük\n" +
                                        "2- Aylık\n");
                                System.out.println("Seçim: ");
                                int hesapSedan = scanner.nextInt();
                                if (hesapSedan == 1) {
                                    double hgunluk = suv.gunlukHesaplama(3);
                                    double hkdv = suv.kdvHesapla(hgunluk);
                                    System.out.println("Sayın " + s.getIsim() + " ,Sedan araçlarımızın günlük kiralama bedelleri aşağıda listelenmektedir.\n" +
                                            "Günlük Tutar: " + hgunluk + "₺\n" +
                                            "Kdv: " + hkdv + "₺\n" +
                                            "Toplam: " + (hgunluk + hkdv) + "₺");
                                } else if (hesapSedan == 2) {
                                    double haylik = suv.aylikHesaplama(3);
                                    double hkdv = suv.kdvHesapla(haylik);
                                    System.out.println("Sayın " + s.getIsim() + " ,Sedan araçlarımızın aylık kiralama bedelleri aşağıda listelenmektedir.\n" +
                                            "Aylık Tutar: " + haylik + "₺\n" +
                                            "Kdv: " + hkdv + "₺\n" +
                                            "Toplam: " + (haylik + hkdv) + "₺");
                                } else {
                                    System.out.println("Yalnış bir tuşlama yaptınız.");
                                    break;
                                }
                                break;
                            case 3:
                                suvlar suv1 = new suvlar("Kia Sportage", 2, 2022, true, "Mavi");
                                suv1.kiralama();
                                System.out.println("Hesaplama Türünü Seçiniz:\n" +
                                        "1- Günlük\n" +
                                        "2- Aylık\n");
                                System.out.println("Seçim: ");
                                int hesapSuv = scanner.nextInt();
                                if (hesapSuv == 1) {
                                    double hgunluk = suv1.gunlukHesaplama(2);
                                    double hkdv = suv1.kdvHesapla(hgunluk);
                                    System.out.println("Sayın " + s.getIsim() + " ,SUV araçlarımızın günlük kiralama bedelleri aşağıda listelenmektedir.\n" +
                                            "Günlük Tutar: " + hgunluk + "₺\n" +
                                            "Kdv: " + hkdv + "₺\n" +
                                            "Toplam: " + (hgunluk + hkdv) + "₺");
                                } else if (hesapSuv == 2) {
                                    double haylik = suv1.aylikHesaplama(3);
                                    double hkdv = suv1.kdvHesapla(haylik);
                                    System.out.println("Sayın " + s.getIsim() + " ,SUV araçlarımızın aylık kiralama bedelleri aşağıda listelenmektedir.\n" +
                                            "Aylık Tutar: " + haylik + "₺\n" +
                                            "Kdv: " + hkdv + "₺\n" +
                                            "Toplam: " + (haylik + hkdv) + "₺");
                                } else {
                                    System.out.println("Yalnış bir tuşlama yaptınız.");
                                    break;
                                }
                                break;
                            case 4:
                                dongu1 = false;
                        }
                    }
                    break;
                case 3:
                    System.out.println("İsim Soyisim: ");
                    String isim = scanner.nextLine();
                    System.out.println("Telefon: ");
                    String tel = scanner.nextLine();
                    vatandas vatandas = new vatandas(isim, tel);
                    System.out.println("Sayın " + vatandas.getIsim() + ", firmamızdan sadece Hatchback araç kiralabilirsiniz");
                    hacbakler hacbak = new hacbakler("Kia Ceed", 1, 2020, true, "Kırmızı");
                    hacbak.kiralama();
                    double hgunluk = hacbak.gunlukHesaplama(1);
                    double hkdv = hacbak.kdvHesapla(hgunluk);
                    System.out.println("Sayın " + vatandas.getIsim() + " ,Hatchback araçlarımızda sadece günlük kiralama seçeneğimiz mevcuttur.\n" +
                            "Günlük tutar: " + hgunluk + "₺\n" +
                            "Kdv: " + hkdv + "₺\n" +
                            "Toplam: " + (hgunluk + hkdv) + "₺");
                    break;
                default:
                    System.out.println("Yalnış bir tuşlama yaptınız.");
                    break;
                case 4:
                    dongu=false;
            }
        }
    }
}