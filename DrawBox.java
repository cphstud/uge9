class DrawBox {
  public static void main(String[] args) {
    drawBox(6,10);

    /*
     * TESTKØRSEL:
     * drawBox(6,10) giver flg. figur

     **********
     *        *
     *        *
     *        *
     *        *
     **********

*/

  }
  public static void drawBox(int height, int width) {
    String format = "";
    String myEmpty = " ";
    String myCahr = "*";
    writeChars('*',width);
    // TODO: skriv for-loop hvor hver iteration tegner en linje
    // og hvor antallet af loops begrænses af height samt at
    // width indgår i formateringen af printf.
    for (int i=2;i<height;i++) {
      format = "%s%"+width+"s%n";
      System.out.printf(format,myCahr,myCahr);
      //System.out.printf("%s%10s%n",myCahr,myCahr);
      //System.out.println("*      *");
    }
    writeChars('*',width);

  }
  public static void writeChars(char myChar, int frequency) {
    //TODO: skriv for-loopet der printer myChar 
    for(int i=0;i<frequency+1;i++) {
      System.out.print(myChar);
    }
    System.out.println();
  }
}
