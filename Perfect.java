public class Perfect {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(args[0]);
        String numsString = Integer.toString(num);
        String perf = (numsString + " is a perfect number sinse " + numsString + " = 1");
        int sum = 1;

        for (int i = 2; i <= (num-1); i++ ){
             if (num % i == 0){
             String i1 = Integer.toString(i);
                 perf = perf  + " + " + i1 ;
                 sum += i ;
                 

             }

        }
        
          if (num==sum) {
            System.out.println(perf);
           } else {
                System.out.println(numsString + " is not a perfect number ");
            }
		}
	}