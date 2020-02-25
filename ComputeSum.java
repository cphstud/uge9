/*
 * Bygger videre på sidste uges opgave om at beregne tværsum.
 * Da vi nu har loops og conditionals kan man lave en metode
 * som uanset tallets størrelse kan beregne tværsummen.
 *
 * opgave 1)
 * Udtænk algoritmen for hvorledes man vha af modulus og heltasdivision
 * kan bryde et tal ned komponent for komponent og gemme summen undervejs.
 * Implementér algoritmen efter TODO-kommentaren nedenfor. Det kan gøres
 * på tre linjer kode.
 * Den første udgave skal bare returnere den første tværsum.
 * Test:
 * input: 345
 * output: Tværsummen af 345 er 12
 *
 * opgave 2)
 * Sørg for at metoden kan udregne den endelige tværsum. Altså hvis resultatet
 * er 12 skal den kalde sig selv med tallet 12.
 * Test:
 * input: 345
 * output: Tværsummen af 345 er 3
 *
 *
 */

import java.util.Scanner;
public class ComputeSum {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indast heltal:");
    int userInt = myScan.nextInt();
    int sum = computeSum(userInt);
    System.out.printf("udskriv tværsummen");

  }
  public static int computeSum(int number){
    int sum = 0;
    int rest = 0;
    // TODO
    // brug et while-loop kombineret med modulus og heltalsdivision
    // til at bryde tallet ned i dets 10-tals-komponenter
    return sum;
  }
}
