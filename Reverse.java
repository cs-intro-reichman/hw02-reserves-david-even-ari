public class Reverse {
   
    public static void main(String[] args) {
        String str = args[0];
        int n = (str.length())-1;
       
        
        while (n != -1) {
            System.out.print(str.charAt(n));
            n-- ;
           
        }
        System.out.println(" ");
        System.out.println("The middle character is " + str.charAt(n/2));

    }
}