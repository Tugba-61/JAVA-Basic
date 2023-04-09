import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int secim = 0;
        do {
            System.out.println("1- Elit üye ekleme");
            System.out.println("2- Genel Üye ekleme");
            System.out.println("3- Mail Gönderme");
            System.out.println("0- Programdan çıkış");
            System.out.print("Lütfen bir seçim yapın: ");
            secim = scanner.nextInt();

            UyeEkleme üyeEkleme = new UyeEkleme();

            switch (secim) {
                case 1:
                    System.out.println("Lütfen elit üye ad bilgisini giriniz: ");
                    String ad = scan.nextLine();
                    System.out.println("Lütfen elit üye soyad bilgisini giriniz: ");
                    String soyad = scan.nextLine();
                    System.out.println("Lütfen elit üye mail bilgisini giriniz: ");
                    String mail = scan.nextLine();
                    break;
                case 2:
                    //Genel üye ekleme;
                    break;
                case 3:
                    //mail gönderme;
                    break;
                case 0:
                    System.out.println("Program sonlandırılıyor...");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız. Lütfen tekrar deneyin.");
            }
        } while (secim != 0);
        scanner.close();

    }
}

