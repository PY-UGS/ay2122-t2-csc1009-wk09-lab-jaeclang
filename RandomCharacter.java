import java.util.Arrays;
import java.util.Random;

public class RandomCharacter {

    // Generate Random Lower Case Letter
    public static char getRandomLowerCaseLetter(Random r){
        return (char)(r.nextInt(26) + 'a');
    }
    // Generate Random Upper Case Letter
    public static char getRandomUpperCaseLetter(Random r){
        return (char)(r.nextInt(26) + 'A');
    }
    // Generate Random Digit Character
    public static char getRandomDigitCharacter(Random r){
        return (char)(r.nextInt(10) + '0');
    }
    // Generate Random Character
    public static char getRandomCharacter(Random r){
        int func_id = r.nextInt(3);
        switch(func_id){
            case 0:
                return getRandomLowerCaseLetter(r);
            case 1:
                return getRandomUpperCaseLetter(r);
            case 2:
                return getRandomDigitCharacter(r);
            default:
                System.out.println("Func_id invalid!"+ func_id);
                return 1;
        }
    }

    public static void main(String[] args){
        Random r = new Random();       // Creates a Random Object
        int char_count = 15;           // Specify the number of times the project runs

        // Creates array to hold random variables generated
        char[] random_lower_char = new char[char_count];
        char[] random_upper_char = new char[char_count];
        char[] random_digit_char = new char[char_count];
        char[] random_char = new char[char_count];

        // Call the functions and fill up each respective array
        for(int i = 0; i < char_count; i++){
            random_lower_char[i] = getRandomLowerCaseLetter(r);
            random_upper_char[i] = getRandomUpperCaseLetter(r);
            random_digit_char[i] = getRandomDigitCharacter(r);
            random_char[i] = getRandomCharacter(r);
        }

        // Print out output
        System.out.println(random_lower_char);
        System.out.println(random_upper_char);
        System.out.println(Arrays.toString(random_digit_char));
        System.out.println(random_char);
    }
}
