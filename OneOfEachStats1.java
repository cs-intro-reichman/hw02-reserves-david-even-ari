public class OneOfEachStats1 {
    public static void main(String[] args) {
       
      int T = Integer.parseInt(args[0]);
       
      int two =0;
      int three =0; 
      int four =0;

    for (int i=0; i<T ; i++){
         int count = 0; 
         int g =0;
         int b = 0;
       
     while (!((g>=1) && (b>=1))) {
        double num = Math.random();
           if (num>0.5) {
               g++;
               count++;
          } else {
               b++;
               count++;
            }
        }
       
        if (count==2) {
            two++ ; 
         } else { if (count== 3) {
            three++ ; 
         } else {
            four++ ;
      }
       }

         }
         double avr = ((two*2.0+three*3.0+four*4.0)/ T);
         System.out.println("Average: " + avr + " children to get at least one of each gender.");

         System.out.println("Number of families with 2 children: " + two );
         System.out.println("Number of families with 3 children: " + three );
         System.out.println("Number of families with 4 children: " + four );
         
         if ((two>three)&&(two>four)){
            System.out.println("The most comon nymber of children is 2." );   
           } else { if ((three>two)&& (three>four)) {
            System.out.println("The most comon nymber of children is 3." ); 
           } else {
              System.out.println("The most comon nymber of children is 4 or more." ); 
           }
           }
    }

   }
