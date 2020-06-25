import java.util.Random;

public class Test {
    public static void main(String[] args) {

        System.out.println("Teraz losujemy jeden z 4 bonusów");
        Random random = new Random();
        int bonus = (1+(random.nextInt(4)));
        System.out.println("Tym razem wylosowano bonus numer:  "+ bonus);


    }
}
