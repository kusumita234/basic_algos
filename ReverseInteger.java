public class ReverseInteger {
    public static int reverse ( int x) {
        boolean negative = false;
        if ( x< 0) {
            negative = true;
            x *= -1;
        }

        long reversed = 0;

        while ( x >0){
            reversed = 10 * reversed + x %10;
            x = x/10;

        }

        // check if there is overflow
        if ( reversed > Integer.MAX_VALUE) {
            return 0;
        }
        return (negative ? (-1 * (int)reversed): (int) reversed );
        
    }


    public static void main ( String[] args){

        int [] input = {321, -323424, 20, 0, 1, -222};

        for ( int i = 0; i < input.length; i ++){
            System.out.print((i+1) + ".\tInput number: ");
            System.out.print(input[i] + " ");

           
            System.out.print("Reversed Number= ");

            System.out.println(reverse(input[i]));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }
    
}
