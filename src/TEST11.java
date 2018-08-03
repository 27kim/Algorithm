import java.util.*;

class TEST11 {
/*

함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
    public static void main(String[] args) {

        TEST11 test = new TEST11();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(9));
    }

    public long solution(long n) {

        String [] arr = String.valueOf(n).split("");

        List<String> list = Arrays.asList(arr);

        Collections.sort(list);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for(int i = list.size()-1 ; i >=0 ; i--){
            sb.append(list.get(i));
        }

        return Long.valueOf(sb.toString());
    }
}