

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CommandLine {

    public static void main(String[] args) {
        String mode = "enc";
        int key = 0;
        String data = "";
        String out = "";
        String in = "";
        String alg = "shift";

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-mode")) {
                mode = args[i + 1];

            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);

            } else if (args[i].equals("-data")) {
                data = args[i + 1];

            } else if (args[i].equals("-out")) {
                out = args[i + 1];

            } else if (args[i].equals("-in")) {
                in = args[i + 1];
            } else if (args[i].equals("-alg")) {
                alg = args[i + 1];
            }
        }
        File file = new File(in);
        String str = "";
        if (!in.equals("")) {
            try {
                Scanner scanner = new Scanner(file);
                str = scanner.nextLine();
                scanner.close();
            } catch (Exception e) {
                System.out.println("Error is Error");
            }
        }
        if (data.equals("")) {
            data = str;
        }
        File file1 = new File(out);
        PrintWriter pw = null;
        if (!out.equals("")) {
            try {
                pw = new PrintWriter(file1);
            } catch (Exception e) {
                System.out.println("Error is Error 1");
            }
        }


        switch (mode) {

            case "enc":
                if (alg.equals("unicode")) {
                    for (char item : data.toCharArray()) {
                        char shiftItem = (char) (item + key);
                        if (out.equals("")) {

                            System.out.print(shiftItem);
                        } else {

                            pw.print(shiftItem);
                        }
                    }
                } else if (alg.equals("shift")) {
                    System.out.println("work2");
                    for (char item : data.toCharArray()) {
                        char shiftItem = item;
                        System.out.println(shiftItem);
                        if(item >= 'a' && item <= 'z'){
                            int t = 'a'; // 96
                            shiftItem = (char)((((int)item - 'a' + key)%26) + 'a');
                        } else if (item >= 'A' && item <= 'Z') {
                            int T = 'A';
                            shiftItem = (char)((((int)item - 'a' + key)%26) + 'a');;
                        }
                        System.out.println(shiftItem + "4");
                        if (out.equals("")) {
                            System.out.println("work3");
                            System.out.print(shiftItem);
                        } else {

                            pw.print(shiftItem);
                        }
                    }
                }
                break;
            case "dec":
                if (alg.equals("unicode")) {
                    for (char item : data.toCharArray()) {
                        char shiftItem = (char) (item - key);
                        if (out.equals("")) {
                            System.out.print(shiftItem);
                        } else {

                            pw.print(shiftItem);
                        }
                    }
                } else if (alg.equals("shift")) {
                    System.out.println("work1");
                    for (char item : data.toCharArray()) {
                        char shiftItem = item;
                        if (item >= 'a' && item <= 'z') {
                            int t = 'a';
                            if ((item - 'a' - key) % 26 < 0){
                                shiftItem = (char)(((item - 'a' - key) % 26) + 26 + 'a');
                            } else {
                                shiftItem = (char) ((((int) item - 'a' - key) % 26) + 'a');
                            }
                        } else if (item >= 'A' && item <= 'Z') {
                            int T = 'A';
                            if ((item - 'a' - key) % 26 < 0){
                                shiftItem = (char)(((item - 'a' - key) % 26) + 26 + 'a');
                            } else {
                                shiftItem = (char) ((((int) item - 'a' - key) % 26) + 'a');
                            }
                        }

                        if (out.equals("")) {

                            System.out.print(shiftItem);
                        } else {

                            pw.print(shiftItem);
                        }
                    }
                }
                break;
        }
        try {
            pw.close();
        } catch (Exception e) {

        }
    }
}