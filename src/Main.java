import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputStreams();
        outputSteams();
        funFile();
    }

    private static void inputStreams() {

        Scanner myStream = new Scanner("hands-2-feet-3-arms-4-legs-5");
        myStream.useDelimiter("-");

        String foo = myStream.next();
        int first = myStream.nextInt();

        System.out.println(foo);
        System.out.println(first);

    }

    private static void outputSteams() {

        StringWriter chars = new StringWriter();
        PrintWriter outputStream = new PrintWriter(chars);

        outputStream.printf("%10s","Chicago");
        System.out.println(chars.toString());
    }

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

            outFileStream.println(firstLine);
            outFileStream.flush();
            outFile.close();

        } catch(FileNotFoundException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }

    } // end funFile
}
