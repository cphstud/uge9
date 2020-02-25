import java.util.Scanner;
class ModPrime {
  public static void main(String[] args) {
    Scanner  myScan = new Scanner(System.in);
    System.out.println("Enter a positive number: ");
    int userInt = myScan.nextInt();
    String answer = isPrime(userInt);
    System.out.println(userInt + answer);
    /*
     * FORMÅL:
     * bruge modulo-operatoren, for-loop og if-statement
     *
     * OPGAVE:
     * Et primtal er et positivt heltal større end 1, 
     * der ikke er deleligt med andre hele positive tal end 1 
     * og tallet selv,
     * 
     * Skriv metoden isPrime.
     * Start med at lave et for-loop som løber fra 2 til tallet som skal undersøges
     * Derved får man mulighed for at tjekke alle positive tal større end 
     * 1 og mindre end tallet selv.
     *
     * Løs opgaven med Scanner-input så input bliver dynamisk.

*/
  }
}
