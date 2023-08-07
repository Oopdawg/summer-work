import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;


public class BaseConverter {

    BaseConverter(){
        // Initialize digit to value mappings
        // Manages base 2 to 36

        // adds digits 0 to 9
        for (int i = 0; i < 10; i++){
            digitToValue.put(Integer.toString(i), i);
            valueToDigit.put(i, Integer.toString(i));
        }
        // adds letters A to Z
        int value = 0;
        for (char c = 'A'; c <= 'Z'; c++){ // c cycles through all the letters with ASCII values
            value = 10 + (c - 'A'); // Calculates value using ASCII values. The +10 is because 0 through 9 is already mapped to the digits
            digitToValue.put(Character.toString(c), value);
            valueToDigit.put(value, Character.toString(c));
        }
    }

    // Dictionary to get character digits to int value
    // eg A = 10
    HashMap<String, Integer> digitToValue = new HashMap<>();

    // Dictionary to get int value to digits
    HashMap<Integer, String> valueToDigit = new HashMap<>();


    ArrayList<String> startNumberDigits = new ArrayList<>();
    ArrayList<Integer> startNumberDigitsValues = new ArrayList<Integer>();
    int startBase = 0;
    int endBase = 0;

    public void askInputs(){
        // asks for the number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number ranging with a base ranging from 2 to 36");
        String numString = (scanner.nextLine()).toUpperCase(); // default to upper case for digits

        // List of every digit of the number
        String[] numStringSplit = numString.split(""); 
        ArrayList<String> digitStringArray = new ArrayList<>(Arrays.asList(numStringSplit));
        this.startNumberDigits = digitStringArray;


        // asks for the start base and converts it to an int
        System.out.println("Input the base of that number");
        long startBaseLong = scanner.nextLong(); // gets the base of the number
        startBase =(int)startBaseLong;

        
        // asks for the end base and converts it to an int
        System.out.println("Input the base to convert to");
        long endBaseLong = scanner.nextLong(); // gets the base to convert the number to
        endBase =(int)endBaseLong;

        scanner.close(); // stops recording user input

    }


    public void validateInputs(){ // bool function OR throw exceptions here OR both

        // invalid start bases
        if (startBase < 2 || startBase > 36){
            throw new IllegalArgumentException("Invalid start base: " + startBase);
        }

        // invalid end bases
        else if (endBase < 2 || endBase > 36){
            throw new IllegalArgumentException("Invalid end base: " + endBase);
        }

        // how to implement possible tenery operator
        else for (String s : startNumberDigits){
            if (digitToValue.getOrDefault(s, null) == null){
                throw new IllegalArgumentException("Illegal character: " + s + "\n Please input a number with digits between 0 Z");
            }
        }
    }

    public static void main(String[] args){
        BaseConverter converter = new BaseConverter();
        
        converter.askInputs();
        converter.validateInputs();
        String result = converter.convert();
        System.out.println("Result:"+result);
    }
    
    public String convert(){
        
        for (String s: startNumberDigits){
            startNumberDigitsValues.add(digitToValue.get(s));
        }
        Collections.reverse(startNumberDigitsValues);

        int numInBase10 = 0;
        for (int i = 0; i < startNumberDigitsValues.size(); i++){
            int digit = startNumberDigitsValues.get(i);
            if (digit >= startBase){
                throw new IllegalArgumentException("Digit is greater than base: " + digit);
            }
            else {
                numInBase10+= digit*Math.pow(startBase, i);

            }
        }
        if (endBase == 10 || numInBase10 < endBase){
            return Integer.toString(numInBase10);
        }
        
        ArrayList<String> finalNumber = new ArrayList<>();
        int quotient = numInBase10;
        int remainder = 0;

        do{
            remainder = quotient % endBase;
            quotient /= endBase;
            finalNumber.add(valueToDigit.get(remainder));
        }
       while (quotient != 0);

        Collections.reverse(finalNumber);
        return String.join(", ", finalNumber);
    }
}