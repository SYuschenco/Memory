import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class _9_Ex {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(new byte[]{1, 2, 5, 7, 9, 11, 12}, 0, 7);
        byte[] bytes = out.toByteArray();

        System.out.println(Arrays.toString(bytes));

        InputStream in = new ByteArrayInputStream(bytes);
        for (int k = 0; k < 11; k++) {
            System.out.println(" " + in.read());
        }
    }
}