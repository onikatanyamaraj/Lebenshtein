public class Levenshteinn {
    public static int levenshtein(String source, String target) {
        int len_s = source.length();
        int len_t = target.length();
        int[][] dp = new int[len_s + 1][len_t + 1];
        for (int i = 0; i <= len_s; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= len_t; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= len_s; i++) {
            for (int j = 1; j <= len_t; j++) {
                if (source.charAt(i-1) == target.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + 1);
                }
            }
        }
        System.out.println(dp);
        return dp[len_s][len_t];
    }
}