import java.util.HashMap;

public class The205 {
//    s = "egg", t = "add"
//    public boolean isIsomorphic(String s, String t) {
//        StringBuilder builderS = new StringBuilder();
//        StringBuilder builderT = new StringBuilder();
//        int indexS = 0;
//        int indexT = 0;
//        HashMap<Character,Integer> mapS= new HashMap<Character, Integer>();
//        HashMap<Character,Integer> mapT= new HashMap<Character, Integer>();
//
//        for (int i = 0; i <s.length(); i++) {
//            if (!mapS.containsKey(s.charAt(i))) {
//                indexS++;
//                mapS.put(s.charAt(i),indexS);
//            }
//            if (!mapT.containsKey(t.charAt(i))){
//                indexT++;
//                mapT.put(t.charAt(i),indexT);
//            }
//            builderS.append(mapS.get(s.charAt(i)));
//            builderT.append(mapT.get(t.charAt(i)));
//        }
//        String a = builderS.toString();
//        String b = builderT.toString();
//        boolean res =  a.equals(b);
//        return res;
//    }

    public boolean isIsomorphic(String s, String t) {

        int len = s.length();
        HashMap<Character, Character> mapS = new HashMap<Character, Character>();
        HashMap<Character, Character> mapT = new HashMap<Character, Character>();

        for (int i = 0; i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if( (mapS.containsKey(sChar)&&mapS.get(sChar)!=tChar)||(mapT.containsKey(tChar)&&mapT.get(tChar)!= sChar) ){
                return false;
            }
            mapS.put(sChar,tChar);
            mapT.put(tChar,sChar);
        }
        return true;
    }
    public static void main(String[] args) {
        The205 test = new The205();
        System.out.println(test.isIsomorphic("aa","ab"));


    }
}
