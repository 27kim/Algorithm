import java.util.Arrays;
import java.util.List;

class TEST6 {

    public static void main(String[] args) {

        TEST6 test = new TEST6();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(3,5));
    }

    public long solution(int a, int b) {
        long answer = 0;

        if(a ==b){
            answer = a;
        }else{
            int min = Math.min(a,b);
            int max = Math.max(a,b);

            for(int i = min; i <= max; i++){
                answer +=i;
            }
        }

        return answer;
    }
}