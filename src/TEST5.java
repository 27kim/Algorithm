import java.util.Arrays;
import java.util.List;

class TEST5 {

    public static void main(String[] args) {

        TEST5 test = new TEST5();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(new String [] {"Jane","Kim"}));
    }

    public String solution(String[] seoul) {
        String answer = "";

        int x = Arrays.asList(seoul).indexOf("Kim");
        List<String> x1 = Arrays.asList(seoul);

//        for(int i = 0 ; i < seoul.length ; i++){
//            if(seoul[i].equals("Kim"))
//
//        }

        return "김서방은 "+ x + "에 있다";
    }
}