import java.util.Random;

public class Bonusy {


    private static Random random = new Random();

    public static void parzyste(int ileU){
        int x = random.nextInt(ileU);
        if (x%2==0){
            System.out.println("Wylosowany numer do odpowiedźi to: " + x);
    } else System.out.println("Wylosowany numer do odpowiedźi to: " + (x+1));}

    public static void nParzyste(int ileU){
        int x = random.nextInt(ileU);
        if (x%2!=0){
            System.out.println("Wylosowany numer do odpowiedźi to: " + x);
        } else System.out.println("Wylosowany numer do odpowiedźi to: " + (x+1));}

    public  static  void p3 (int ileU){
        int x = random.nextInt(ileU);
        if (x%3==0){
            System.out.println("Wylosowany numer do odpowiedźi to: " + x);
        } else System.out.println("Wylosowany numer do odpowiedźi to: " + (x+1));}

    public  static  void p5 (int ileU){
        int x = random.nextInt(ileU);
        if (x%5==0){
            System.out.println("Wylosowany numer do odpowiedźi to: " + x);
        } else System.out.println("Wylosowany numer do odpowiedźi to: " + (x+1));}




}
