import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {//1
        if (list.size() <= 0) {//2
            throw new IllegalArgumentException("List length should be greater than 0");//3
        }
        int n = list.size();//4
        int rootOfN = (int) Math.sqrt(n);//5
        if (rootOfN * rootOfN  != n) {//6
            throw new IllegalArgumentException("List length should be a perfect square");//7
        }
        List<String> numMines = new ArrayList<>();//8
        for (int i = 0; i < n; i++) {//9
            if (!list.get(i).equals("#")) {//10
                int num = 0;//11
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {//12
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){//13
                        num += 2;//14
                    }
                    else {
                        num  += 1;//15
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){//16
                    num++;//17
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){//18
                    num++;//19
                }
                numMines.add(String.valueOf(num));//20
            }
            else {
                numMines.add(list.get(i));//21
            }
        }//22
        return numMines;//23
    }//24

}