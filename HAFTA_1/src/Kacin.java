
import java.util.Random;
import java.util.Scanner;

public class Kacin {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int trya = 0;
        int select;


        System.out.print("50 ile 100 Arasındaki Sayıyı bakalım kaçıncı denemede bulacaksınız... ");
        System.out.print(" Hadi Başlayalım...\n");
        boolean run = true;
        while (run == true) {
            System.out.println("1-Başla\n" + "2-Çıkış\n");
            System.out.println("Seçim:");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    for (int i = 1; i < 501; i++) {
                        int number = random.nextInt(500);
                        trya = i;
                        if (number > 49 & number < 101) {
                            System.out.print("Deneme Sayısı: " +"\u001B[31m"+ trya+"\n");
                            System.out.print("\u001B[0m"+"Bulunan Sayı:" +"\u001B[34m"+ number + "\n"+"\u001B[0m");
                            break;
                        }
                    }

                case 2:
                    if (select == 2) {
                        run = false;
                        System.out.print("Görüşürüz :)\n");
                    }
                    break;

                default:
                    System.out.print("Lütfen Doğru Tuşlama Yapınız\n");
                    break;

            }
        }
    }

}
