import java.util.*;

public class Password{
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char ch = 65;
        String str = "";

        final int A = scanner.nextInt();
        final int B = scanner.nextInt();
        final int C = scanner.nextInt();
        final int N = scanner.nextInt();
        for(int i = 0; i < A; i++){
            str = str + ch;
            ch++;
            if(ch > 90){
                ch = 66;
            }
        }
        ch = 122;
        if(str.length()!=0){
            if(str.charAt(str.length()-1) == ch){
                ch--;
            }
        }
        for(int i = 0; i < B; i++){

            str = str + ch;
            ch--;
            if (ch<98){
                ch = 122;
            }
        }
        ch = 48;
        if(str.length()!=0){
            if(str.charAt(str.length()-1) == ch){
                ch++;
            }
        }
        for(int i = 0; i < C; i++){

            str = str + ch;
            ch++;
            if(ch > 57){
                ch = 48;
            }
        }
        ch = 65;
        int def = N - str.length();
        if(str.length()!=0){
            if(str.charAt(str.length()-1) == ch){
                ch++;
            }
        }
        if(str.length() < N){

            for(int i = 0; i < def; i++){
                str = str + ch;
                ch++;
                if(ch > 78){
                    ch = 65;
                }
            }
        }
        System.out.println(str);
    }
}