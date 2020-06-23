import java.util.ArrayList;
import java.util.List;

    public class Lista {
        public static void main(String[] args) {
            //numerek z dziennika, czy podlega losowaniu do odpowiedzi
            List<Integer> listaUczniów = new ArrayList<Integer>();
            //dodajemy sobie 10 uczniów;
            int a = 10;
            for (int i=1; i < a+1; i++) {
                System.out.println(i);
                listaUczniów.add(i);
            }
            System.out.println(listaUczniów);
            List<Integer> osobyNieobecne = new ArrayList<Integer>();
            //osoby nieobecne
            osobyNieobecne.add(5);
            osobyNieobecne.add(2);
            for(Integer one : osobyNieobecne){
                listaUczniów.remove(one);
                //w tym miejscu ustawisz na false
            }
            List<Integer> szczęśliwyNumerek = new ArrayList<Integer>();
            szczęśliwyNumerek.add(10);
            for(Integer one : szczęśliwyNumerek){
                listaUczniów.remove(one);
                //w tym miejscu ustawisz na false
            }
            List<Integer> osobyAktywne = new ArrayList<Integer>();
            System.out.println(listaUczniów);
            for(Integer one : listaUczniów){
                if(one % 2 == 0) {
                    //przerobić na stream
                    listaUczniów.remove(one);
                }
                System.out.println(listaUczniów);
            }
        }
    }




