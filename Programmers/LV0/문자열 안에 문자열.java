class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean check = true;
        
        check = str1.contains(str2);
        
        if(check == true) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}