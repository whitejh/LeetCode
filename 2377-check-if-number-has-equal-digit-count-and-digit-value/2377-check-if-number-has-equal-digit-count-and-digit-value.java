class Solution {
    public boolean digitCount(String num) {

        int[] count = new int[10]; // 0~9까지 숫자 빈도 카운트 배열
        char[] text = num.toCharArray(); // 문자열을 문자 배열에 저장

        // 1. 각 숫자 등장 횟수 세기
        for(char c : text) {
            count[c - '0']++; // 문자 '0' 빼서 정수화
        }

        for (int i = 0; i < num.length(); i++) {
            if(count[i] != num.charAt(i) - '0') { // 비교
                return false; // 다르면 false
            }
        }

        return true; // 일치하면 true
    }
}