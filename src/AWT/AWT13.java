package AWT;


import javax.print.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AWT13 {
    public static void main(String[] args) throws IOException, PrintException {
        DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
        PrintService[] service = PrintServiceLookup.lookupPrintServices(flavor, null);
        InputStream inputStream = new FileInputStream("6784023.jpg");
        Doc doc = new SimpleDoc(inputStream, flavor, null);
        if (service.length > 0) {
            DocPrintJob printJob = service[0].createPrintJob();
            printJob.print(doc, null);

        }


    }
}
