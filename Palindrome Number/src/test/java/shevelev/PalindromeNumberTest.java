package shevelev;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.PalindromeNumber.isPalindrome;

class PalindromeNumberTest {
    private static final int NUMBER_5 = 5;
    private static final int NUMBER_50 = 50;
    private static final int NUMBER_505 = 505;
    private static final int NUMBER_5005 = 5005;


    @Test
    void testPalindromeNumber() {
        assertThat(isPalindrome(NUMBER_5)).isTrue();
        assertThat(isPalindrome(NUMBER_50)).isFalse();
        assertThat(isPalindrome(NUMBER_505)).isTrue();
        assertThat(isPalindrome(NUMBER_5005)).isTrue();
    }
}