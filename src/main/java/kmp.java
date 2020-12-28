public class kmp {
    private int[] next ;

    public void getNextArray(String pat){
        next = new int[pat.length()];
        char [] patArray = pat.toCharArray();
        int j = 0;//前缀末尾
        next[0] = 0;
        for (int i = 1; i <pat.length(); i++) {
            while (j>0&&patArray[i]!=patArray[j]){
                j = next[j-1];
            }
            if (patArray[i]==patArray[j]) j++;
            next[i] =j;

        }
    }
    public int strStr(String haystack, String needle) {
        getNextArray(needle);
        int haystackIndex = 0;
        int needleIndex = 0;
        while (needleIndex<needle.length()){
            if (haystackIndex>haystack.length()-1) return -1;
            else if (haystack.charAt(haystackIndex)==needle.charAt(needleIndex)){
                haystackIndex++;
                needleIndex++;
            }else {
                if(needleIndex == 0) haystackIndex++;
                else needleIndex = next[needleIndex-1];
            }
        }
        return haystackIndex-needle.length();
    }

    public static void main(String[] args) {
        String test = "aabaaf";
        kmp a = new kmp();
        System.out.println(a.strStr("mississippi","issip"));
    }
}

