public class Task3 {
    public static void main(String[] args) {

        int[] someNumbers = {1,1,3,4,5,6,7,8,1,1};

        int maxNumber = 0;
        int maxValue = 0;

        long timeStart = System.nanoTime();
        for(int i = 0; i < someNumbers.length; i++){
            int localValue = 0;

            if(maxNumber == someNumbers[i]){
                continue;
            }

            for(int x = i; x < someNumbers.length; x++){
                if(someNumbers[i] == someNumbers[x]){
                    localValue++;
                }
            }

            if(maxValue < localValue){
                maxValue = localValue;
                maxNumber = someNumbers[i];
            }
        }
        long stopTime = System.nanoTime();

        System.out.println("Czas wykonania: " + (stopTime - timeStart));
        System.out.println("Max: " + maxNumber);
    }
}
