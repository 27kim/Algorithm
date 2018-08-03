import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TEST4 {

    public static void main(String[] args) {

        TEST4 test = new TEST4();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution("1234"));
        System.out.println(test.solution("11as"));
        System.out.println(test.solution("sdasf2324"));
    }

    public boolean solution(String s) {
        boolean answer = false;

        if(s.length()==4 || s.length() == 6){
            char [] arr = s.toCharArray();

            for(char a : arr){
                if(a >= '0' && a <= '9'){
                    answer = true;
                }else{
                    return false;
                }
            }
        }

        return answer;
    }
}