import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public static List<String> printFizzBuzz (int n){
        if ( n <=0){
            return null;
        }

        List<String> result = new ArrayList<>();

        for ( int i =1; i <=n; i++){
            if(i%3 == 0 && i%5 == 0) {
                result.add("FizzBuzz");
            } else if(i%3 == 0 ) {
                result.add("Fizz");
            } else if(i%5 == 0 ) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    } 
    
    public static void main ( String[] args){

        int [] input = {16, 20, -3, 0, 1};

        for ( int i = 0; i < input.length; i ++){
            System.out.print((i+1) + ".\tInput number: ");
            System.out.print(input[i] + " ");

            List<String> result = printFizzBuzz(input[i]);
            System.out.print("Output String: ");

            System.out.println(result == null ? "No output" : result.toString());
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }

}
