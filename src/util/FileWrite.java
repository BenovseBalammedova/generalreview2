package util;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class FileWrite {
    public static void writefile(String filename,String message) {
        try{
        FileWriter writer = new FileWriter("text.file",true);
        BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Welcome to javaTpoint.");
            buffer.close();
            System.out.println("Success");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }




}

