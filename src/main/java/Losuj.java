import java.util.Random;

public class Losuj {
    public static void main(String[] args) {
        System.out.println("Losowanie");
        Random random = new Random();
        int bonus = (1+(random.nextInt(4)));
        System.out.println(bonus);
    }
}
