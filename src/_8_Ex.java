import java.net.*;
import javax.print.DocFlavor;
import javax.swing.*;
import java.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.StringTokenizer;
import sun.security.util.SecurityConstants;


public class _8_Ex {

    public static void main(String[] args) throws IOException {

        float f = 1.1234f;
        System.out.println(f);

        try {


            InputStream inUrl = new URL("http://google.com").openStream();
            readFullyByByte(inUrl);
            System.out.println("\n\n\n");

            InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68});
            readFullyByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();

        } catch (IOException e) {
           // throw new IOException("IOException");
        }
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) !=-1){
                System.out.print((char) oneByte);
        }
    }
}