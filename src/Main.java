import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path pathfile = Paths.get("src/8");

        Data dataWithAttr = Reader.readfile(pathfile);

        BruteForce bforce = new BruteForce(dataWithAttr.valuelist,dataWithAttr.weightlist,dataWithAttr.capacity);
        bforce.instructions();

    }
}
