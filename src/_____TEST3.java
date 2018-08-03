import java.util.*;

class TEST3 {

    public static void main(String[] args) {

        TEST3 test = new TEST3();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(test.solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(test.solution(new int[]{2, 6, 3}, 10));
    }

    public int[] solution(int[] arr, int divisor) {
        List<Integer> array = new ArrayList<>();

        int cnt = 0;
        for(int input : arr){
            if(divisor != 1) {
                if (input % divisor == 0) {
                    array.add(input);
                    cnt++;
                }
            }else{
                array.add(input);
                cnt++;
            }
        }

        if(cnt ==0) array.add(-1);

        int [] answer = new int [array.size()];

        Collections.sort(array);

        for(int i = 0; i < array.size() ; i++){
            answer[i] = array.get(i);
        }


        return answer;
    }
}