import java.util.Random;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
// Alt + Enter for auto imports
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomCharacterTest {
    final static int char_count= 15;        // Specifies number of tests
    Random r = new Random();                // Create a Random Object

    @RepeatedTest(value = char_count)
    public void testRandomLowerCaseLetter(){
        char random_lower = RandomCharacter.getRandomLowerCaseLetter(r);
        assertTrue(random_lower >= 97 && random_lower <= 122);
    }

    @RepeatedTest(value = char_count)
    public void testRandomUpperCaseLetter(){
        char random_upper = RandomCharacter.getRandomUpperCaseLetter(r);
        assertTrue(random_upper >= 65 && random_upper <= 90);
    }

    @RepeatedTest(value = char_count)
    public void testRandomDigitCharacter(){
        char random_digit = RandomCharacter.getRandomDigitCharacter(r);
        assertTrue(random_digit >= 48 && random_digit <= 57);
    }

    @RepeatedTest(value = char_count)
    public void testRandomCharacter(){
        char random_char = RandomCharacter.getRandomCharacter(r);
        assertTrue((random_char >= 97 && random_char <= 122) || (random_char >= 65 && random_char <= 90) || (random_char >= 48 && random_char <= 57));
    }

    @RepeatedTest(value = char_count)
    public void testForPrime(){
        int random_num = Character.getNumericValue(RandomCharacter.getRandomDigitCharacter(r));
        boolean prime_flag = true;          // Default flag set to true
        if(random_num <= 1) {               // Checks for corner cases
            prime_flag = false;
        }
        else{
            int i = 2;
            while(i <= random_num / 2){
                if(random_num % i == 0){
                    prime_flag = false;     // Sets prime_flag to false if it is not prime
                    break;
                }
                ++i;
            }
        }
        System.out.println(random_num);
        assertTrue(prime_flag);
    }
}
