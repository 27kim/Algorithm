import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TEST12 {
    /*
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     */
    public static void main(String[] args) {

        TEST12 test = new TEST12();
        System.out.println(test.solution(123));
    }


    public int solution(int n) {
        int answer = 0;
        int orginal = n;

//        for (int i = 0; i < String.valueOf(n).length(); i++) {
//            answer += orginal % 10;
//            orginal= orginal/10;
//        }

        while(n>0){
            answer += n %10;
            n = n/10;
        }

        return answer;
    }
}