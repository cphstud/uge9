import java.util.Scanner;
import java.util.Random;
class MakeNewName {
  public static void main(String[] args) {
    String yourName = getUserName();
    String improvedName = improveName(yourName);
    System.out.println(improvedName);
    /*
     * FORMÅL:
     * bruge String-metoder
     *
     * OPGAVE:
     * Lav en metode orderFlowers som indeholder en række spørgsmål til en 
     * bruger om hvilken buket han/hun vil bestille:
     * hvilke blomster skal indgå, hvad må den koste, skal den leveres, skal der grønt med
     * Hvis der svares Ja til levering skal der spørges til navn og adresse
     * Ja/Nej svaret til om der skal grønt med skal sættes sammen som  det ses i testresultatet
     * Alle variabler samles i én streng-variabel der returneres til main hvor hvert svar
     * er adskilt af en såkaldt delimiter - i dette tilfælde et semikolon
     
     * TESTKØRSEL: en mulig returstreng: 
     * roser,tulipaner;Ja til grønt;345;Otto Verner;Gyden 12;4500 Odense
     *

*/
  }
  public static String improveName(String userName) {
    String newName = "";
    String vowel = "AEIOUYØÆÅ";
    char firstLetter = userName.charAt(0);
    String restName = userName.substring(1);
    int myRand = getRand(vowel.length());
    char myRandVowel = vowel.charAt(myRand);
    newName = myRandVowel + restName;
    return newName;
  }
  public static String getUserName(){
    Scanner myScan = new Scanner(System.in);
    System.out.println("What is your first name?");
    String retValName = myScan.nextLine();
    return retValName;
  }
  public static int getRand(int max){
    Random myRand = new Random();
    int retValRand = myRand.nextInt(max-1)+1;
    return retValRand;
  }
}

