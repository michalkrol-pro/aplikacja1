import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        Integer n ;

       // while (n!=0){
         //   osobyNieobecne.add(n);
       // }

        System.out.println("projekt udało się wrzucić i odpalić na macbook'u");
        // teraz zrobie zmiany, commit z macbook'a, a update z imac'a,


    }
}
