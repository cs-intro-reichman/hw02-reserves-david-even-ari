public class Reverse {
   
    public static void main(String[] args) {
        String str = args[0];
        int n = (str.length())-1;
		int length = (str.length());
       
        
        while (n != -1) {
            System.out.print(str.charAt(n));
            n-- ;
           
        }
        int middlenum =(length/2);
		char middle =str.charAt(middlenum);
        
      
		 System.out.println("");
	     System.out.println("The middle character is " + middle);
	      

	 }
 }
	
    
