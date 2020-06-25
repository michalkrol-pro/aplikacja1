import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> listaTEST = new ArrayList<Integer>();
        int a = 10;
        for (int i=1; i < a+1; i++) {
            listaTEST.add(i);
        }
        System.out.println(listaTEST);
        Random random = new Random();




       // int z =listaTEST.get(random.nextInt(listaTEST.size()));
         int z =listaTEST.get(random.nextInt(2));
        System.out.println(z);

    }
}