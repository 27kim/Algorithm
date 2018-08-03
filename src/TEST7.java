class TEST7 {

    public static void main(String[] args) {

        TEST7 test = new TEST7();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution("aasdsddÎ"));
    }

    boolean solution(String s) {
        boolean answer = true;

        int countP = count(s, 'p');
        int countY = count(s, 'y');

        if(countP != countY) answer = false;

        return answer;
    }

    private int count(String s, char c){
        int result = 0;

        for(char input : s.toLowerCase().toCharArray()){
            if(c == input) result++;
        }

        return result;
    }
}