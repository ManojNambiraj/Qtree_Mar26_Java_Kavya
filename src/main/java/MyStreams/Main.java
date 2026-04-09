package MyStreams;

import java.io.*;

public class Main {
    static void main(String[] args) {
//        1. ByteStream
//        try{
//            FileInputStream fis = new FileInputStream("dummy.txt");
//            int data;
//
//            while ((data = fis.read()) != -1) {
//                System.out.print((char) data);
//            }
//
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

//        2. CharStream

//        try{
//            FileReader fr=new FileReader("dummy.txt");
//            int data;
//
//            while((data=fr.read())!=-1){
//                System.out.print((char) data);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        3. BufferReader
//        try{
//            BufferedReader br = new BufferedReader(new FileReader("dummy.txt"));
//            String line;
//
//            while((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//
//            br.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        4. Reading from Keyboard

//        try{
//           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            System.out.println("Enter your name: ");
//            String name = br.readLine();
//
//            System.out.println("Enter your age: ");
//            String age = br.readLine();
//
//            System.out.println("Hello, " + name);
//            System.out.println("Your age: " + age);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        5. BufferedWriter

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("dummy.txt"));

            bw.write("Hello World");
            bw.newLine();
//            bw.flush();
            bw.write("Good Evening...!");
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
