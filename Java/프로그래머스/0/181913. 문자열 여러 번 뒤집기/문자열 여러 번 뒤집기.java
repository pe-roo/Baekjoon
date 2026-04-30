class Solution {
    public String solution(String my_string, int[][] queries) {
        
        
        char[] tmpArr = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			while(start <= end) {
				char temp = tmpArr[start];
				tmpArr[start] = tmpArr[end];
				tmpArr[end] = temp;
				
				start++;
				end--;
			}
			
		}
        
        String answer = String.valueOf(tmpArr);
        return answer;
    }
}