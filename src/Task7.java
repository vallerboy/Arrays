public class Task7 {
    public static void main(String[] args) {
        int[] array = {12,23,12,235,2,122,23,12};

        for(int i = 0; i < array.length; i++){
            int counter = 0;
            for(int x = i; x < array.length; x++){
                if(array[i] == array[x]){
                    counter++;
                }
            }

            if(counter >= 3){
                System.out.println("tak");
                System.exit(0);
            }
        }

    }
}
