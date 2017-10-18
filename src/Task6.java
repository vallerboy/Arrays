public class Task6 {
    public static void main(String[] args) {
        int[] a = {4,2,14,24,1,123,13,2,12,4124,112};

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for(int x = i; x < a.length; x++){
                sum += a[x];
            }

            System.out.print(sum + " ");
        }
    }
}
