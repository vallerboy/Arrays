
public class SplitExample {
    public static void main(String[] args) {
        String text = "ALa ma kota, kot ma psa, ala nie ma psa ani kota";

        String[] someArray = text.split("a");
        for (String s : someArray) {
            System.out.println(s);
        }
    }
}
