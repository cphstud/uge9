class DrawOneLeg {
  public static void main(String[] args) {
    draw(5);
    /*
     * FORMÅL: 
     * loops (for og while) samt parametrisere printf
     *
     * Tricket i at printe spaces vha printf-format er
     * at bruge en variabel til at angive pladser
     * dvs at System.out.printf("%14s%n","#") bliver til
     * format = "%" + variabel + "s%n";
     * myChar = "*"
     * System.out.printf(format,myChar);
     * 
     *
     * OPGAVEN:
     * tegn fire bogstavsben vha metoden draw hvor højden er parameter.
     *
     * TESTKØRSEL:
     * draw(5) giver flg. figur

      A
       A
        A
         A
          A
      A
       A 
        A  
         A   
          A    
      A
       A 
        A  
         A   
          A    
      A
       A 
        A  
         A   
          A    

*/

  }
  public static void draw(int height) {
    String format = "";
    String sign = "A";
    String space  = "";

    // den svære
    for(/*udfyld loop*/) {
      format = String.format("%d%n",i);
      // TODO: google escape % i format
      System.out.printf(format,sign);
    }

    // den lidt lettere 
    for(/*udfyld loop*/) {
      System.out.printf("%n",space,sign,space);
      space += " ";
    }

    // initialisér eller nulstil variabler

    do{
      counter++;
      System.out.printf();
    } while (counter<height);

    // initialisér eller nulstil variabler
    while () {
      //TODO: udfyld indmaden i loopet
    }
  }
}
