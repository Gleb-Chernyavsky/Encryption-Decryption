import java.util.Scanner;

public class StringsWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        String s2;
        if(n > s.length()){
            System.out.println(s);
        }else{
            s = s.substring(n) + s.substring(0, n);
            System.out.println(s);
        }

    }

}
