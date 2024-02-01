public class DamkaBoard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String row = "";

        for (int i = 1 ;i <= n ; i++ ){
            row = row + "* ";
        }
          for (int i = 1 ;i <= n ; i++ ){
             if(i%2==0){
			System.out.println(" " +row);
          }else {
			System.out.println(row);
		  }
   
    }

}
}
