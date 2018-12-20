import org.junit.Test;

import static org.junit.Assert.*;

public class prog1Test {

    @Test
    public void main() {
        prog1 myprog=new prog1();
        assertEquals("Given number 12321 is Palindrome and the sum of even numbers is less than 25",myprog(12321));
    }
}