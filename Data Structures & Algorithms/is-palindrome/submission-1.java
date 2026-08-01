class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanedString = new StringBuilder();
        for(int i=0; i<s.length();i++){
            if((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') || (s.charAt(i)<='9' && s.charAt(i)>='0')){
                cleanedString.append(s.charAt(i));
            }
        }
        String[] stringArray = cleanedString.toString().toLowerCase().split("");
        int left = 0;
        int right = stringArray.length-1;
        boolean isPalindrome = true;
        while(left < right){
            if(!stringArray[left].equals(stringArray[right])){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome;
        
    }
}
