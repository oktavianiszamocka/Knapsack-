import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Reader {


    public static Data readfile(Path srcfile)
    {
        ArrayList<String> valuelist = new ArrayList<>();
        ArrayList<String> weightlist = new ArrayList<>();
        String[] temp;
        BufferedReader br;
        int capacity=0;
        try {
            br = new BufferedReader(new FileReader(srcfile.toString()));

            String line = br.readLine();


            capacity = Integer.valueOf(line);
            line = br.readLine();

            while(line!=null){
                temp=line.split(" ");
                valuelist.add(temp[0]);
                weightlist.add(temp[1]);
                line=br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return new Data(capacity,valuelist,weightlist);
    }
}
