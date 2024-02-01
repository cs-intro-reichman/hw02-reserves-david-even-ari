public class OneOfEach {
    public static void main(String[] args) {
       
      int count = 0; 
      int g =0;
      int b = 0; 
      String all = "";

       while (!((g>=1) && (b>=1))) {
        double num = Math.random();
         if (num>0.5) {
            g++;
            all = all + "g ";
            count++;

          } else {
            b++;
              all = all + "b ";
              count++;
            }
       }
        
         System.out.println(all);
         System.out.println("you made it... and you now have " + count + " children");
    }
}
