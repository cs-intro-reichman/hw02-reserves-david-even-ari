public class DamkaBoard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String row = "";

        for (int i = 1 ;i <= n ; i++ ){
            row = row + "*";
        }
          for (int i = 1 ;i <= n ; i++ ){
              System.out.println(row);
          }
   
    }

}
