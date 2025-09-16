import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("scanner = " + number);
        FindPrimeNumber find = new FindPrimeNumber();
        find.primeNumber(number);
    }

    private void primeNumber(int number) {
        if(number < 1){
            System.out.println("Nither prime nor composite");
        }
        int c = 2;
        while (c < number){
            if(number % c == 0){
                System.out.println("Not Prime");
                break;
            }
            c++;
        }
        System.out.println("Prime");
    }
}
