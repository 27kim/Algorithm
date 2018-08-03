import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TEST10 {

    public static void main(String[] args) {

        TEST10 test = new TEST10();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(12345));
    }
    public int[] solution(long n) {

        int idx = 0;
        StringBuffer sb = new StringBuffer(String.valueOf(n)).reverse();
        String src = sb.toString();

        String [] sss = src.split("");
        int[] answer = new int[src.length()];

        for(int i = 0 ; i < src.length() ; i ++){
            answer[idx] = Integer.valueOf(sss[idx++]);

        }

        return answer;
    }
}