import com.sun.xml.internal.bind.v2.TODO;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("To jest 1/4 ekranów w mojej aplikacji- ekran startowy");
        System.out.println("wyświetla logo, oraz duży przycisk ,,LOSUJ SZCZĘŚCIARZA''");
        System.out.println("zamiast klikać wpisz 'losuj' ");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String losuj = scan.next();

        if (losuj.equals("losuj")){
            System.out.println(" Witaj w ekranie 2/4 mojej apliakcji");
            System.out.println(" Na tym ekranie podajesz liczbe uczniów w klasie ");
            System.out.println(" dodajesz też numery które są np oraz nb ");
            System.out.println(">>> >>> > > > >> >>> >>>  > >>>  >>  >");
            System.out.println("podaj ile uczniów w klasie");
            int ileU = scan.nextInt();
            System.out.println("klasa ma " + ileU + " uczniów");
            System.out.println("Przejdźmy do ekranu 3/4 gdzie losujemy 1 z 4 bonusów");
            System.out.println("Naciśnij przycisk losuj i przejdz do losowania bonusa /teraz wpisz losuj");
            String losujB = scan.next();

                if(losujB.equals("losuj")){
                    int bonus = (1+(random.nextInt(4)));

                    switch (bonus){
                        case 1:
                            System.out.println("Wylosowano bonus z numerem jeden czyli udział biorą tylko numery parzyste ");
                            Bonusy.parzyste(ileU);

                            break;
                        case 2:
                            System.out.println("Wylosowano bonus z numerem dwa czyli udział biorą tylko numery NIEparzyste ");
                            Bonusy.nParzyste(ileU);
                            break;
                        case 3:
                            System.out.println("Wylosowano bonus z numerem 3 czyli udział biorą tylko numery podzielne przez 3 ");
                            Bonusy.p3(ileU);
                            break;
                        case 4:
                            System.out.println("Wylosowano bonus z numerem 4 czyli udział biorą tylko numery podzielne przez 5 ");
                            Bonusy.p5(ileU);
                            break;


                    }





                } else System.out.println("żegnaj");
        } else System.out.println("żegnaj");
    }
}
