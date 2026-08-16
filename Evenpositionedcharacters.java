class Solution {
      public static void utility(String s) {
          String con = "";

          for (int i = 0; i < s.length(); i++) {
              if (i % 2 == 0) {
                  con += s.charAt(i);
              }
          }

          System.out.print(con);
      }
  }