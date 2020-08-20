import java.util.Scanner;

public class KeyToPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef";
        char[] example = str1.toCharArray();
        int n = scanner.nextInt();
        char[] array = str.toCharArray();
        char o;
        for(int i = 0; i < array.length; i++){
            if(array[i] != ' ') {
                o = array[i];
                array[i] = example[str1.indexOf(o) + n];
            }
        }
        System.out.println(array);
    }
}
