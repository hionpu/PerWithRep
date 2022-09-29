import java.util.*;

public class Rpc {
    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        ArrayList<String[]> ans = new ArrayList<>();
        String[] els = {"rock", "paper", "scissors"};
        String[] data = new String[rounds];
        caseGen(ans, rounds, els, 0, data);
        return ans;
    }
    public static void caseGen(ArrayList<String[]> ans, int rounds, String[] els, int index, String[] data){

        int length = els.length;

        for ( int i = 0 ; i < length ; i++ ){
            data[index] = els[i];
            if (index == rounds-1) {
                ans.add(data);
                System.out.println(Arrays.toString(data));
            }
            else caseGen(ans, rounds, els, index+1, data);
        }
    }

    public static void main(String[] args) {
        for (String[] str : Rpc.rockPaperScissors(5)) {
            System.out.println(Arrays.toString(str));
        }
        System.out.println(Rpc.rockPaperScissors(5).size());
    }
}
