import java.util.Scanner;

public class Main {
    public static int ebobBulma(int number1,int number2){
        int ebob=1;
        for(int i=2 ; i<=number1 && i<=number2 ; i++){
            if(number1%i==0 && number2%i==00){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {

Scanner sayi = new Scanner(System.in);
System.out.println("birinci sayı: ");
int sayi1 = sayi.nextInt();
System.out.println("ikinci sayı: ");
int sayi2 = sayi.nextInt();
System.out.println(ebobBulma(sayi1,sayi2));
    }
}