import java.sql.SQLOutput;
import java.util.Scanner;

public class hienthiSntnhohon100 {
    public static boolean checkPrime(int number) {
      if(number < 2) return false;
      for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) return false;
      }
      return true;
    }
    public static void outputPrime(int number) {
        for(int i = 0; i < number; i++){
            if(checkPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố");
        int number = scanner.nextInt();
        outputPrime(number);
    }
}
