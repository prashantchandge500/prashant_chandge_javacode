

package Randomaccessfile;

import java.io.*;
import java.io.IOException;

public class Randomaccessfiledemo {

    static final String FILEPATH = "D:\\testdemo.txt";

    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromfile(FILEPATH, 0, 30)));
            WriteFromfile(FILEPATH, "I love MY COuntry", 31);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromfile(String filepath, int position, int size)
            throws IOException {
        RandomAccessFile F = new RandomAccessFile(filepath, "r");
        F.seek(position);
        byte[] bytes = new byte[size];
        F.read(bytes);
        F.close();
        return bytes;
    }

    private static void WriteFromfile(String filepath, String Data, int position) throws IOException {
        RandomAccessFile F = new RandomAccessFile(filepath, "rw");
        F.seek(position);
        F.write(Data.getBytes());
        F.close();
    }
}


    


    
    

