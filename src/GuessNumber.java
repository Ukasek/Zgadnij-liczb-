import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int userInput = scan.nextInt();
        while (userInput <= 100 || userInput >= 200 || userInput % 3 != 0) {
            if (userInput > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (userInput < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (userInput % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }
            System.out.println("Podaj liczbę:");
            userInput = scan.nextInt();
        }
        System.out.println("Twoja liczba jest ok");

    }
}
