class Solution {
    
    public String[] list = {"", "A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int ans = 0;
        boolean ansFlag = false;

        for (int i = 1; i < list.length; i++) {

            for (int k = 0; k < list.length; k++) {
                if (k == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(list[i]);
                    String str = sb.toString();

                    ans++;

                    if (str.equals(word)) ansFlag = true;
                } else {
                    for (int l = 0; l < list.length; l++) {
                        if (l == 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(list[i]).append(list[k]);
                            String str = sb.toString();

                            ans++;

                            if (str.equals(word)) ansFlag = true;
                        } else {
                            for (int x = 0; x < list.length; x++) {
                                if (x == 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(list[i]).append(list[k]).append(list[l]);
                                    String str = sb.toString();

                                    ans++;

                                    if (str.equals(word)) ansFlag = true;
                                } else {
                                    for (int y = 0; y < list.length; y++) {

                                        StringBuilder sb = new StringBuilder();
                                        sb.append(list[i]).append(list[k]).append(list[l]).append(list[x]).append(list[y]);

                                        String str = sb.toString();

                                        boolean flag = true;

                                        for (int z = 0; z < str.length(); z++) {
                                            if (str.charAt(z) == 'A' || str.charAt(z) == 'E' || str.charAt(z) == 'I' || str.charAt(z) == 'O' || str.charAt(z) == 'U')
                                                continue;
                                            else {
                                                flag = false;
                                                break;
                                            }
                                        }

                                        if (flag) {
                                            ans++;

                                            if (str.equals(word)) {
                                                ansFlag = true;
                                                break;
                                            }
                                        }

                                        if (ansFlag) break;
                                    }
                                }

                                if (ansFlag) break;
                            }
                        }

                        if (ansFlag) break;
                    }
                }

                if (ansFlag) break;
            }

            if (ansFlag) break;
        }

        return ans;
    }
}