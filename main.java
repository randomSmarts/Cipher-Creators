import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        ArrayList<String> input = new ArrayList<>(); // Create an ArrayList object
        ArrayList<String> output = new ArrayList<>(); // Create an ArrayList object
        ArrayList<String> ciphertext = new ArrayList<>(); // Create an ArrayList object
        StringBuilder finalWord = new StringBuilder();
        boolean checking = false;
        String hallo = "";

        while (!checking) {
            System.out.println("Please input your plaintext without any numbers: ");
            hallo = myObj.nextLine();

            if (hallo.contains("0") || hallo.contains("1") || hallo.contains("2") || hallo.contains("3") ||
                    hallo.contains("4") || hallo.contains("5") || hallo.contains("6") || hallo.contains("7") ||
                    hallo.contains("8") || hallo.contains("9")) {
                System.out.println("This plaintext contains numbers, please try again.");
                checking = false;
            } else {
                checking = true;
            }
        }

       int length = hallo.length();

        for (int i=0; i < length; i++) {
            input.add(String.valueOf(hallo.charAt(i)));
        }

        for (String s : input) {
            if (s.contains(" ")) {
                output.add(" ");
            } else {
                if (s.contains("a") || (s.contains("e") || (s.contains("i") ||
                        (s.contains("o") || (s.contains("u")))))) {
                    output.add("v");
                } else {
                    output.add("c");
                }
            }
        }

        for (String s : output) {
            if (s.contains("c")) {
                ciphertext.add("0");
            } else if (s.contains("v")) {
                ciphertext.add("1");
            } else {
            }
        }

        System.out.println(input);
        System.out.println(output);

        for (String s : ciphertext) {
            finalWord.append(s);
        }

        System.out.println(finalWord);
    }
}
