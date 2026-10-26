import java.util.Scanner;

void main() {

    final double kaffe = 25.0;
    final double kanelbulle = 30.0;
    final double macka = 55.0;


    Scanner scanner = new Scanner(System.in);

    System.out.println("Hej och välkommen till cafeét!");

    System.out.println("Hur var ditt namn?");
    String namn = scanner.nextLine(); /* Så man kan skriva sitt namn */

    System.out.println("Hej " + namn);

    System.out.println("Hur många koppar kaffe vill ni ha? 25kr/st?");
    int antalKaffe = scanner.nextInt(); /* sparar antalet */
    double priskaffe = kaffe * antalKaffe;

    System.out.println("Vill du ha kanelbulle också? 30kr/st");
    int antalKanelbulle = scanner.nextInt();
    double priskanelbulle = kanelbulle * antalKanelbulle;

    System.out.println("Vill du kanske ha en macka också? 55kr/st");
    int antalMacka = scanner.nextInt();
    double prismacka = macka * antalMacka;

    double totalpris = priskaffe + priskanelbulle + prismacka;
    double totalprismoms = (priskaffe + priskanelbulle + prismacka) * 0.12/1.12;
    double totalprisrabatt =  (priskaffe + priskanelbulle + prismacka) * 0.9;
    double rabattmoms =  (0.9 * (priskaffe + priskanelbulle + prismacka)) * 0.12/1.12;

    System.out.println( "==== KVITTO ====" );
    System.out.println("Kund: " + namn);
    System.out.println("Kaffe: " + antalKaffe + "st = " + priskaffe + "kr");
    System.out.println("Kanelbulle: " + antalKanelbulle +"st = " + priskanelbulle + "kr");
    System.out.println("Macka: " +antalMacka + "st = " + prismacka + "kr");

    System.out.println("-----------------------");

    System.out.println("Totalt: " + totalpris);
    System.out.println("Moms: " + totalprismoms);

    if (totalpris>=100) {
        System.out.println("=======================");
        System.out.println("Du har möjlighet att få 10% rabatt på hela köpet!");
        System.out.println("Med rabatt blir totalpriset: " + totalprisrabatt + rabattmoms);
    }

    System.out.println("Vill ni dela på notan?");
    boolean villDela;
    villDela = scanner.nextBoolean();

  if (villDela==true) {
    System.out.println("Med rabatt blir totalpriset per person: " + (rabattmoms + totalprisrabatt) / 3);
  }
else {
      System.out.println("Totalt: " + totalpris);
      System.out.println("Moms: " + totalprismoms);

}
    System.out.println("=======================");
    System.out.println("Tack för besöket, " + namn + "!");

    scanner.close();
    }
