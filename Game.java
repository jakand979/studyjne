import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Nieprawidlowa ilosc argumentow wejsciowych!");
            return;
        }
        int randomizationNumber;
        try {
            randomizationNumber = Integer.parseInt(args[0]);
            if(randomizationNumber <= 0){
                System.out.println("Nieprawidlowy zakres losowania!");
            }
        }
        catch(NumberFormatException incorrectInput) {
            System.out.println("Nieprawidlowe dane wejsciowe!");
            return;
        }
        int liczbaProb = 1;
        System.out.println("Zgadnij jaka liczbe wylosowalem z zakresu 0-" + randomizationNumber + "!");
        Random rand = new Random();
        int upperBound = randomizationNumber + 1;
        int randomNumber = rand.nextInt(upperBound);
        System.out.println("Podaj liczbe:");
        Scanner input = new Scanner(System.in);
        while(true) {
            if(liczbaProb > 1){
                System.out.println("Podaj liczbe:");
            }
            int inputNumber;
            try {
                inputNumber = input.nextInt();
                if(inputNumber > randomizationNumber || inputNumber < 0){
                    System.out.println("Podales liczbe spoza zakresu! Sproboj ponownie!");
                    liczbaProb++;
                    continue;
                }
            }
            catch(InputMismatchException incorrectInputNum) {
                System.out.println("Podales nieprawidlowe dane!");
                break;
            }
            if(inputNumber == randomNumber) {
                if(liczbaProb == 1){
                    System.out.println("Wygrales! Potrzebowales do tego " + liczbaProb + " próby.");
                }
                else{
                    System.out.println("Wygrales! Potrzebowales do tego " + liczbaProb + " prób.");
                }
                break;
            }
            else if(inputNumber > randomNumber) {
                System.out.println("Liczba ktora podales jest za duza! Sproboj ponownie!");
                liczbaProb++;
            }
            else {
                System.out.println("Liczba ktora podales jest za mala! Sproboj ponownie!");
                liczbaProb++;
            }
        }
    }
}
