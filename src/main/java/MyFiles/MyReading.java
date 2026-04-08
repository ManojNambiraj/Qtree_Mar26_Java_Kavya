package MyFiles;

import java.io.File;
import java.util.Scanner;

public class MyReading {
    static void main(String[] args) {
        File file = new File("dummy.txt");

        try(Scanner reader = new Scanner(file)){
            while(reader.hasNextLine()){
               String data = reader.nextLine();
               System.out.println(data);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
