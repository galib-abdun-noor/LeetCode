import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> numList = new ArrayList<List<Integer>>();
        numList.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++){
                if(j==0) {
                    list.add(1);
                }
                else if(j==i){
                    list.add(1);
                }
                else {
                    int m = numList.get(i - 1).get(j - 1);
                    int n = numList.get(i - 1).get(j);
                    list.add(m + n);
                }
            }
            numList.add(list);
        }
        return numList;
    }
}
