import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("dodaj uczniów nieobecnych lub wpisz 0 aby przejsc dalej");
        int x;
        Scanner odczyt = new Scanner(System.in);
        boolean koniec = true;
        List<Integer> osobyNieobecne = new LinkedList<Integer>();


        do {
            System.out.println("dodaj uczniów nieobecnych lub wpisz 0 aby przejsc dalej");
            x = odczyt.nextInt();
                if (x==0){
                    koniec = false;
                }
                else {
                    osobyNieobecne.add(x);
                }

        }
        while (koniec);
        System.out.println("koniec");
        System.out.println(osobyNieobecne);

    }
}
