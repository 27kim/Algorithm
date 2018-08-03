import java.util.*;

class TEST2 {

    public static void main(String[] args) {

        TEST2 test = new TEST2();
//        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    public int[] solution(int[] arr) {

        Vector vt = new Vector();

        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0 ){
                vt.add(arr[i]);
            }else{
                if(arr[i] != (Integer)vt.get(vt.size()-1)){
                    vt.add(arr[i]);
                }
            }


        }

        Iterator it = vt.iterator();
        int[] answer = new int[vt.size()];

        int a = 0;
        while (it.hasNext()) {
            answer[a] = (Integer)it.next();
            a++;
        }
        return answer;
      /*  Set set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        Iterator it = set.iterator();

        int[] answer = new int[set.size()];

        int a = 0;
        while (it.hasNext()) {
            answer[a] = (Integer)it.next();
            a++;
        }
        return answer;*/
    }
}