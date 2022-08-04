import java.util.Scanner;

public class Main {
    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static int carp(int a, int b) {
        return a * b;
    }

    public static int carp(int a, int b, int c) {
        return a * b * c;
    }

    public static int bol(int a, int b) {
        return a / b;
    }

    public static int cikar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String islemler = "Toplama yapmak için 1'e basınız.\n" + "Çıkarma yapmak için 2'ye  basınız.\n" + "Çarpma yapmak için 3'e basınız.\n" + "Bölme yapmak için 4'e basınız.\n" + "Çıkış yapmak için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("************************************************");
        while (true) {
            System.out.println("İşlemi seçiniz");
            String operation = scan.nextLine();
            if (operation.equals("q")) {
                System.out.println("Çıkış yapılıyor");
            } else if (operation.equals("1")) {
                System.out.println("Kaç sayı toplayacaksınız?(2-3)");
                int numofnum = scan.nextInt();
                if (numofnum == 2) {
                    System.out.println("Birinci sayıyı giriniz: ");
                    int number1 = scan.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int number2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(topla(number1, number2));
                } else if (numofnum == 3) {
                    System.out.println("Birinci sayıyı giriniz: ");
                    int number1 = scan.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int number2 = scan.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz: ");
                    int number3 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(topla(number1, number2, number3));

                } else {
                    System.out.println("Girdiğiniz sayı geçersiz");
                }
            } else if (operation.equals("2")) {
                System.out.println("Birinci sayıyı giriniz: ");
                int number1 = scan.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int number2 = scan.nextInt();
                scan.nextLine();
                System.out.println(cikar(number1, number2));
            } else if (operation.equals("3")) {

                System.out.println("Kaç sayı çarpacaksınız?(2-3)");
                int numofnum = scan.nextInt();
                if (numofnum == 2) {
                    System.out.println("Birinci sayıyı giriniz: ");
                    int number1 = scan.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int number2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(carp(number1, number2));
                } else if (numofnum == 3) {
                    System.out.println("Birinci sayıyı giriniz: ");
                    int number1 = scan.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int number2 = scan.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz: ");
                    int number3 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(carp(number1, number2, number3));

                } else {
                    System.out.println("Girdiğiniz sayı geçersiz");
                }

            } else if (operation.equals("4")) {
                System.out.println("Birinci sayıyı giriniz: ");
                int number1 = scan.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int number2 = scan.nextInt();
                scan.nextLine();
                System.out.println(bol(number1, number2));
            }
        }
    }
}
