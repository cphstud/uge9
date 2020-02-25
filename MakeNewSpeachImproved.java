import java.util.Scanner;

public class MakeNewSpeachImproved {
  public static void main(String[] args) {

    String speachTemplate = "Jeg er så TEMPERVAL at være med idag. Vi har kendt hinanden siden TEMPPLACE. Jeg husker tydeligt hvordan du TEMPVALAKTIVITET\n"; 

    String temperament = userSpeachInput("temperament");
    String erindringsSted = userSpeachInput("erindringssted");
    String mindeAktivitet = userSpeachInput("minde");

    String mySpeach = speachComposer(speachTemplate, temperament,erindringsSted, mindeAktivitet);
    System.out.print(mySpeach);
  }
  public static String speachComposer(String speachTemplate, String temperament, String erindringsSted, String mindeAktivitet) {
    String myString = speachTemplate.replaceAll("TEMPERVAL",temperament);
    myString = myString.replaceAll("TEMPPLACE",erindringsSted);
    myString = myString.replaceAll("TEMPVALAKTIVITET",mindeAktivitet);
    return myString;
  }
  public static String userSpeachInput(String typeOfQuestion) {
    Scanner input = new Scanner(System.in);
    String ditValg;
    System.out.println("Hvad er dit " + typeOfQuestion);
    ditValg = input.nextLine();
    return ditValg;
  }
}
