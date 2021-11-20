// 暴力枚举法

class Solution {
    public int strStr(String haystack, String needle) {
      int n = haystack.length();
      int m = needle.length();
      for (int i = 0; i + m <= n; i++) {
        boolean flag = true;
        for (int j = 0; j < m; j++) {
          if (haystack.charAt(i+j) != needle.charAt(j)) {
            flag = false;
            break;
          }
        }
        if (flag) {
          return i;
        }
      }
      return -1;
    }
}

// @solution-sync:end

class Main {

  public static void main(String[] args) {
    String haystack = "hello";
    String needle = "ll";

    int result = new Solution().strStr(haystack, needle);
    System.out.println(result);
  }

}
