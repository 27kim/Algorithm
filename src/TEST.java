class TEST {

    public static void main(String[] args) {

        TEST test = new TEST();
        test.solution(1, 1);
        test.solution(5, 24);
        test.solution(5, 31);

    }

    public String solution(int a, int b) {
        String answer = "";

        int month = 0;
        for (int i = 0; i <= a; i++) {
            if (i == 1) {
//                month += b;
            } else if (i == 2) {
                month += 31;
            } else if (i == 3) {
                month += 29;
            } else if (i == 4) {
                month += 31;
            } else if (i == 5) {
                month += 30;
            } else if (i == 6) {
                month += 31;
            } else if (i == 7) {
                month += 30;
            } else if (i == 8) {
                month += 31;
            } else if (i == 9) {
                month += 31;
            } else if (i == 10) {
                month += 30;
            } else if (i == 11) {
                month += 31;
            } else if (i == 12) {
                month += 30;
            }
        }


        int total = month + b;
        int day = total % 7;

        switch (day) {
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }
        return answer;
    }
}