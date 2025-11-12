import java.util.Arrays;
public class PlusOneToInteger {
    
    public static int[] plusOne ( int [] digits) {
        if ( digits == null || digits.length == 0){
            return null;
        }

        for ( int i = digits.length -1 ; i >= 0; i--){
            if (digits[i] <9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] =0;
            }

        }

        int [] result = new int [digits.length +1];
        result[0] = 1;
        return result;
        
    }

    public static void main ( String[] args){

        int [][]input = {
            {9, 9, 9, 9},
            {1, 1, 1, 1},
            {2,0, 0, 0},
            {1, 9, 2, 9},
            {6, 8, 3, 8},

        };

        for ( int i = 0; i < input.length; i ++){
            System.out.print((i+1) + ".\tInput number: ");
            System.out.print(Arrays.toString(input[i]) + " ");

           
            System.out.print("Number + 1= ");

            System.out.println(Arrays.toString(plusOne(input[i])));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }
}
