import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        for(int i = 0; i <= arrayLength - 1; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("------------------------");

        for(int i = arrayLength - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
