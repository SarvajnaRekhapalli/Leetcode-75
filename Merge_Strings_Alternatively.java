class Merge_Strings_Alternatively {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String result="";
        while(i<word1.length()||i<word2.length())
        {
            if(i<word1.length())
            {
               result=result+word1.charAt(i);
            }
            if(i<word2.length())
            {
               result=result+word2.charAt(i);
            }
             i=i+1;
        }
        return result;
    }
    public static void main(String[] args) {
        Merge_Strings_Alternatively obj = new Merge_Strings_Alternatively();
        String word1 = "abc";
        String word2 = "pqr";
        String mergedString = obj.mergeAlternately(word1, word2);
        System.out.println(mergedString); 
    }
}