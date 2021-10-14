import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(System.in)){
              
            System.out.println("Masukkan angka: ");
            int angka = scanner.nextInt();
            String textHasil = "Hasil yang di dapatkan: ";

            if (angka < 0 || angka > 100) System.out.println("Rentang angka harus dari 0 - 100");
            else if (angka <= 20) System.out.println(textHasil + "E");
            else if (angka <= 40) System.out.println(textHasil + "D");
            else if (angka <= 60) System.out.println(textHasil + "C");
            else if (angka <= 80) System.out.println(textHasil + "B");
            else System.out.println(textHasil + "A");
        }
      
    }
}