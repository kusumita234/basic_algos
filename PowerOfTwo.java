
public class PowerOfTwo {
    public static boolean isPowerOfTwo ( int n) {
        if ( n  == 0){
            return false;
        }
        long  i = 1;
        while ( i < n){
            i = i *2;
        }
        return i == n;
    }

    public static void main ( String[] args){

        int [] input = {16, 1, 2, 0, 23, 36};

        for ( int i = 0; i < input.length; i ++){
            System.out.print((i+1) + ".\tInput number: ");
            System.out.print(input[i] + " ");

           
            System.out.print("Is Power of 2? : ");

            System.out.println(isPowerOfTwo(input[i]));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }

}
