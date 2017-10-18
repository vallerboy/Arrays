import java.util.Random;

public class Task8a {
    public static void main(String[] args) {
        int[] array = new int[15];

        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(18 - 1) + 1;
        }


        /// ALGORYTM ///

        StringBuilder builder = new StringBuilder();
        for (int i : array) {
             int modulo = i % 37;
            if(!builder.toString().contains(String.valueOf(modulo))){
                builder.append(modulo);
                builder.append(":");
            }
        }

        System.out.println("Suma: " + builder.toString().split(":").length);



    }
}
