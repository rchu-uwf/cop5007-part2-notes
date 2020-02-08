import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputStreams();
        outputStreams();
        funFile();
        try {
            demoExceptions();
        } catch (Exception e) {
            System.out.println("Caught error in main.");
        }
        interfaceExample();
    }

    private static void inputStreams() {

        Scanner myStream = new Scanner("hands-2-feet-3-arms-4-legs-5");
        myStream.useDelimiter("-");

        String foo = myStream.next();
        int first = myStream.nextInt();

        System.out.println(foo);
        System.out.println(first);

    }

    private static void outputStreams() {

        StringWriter chars = new StringWriter();
        PrintWriter outputStream = new PrintWriter(chars);

        outputStream.printf("%10s", "Chicago");
        System.out.println(chars.toString());
    } //outputStreams

    /*
    He describes in lecture that you should never throw an exception out of main().
        private static void funFile() throws FileNotFoundException {

     */
    private static void funFile() {
        try {
            FileInputStream inFile = new FileInputStream("input.txt");
            Scanner inStream = new Scanner(inFile);
            String firstLine = inStream.nextLine();

            //System.out.println(firstLine);
            FileOutputStream outFile = new FileOutputStream("output.txt");
            PrintWriter outFileStream = new PrintWriter(outFile);

            outFileStream.println("Write out the first line");
            outFileStream.println(firstLine);
            outFileStream.println("Write out the second line");
            outFileStream.println(inStream.nextLine());
            // Need to flush the buffer to disk.
            outFileStream.flush();
            outFile.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }

    } // funFile

    private static void demoExceptions() throws Exception {

        for (int i = 0; i < 5; ++i) {
            try {
                System.out.println("This is the beginning of the try section.");
                if (i < 2) {
                    throw new Exception("First fail.");
                }
                if (i > 2) {
                    throw new Exception("Second fail.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Catch section.");
                ;
            }
        }  // for loop

    } // demoExceptions

    private static void interfaceExample() {
        Zipper myZip = new Zipper();
        myZip.unSnag();

    } // interfaceExample
}
