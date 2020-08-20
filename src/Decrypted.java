
import java.util.Arrays;
import java.util.Scanner;

public class Decrypted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cho = scanner.nextLine();
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        char[] charArray = str.toCharArray();
        String dec = "dec";
        String enc = "enc";
        if(cho.equals(dec)){
            for(int i = 0; i < charArray.length; i++ ){
                charArray[i] = (char)(charArray[i] - n);
            }
        }
        if(cho.equals(enc)){
            for(int i = 0; i < charArray.length; i++ ){
                charArray[i] = (char)(charArray[i] + n);
            }
        }
        System.out.println(charArray);
    }
}
