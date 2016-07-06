package by.grodno.zagart.java.intelisoft;

import java.io.*;

/**
 * Hello world!
 *
 */
public class Main {
    final static private String PATH = "C:\\Users\\intelisoft\\Desktop\\file.txt";

    public static void main( String[] args ) {
//        outputStream();
        inputStream();
    }

    private static void inputStream() {
        InputStream stream = null;
        try {
            stream = new BufferedInputStream(new FileInputStream(PATH));
            while (stream.available() > 0) {
                System.out.print(stream.read());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeCloseable(stream);
        }
    }

    private static void outputStream() {
        OutputStream stream = null;
        try {
            stream = new FileOutputStream(PATH);
            System.setOut(new PrintStream(stream));
            for (byte i = Byte.MIN_VALUE; i < Byte.MAX_VALUE; i++) {
                System.out.println(i);
            }
            stream.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            closeCloseable(stream);
        }
    }

    private static void closeCloseable(Closeable object) {
        try {
            if (object != null) {
                object.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
