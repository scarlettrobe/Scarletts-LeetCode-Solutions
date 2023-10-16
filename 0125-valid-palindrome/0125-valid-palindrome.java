class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            if(!Character.isLetterOrDigit(start)){
                i += 1;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                j -= 1;
                continue;
            }
            if(Character.toLowerCase(start) != Character.toLowerCase(end) ){
                return false;
            }
            i +=1;
            j -=1;
        }

    return true;



    }
}