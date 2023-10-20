package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BackspaceStringCompareTest {
    //true
    String s1 = "a#bac#";
    String t1 = "ba";

    //false
    String s2 = "a#ba#c#e#";
    String t2 = "ba";


    //true
    String s3 = "a#ba#e#a";
    String t3 = "ba";

    //true
    String s4 = "ab#c";
    String t4 = "ad#c";

    //frue
    String s5 = "ab##";
    String t5 = "c#d#";

    //false
    String s6 = "a#c";
    String t6 = "b";

    //true
    String s7 = "a#####c";
    String t7 = "b###c#cfsdfdf######";

    //false
    String s8 = "abc#";
    String t8 = "bac#";


    @Test
    void testBackspaceStringCompare1() {
        assertThat(BackspaceStringCompare.backspaceCompare(s1, t1)).isTrue();
    }

    @Test
    void testBackspaceStringCompare2() {
        assertThat(BackspaceStringCompare.backspaceCompare(s2, t2)).isFalse();
    }
    @Test
    void testBackspaceStringCompare3() {
        assertThat(BackspaceStringCompare.backspaceCompare(s3, t3)).isTrue();
    }
    @Test
    void testBackspaceStringCompare4() {
        assertThat(BackspaceStringCompare.backspaceCompare(s4, t4)).isTrue();
    }
    @Test
    void testBackspaceStringCompare5() {
        assertThat(BackspaceStringCompare.backspaceCompare(s5, t5)).isTrue();
    }
    @Test
    void testBackspaceStringCompare6() {
        assertThat(BackspaceStringCompare.backspaceCompare(s6, t6)).isFalse();
    }
    @Test
    void testBackspaceStringCompare7() {
        assertThat(BackspaceStringCompare.backspaceCompare(s7, t7)).isTrue();
    }
    @Test
    void testBackspaceStringCompare8() {
        assertThat(BackspaceStringCompare.backspaceCompare(s8, t8)).isFalse();
    }


}