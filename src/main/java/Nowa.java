import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Nowa {
    public static void main(String[] args) {
        System.out.println(" Witamy w aplikacji Szczęściarz, za chwile wylosujemy kogoś do odwowiedźi ");
        System.out.println("Wpisz proszę ilu uczniów jest na liście");
        Scanner scan = new Scanner(System.in);
        Integer u = scan.nextInt();
        System.out.println("W klasie, na liście jest "+ u + " uczniów:");

        List<Integer>listaUczniow = new LinkedList<Integer>();
        for (int i=1; i < u+1; i++){
            listaUczniow.add(i);
        }
        System.out.println(listaUczniow);
        System.out.println("Jeżeli są jakieś osoby nieobecnę proszę wpisać jej numer a następnie nacisnąć ENTER, jeżeli nie ma, albo podane zostały już wszystkie- proszę wcisnąć 0 oraz zatwierdzić ENTEREM");
        List<Integer> osobyNieobecne = new LinkedList<Integer>();
        Boolean koniec  = true;
        Boolean koniec2  = true;

        do {
            System.out.println("Podaj numer ucznia nieobecnego albo wpisz 0 aby zakończyć");
            int x = scan.nextInt();

            if (x==0){
                koniec=false;
            } else {
                osobyNieobecne.add(x);
            }
        } while (koniec);
        System.out.println("Lista osób nieobecnych: " + osobyNieobecne);

        System.out.println("Jeżeli ktoś zgłośił nieprzygotowanie, prosze wpisać tu jego numer i potwierdzić ENTEREM, jeżeli nie ma, albo podane zostały już wszystkie- proszę wcisnąć 0 oraz zatwierdzić ENTEREM");
        List<Integer> osobyNieprzygotowane = new LinkedList<Integer>();

        do {
            System.out.println("Podaj numer ucznia który zgłosił nieprzygotowanie albo wpisz 0 aby zakończyć");
            int x = scan.nextInt();

            if (x==0){
                koniec2=false;
            } else {
                osobyNieprzygotowane.add(x);
            }

        } while (koniec2);
        System.out.println("Lista osób nieprzygotowanych: "+osobyNieprzygotowane);

        for(Integer one : osobyNieobecne){
            listaUczniow.remove(one);
        }
        for(Integer one : osobyNieprzygotowane){
            listaUczniow.remove(one);
        }
        System.out.println("lista uczniów biorących aktywny udział w losowaniu"+ listaUczniow);

        System.out.println("Teraz losujemy jeden z 4 bonusów");
        Random random = new Random();
        int bonus = (1+(random.nextInt(4)));
        System.out.println("Tym razem wylosowano bonus numer:  "+ bonus);
        List<Integer> bonus1 = new ArrayList<Integer>();
        List<Integer> bonus2 = new ArrayList<Integer>();
        List<Integer> bonus3 = new ArrayList<Integer>();
        List<Integer> bonus4 = new ArrayList<Integer>();

        switch (bonus){
            case 1:
                System.out.println("Wylosowano bonus z numerem jeden czyli udział biorą tylko numery parzyste ");
                for(Integer one : listaUczniow){
                    if(one % 2 == 0) {
                        bonus1.add(one);
                    }
                }
                System.out.println("Ok więc teraz możemy przejść do losowania");
                System.out.println("numery które biorą udział w losowaniu to: "+bonus1);
                int a =bonus1.get(random.nextInt(bonus1.size()));
                System.out.println("Szczęściarz który dzisiaj został wylosowany ma numer: " +  a + " Gratulujemy i zapraszamy");
                break;

            case 2:
                System.out.println("Wylosowano bonus z numerem dwa czyli udział biorą tylko numery podzielne przez 3 ");
                for(Integer one : listaUczniow){
                    if(one % 3 == 0) {
                        bonus2.add(one);
                    }
                }
                System.out.println("Ok więc teraz możemy przejść do losowania");
                System.out.println("numery które biorą udział w losowaniu to: "+bonus2);
                int b =bonus2.get(random.nextInt(bonus2.size()));
                System.out.println("Szczęściarz który dzisiaj został wylosowany ma numer: " +  b + " Gratulujemy i zapraszamy");
                break;
            case 3:
                System.out.println("Wylosowano bonus z numerem trzy czyli udział biorą tylko numery z pierwszej połowy listy ");
                for(Integer one : listaUczniow){
                    if(one <= 0.5*u) {
                        bonus3.add(one);
                    }
                }
                System.out.println("Ok więc teraz możemy przejść do losowania");
                System.out.println("numery które biorą udział w losowaniu to: " + bonus3);
                int c =bonus3.get(random.nextInt(bonus3.size()));
                System.out.println("Szczęściarz który dzisiaj został wylosowany ma numer: " + c  + " Gratulujemy i zapraszamy");
                break;
            case 4:System.out.println("Wylosowano bonus z numerem cztery czyli udział biorą tylko numery z drugiej połowy listy ");
                for(Integer one : listaUczniow){
                    if (one >= 0.5*u) {
                        bonus4.add(one);
                    }
                }
                System.out.println("Ok więc teraz możemy przejść do losowania");
                System.out.println("numery które biorą udział w losowaniu to: "+bonus4);
                int d =bonus4.get(random.nextInt(bonus4.size()));
                System.out.println("Szczęściarz który dzisiaj został wylosowany ma numer: " + d  + " Gratulujemy i zapraszamy");
                break;
        }


    }
}
