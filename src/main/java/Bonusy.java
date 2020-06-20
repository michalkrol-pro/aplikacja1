import java.util.Random;

public class Bonusy {


    Random random = new Random();

    public  int parzyste(int ileU){
        int x = random.nextInt(ileU);
        if (x%2==0){
        return x;
    } else return x+1;}

    public  int nParzyste(int ileU){
        int x = random.nextInt(ileU);
        if (x%2!=0){
            return x;
        } else return x+1;}

    public  int p3 (int ileU){
        int x = random.nextInt(ileU);
        if (x%3==0){
            return x;
        } else return x+1;}

    public  int p5 (int ileU){
        int x = random.nextInt(ileU);
        if (x%5==0){
            return x;
        } else return x+1;}





}
