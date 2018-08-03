class TEST9 {

    public static void main(String[] args) {

        TEST9 test = new TEST9();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(3));
    }

    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        return answer;
    }
}