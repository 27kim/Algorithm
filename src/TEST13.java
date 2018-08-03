class TEST13 {
    /*
        예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
        str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
     */
    public static void main(String[] args) {

        TEST13 test = new TEST13();
        System.out.println(test.solution("-123"));
    }


    public int solution(String s) {

        int answer = 0;

//        if(s.startsWith("-")){
//            answer = Integer.parseInt(s.substring(1,s.length())) ;
//            answer = -answer;
//        }else{
//            answer = Integer.parseInt(s);
//        }


        return Integer.parseInt(s);
    }
}