package ex_31_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab_014_Throws {
    public static void main(String[] args) {

         // 🧠 Real-life Analogy:
        //    throws = Main keh raha hoon – complain meri taraf se ho sakti hai, aage handle karo

        //    throw = Main khud complain karta hoon


        //throws use in method

        try {
            readFile();  // method jo exception throw karta hai
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }

    // Method declare kar raha hai ki IOException throw ho sakta hai
    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
        fr.read();
        fr.close();
    }

}
