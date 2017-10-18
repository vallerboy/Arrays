import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        // Sekcja danych i ich uzupelniania
        int[] array = new int[15];
        int[] dividers = new int[15];

        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = -1;
        }

        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(5 - 1) + 1;
        }
        //// koniec sekcji uzupelniania danych ////

        for(int i = 0; i < array.length; i++){
            array[i] = array[i] % 37;
        }

        for(int i = 0; i < array.length; i++){
            boolean exist = false;
            for(int x = 0; x < dividers.length; x++){
                if(array[i] == dividers[x]){
                    exist = true;
                }
            }
            if(!exist){
                dividers[i] = array[i];
            }
        }


        int sum = 0;
        for (int divider : dividers) {
            if(divider != -1) {
                sum++;
            }
        }

        System.out.println("Suma roznych dzielnkow to: " + sum);
    }
}
