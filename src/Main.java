import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        formattedOutput();
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

    private static void formattedOutput() {
        double pi = 3.14159265359;
        double G = 6.67408e-11;
        String foo = "Ricardo";

        System.out.println("Show formatting examples");
        // Notice that the number was rounded.
        System.out.printf("Default float format: %f \n",99.1234567890);
        System.out.printf("Pi is %f, and G is %f \n",pi,G);
        System.out.printf("Pi is %f, and G is %.15f \n",pi,G);
        System.out.printf("Pi is %f, and G is %.18f \n",pi,G);
        System.out.println();
        /* Goal is to get values to align.
        The 18 describes the minimum width.
        The + needs to be included in the character count.
         */
        System.out.println("Show minimum column width and alignment.");
        // Notice the padding with zeros on the right.
        System.out.println("Padding float with zeros. - begin");
        System.out.printf("%+18f\n",50.1);
        System.out.printf("%+18.3f\n",50.1);
        // Notice the padding with zeros on the left
        System.out.printf("%+018.3f\n",50.1);
        System.out.println("Padding float with zeros. - end");

        System.out.printf("%+18f\n",pi);
        System.out.printf("%+18.15f \n",G);
        System.out.printf("%18s","Ricardo \n");
        System.out.println();

        System.out.println("Padding examples - begin");
        System.out.printf("%15s \n","pad left");
        System.out.printf("%+18f\n",pi);
        System.out.printf("%-15s \n","pad right");
        System.out.printf("%-+18f\n",pi);
        System.out.println("Padding examples - end");
        System.out.println();

        System.out.println("Substring functionality - begin");
        System.out.printf("%12s \n",foo);
        System.out.printf("%12.3s \n",foo);
        System.out.printf("%-12.3s \n",foo);
        // Using the minus without a width specified is an error. Must specify a width when using minus.
        //System.out.printf("%-.3s \n",foo);
        System.out.println("Substring functionality - end");
        System.out.println();

        System.out.println("Displaying the plus sign - begin");
        System.out.printf("%+18f\n",pi);
        System.out.printf("+%18f\n",pi);
        System.out.println("Displaying the plus sign - end");

    }  //formattedOutput

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
