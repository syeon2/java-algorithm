class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for (int i = 0; i < queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            int s = queries[i][0];
            int e = queries[i][1];
            
            String s1 = answer.substring(0, s);
            String s2 = answer.substring(s, e + 1);
            String s3 = answer.substring(e + 1);
            
            answer = s1.concat(sb.append(s2).reverse().toString()).concat(s3);
        }
        
        return answer;
    }
}