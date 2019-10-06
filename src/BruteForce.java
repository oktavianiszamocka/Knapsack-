
import java.util.ArrayList;

public class BruteForce {

    ArrayList<String> valuelist,weightlist;
    int capacity;

    public BruteForce(ArrayList<String> valuelist, ArrayList<String> weightlist, int capacity) {
        this.valuelist = valuelist;
        this.weightlist = weightlist;
        this.capacity = capacity;
    }

    public void instructions(){


        int temp,sumvalue=0,sumweight=0,maxvalue=0,maxweight=0;
        int[] vector,lastVector=null;

        for(int i=0;i<Math.pow(2,valuelist.size());i++){
            vector = new int[valuelist.size()];
            temp=i;

            //generate characteristic vector
            for(int j=valuelist.size()-1;j>=0;j--){
                vector[j] = temp%2;
                temp = temp/2;
            }

            for(int j=0;j<valuelist.size();j++){
                if(vector[j]==1){
                    sumvalue+=Integer.parseInt(valuelist.get(j));
                    sumweight+=Integer.parseInt(weightlist.get(j));
                }
            }

            if(sumweight<=capacity && sumvalue>maxvalue){
                maxvalue=sumvalue;
                maxweight=sumweight;
                lastVector=vector;
            }
            sumweight=0;
            sumvalue=0;
        }
        System.out.println("Maxvalue "+maxvalue+"  maxweight "+maxweight+"  capacity "+capacity);
        for(int element: lastVector)
            System.out.print(element+" ");
    }
}
