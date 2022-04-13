public class Substring {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Nieprawidlowa ilosc argumentow wejsciowych!");
            return;
        }
        String inputString = args[0];
        try {
            int beginIndex = Integer.parseInt(args[1]);
            int endIndex = Integer.parseInt(args[2]);
            try {
                if(beginIndex == inputString.length() && endIndex == inputString.length()) {
                    System.out.println("Podwyraz pusty.");
                }
                else {
                    System.out.println(inputString.substring(beginIndex, endIndex + 1));
                }
            }
            catch(StringIndexOutOfBoundsException incorrectIndex) {
                if(beginIndex > inputString.length()) {
                    System.out.println("Indeks poczatkowy nie moze byc wiekszy od dlugosci wyrazu!");
                }
                else if(beginIndex < 0 || endIndex < 0){
                    System.out.println("Indeksy nie moga byc ujemne!");
                }
                else if(beginIndex > endIndex){
                    System.out.println("Indeks poczatkowy nie moze byc wiekszy od koncowego!");
                }
                else {
                    System.out.println(inputString.substring(beginIndex));
                }
            }
        }
        catch(NumberFormatException incorrectInput) {
            System.out.println("Nieprawidlowe dane wejsciowe!");
        }
    }
}

