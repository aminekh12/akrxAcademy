package Day8.Challenges;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Open a file for reading
            reader = new BufferedReader(new FileReader("example.txt"));

        }
         catch (FileNotFoundException e){
             System.out.println("Message : "+e.getMessage());

         }
    }
}
