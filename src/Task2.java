public class Task2 {
    public static void main(String[] args) {
        int[] array = {12,42,4,42,4146,21,12,241,2222,14141412,2,21,1};

        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
