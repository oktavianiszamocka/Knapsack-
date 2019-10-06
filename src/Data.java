import java.util.ArrayList;

public class Data {

    int capacity;
    ArrayList<String> valuelist,weightlist;

    public Data(int capacity, ArrayList<String> valuelist,ArrayList<String> weightlist) {
        this.capacity = capacity;
        this.valuelist = valuelist;
        this.weightlist = weightlist;
    }
}
