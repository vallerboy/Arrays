import java.util.Arrays;

public class Task3Bonus {
    public static void main(String[] args) {
        int[] someNumbers = {5,5};
      //  1 1 1 1 1 1 1 4 5 5
      //          1 4 5 5 5 5 5 5 5 5
        Arrays.sort(someNumbers);


        for (int i = 0; i < someNumbers.length; i++) {
            System.out.println(someNumbers[i]);
        }

        System.out.println("-------------------");
        
        int candidat = (someNumbers.length / 2) + 1;
        System.out.println(candidat);
        
       int counter = 0;
        for(int i = 0; i < someNumbers.length; i++){
            if(someNumbers[i] == someNumbers[candidat]){
                counter++;
            }
        }

        if(counter >= candidat) {
            System.out.println("Czy tablica ma Krola? " + "TAK");
        }
    }
}
