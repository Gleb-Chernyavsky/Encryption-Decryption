import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UselessProgram {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\gleb7\\Downloads\\dataset_91065.txt";
        int max =  -1000;
        String string = "";
        try {
            string = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            System.out.println("nope");
        }
        String[] str = string.split(" ");

        int count = 0;

            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int i = scanner.nextInt();
                if(i == 0){
                    break;
                }
                if(i % 2 == 0){
                    count++;
                }
            }
        System.out.println(count);
        }


    }
