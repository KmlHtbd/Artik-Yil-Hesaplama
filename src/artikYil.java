import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if (year%4 == 0){
            if (year%100 == 0 && year%400 != 0){
                System.out.println(year+" Artık Bir Yıl Değildir.");
            }else {
                System.out.println(year+" Artık Bir Yıldır.");
            }
        }else {
            System.out.println(year+" Artık Bir Yıl Değildir.");
        }
    }
}