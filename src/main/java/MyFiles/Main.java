package MyFiles;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    static void main(String[] args) {
        try{
            File file = new File("dummy.txt");

            if (file.exists()) {
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already exists: " + file.getName());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
