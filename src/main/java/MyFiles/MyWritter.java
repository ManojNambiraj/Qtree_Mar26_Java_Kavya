package MyFiles;

import java.io.FileReader;
import java.io.FileWriter;

public class MyWritter {
    static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("dummy.txt", true);

            fw.write("\nHi, how are you?");
            fw.close();
            System.out.println("File Appended");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
