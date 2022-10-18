import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
        FileInputStream in = new FileInputStream("senators.json");
        List<Senator> senators = SenatorListReader.readSenatorList(in);
        if (args[0].equals("a")) {
            new AlphabeticalPrinter().print(senators);
        } else {
            new ByStatePrinter().print(senators);
        }
    }
    }

}
