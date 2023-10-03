package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class AddBinaryTest {
    String a1 = "0001";
    String b1 = "0001";

    String a2 = "1111";
    String b2 = "1";

    String a3 = "10001";
    String b3 = "100";

    String a4 = "111101";
    String b4 = "10";

    String a5 = "0";
    String b5 = "1";
    String a6 = "0";
    String b6 = "0";

    String a7 = "110110";
    String b7 = "10111";

    @Test
    void plusOneTest1() {
        String s = AddBinary.addBinary(a1, b1);
        assertThat(s.equals("0010")).isTrue();
    }

    @Test
    void plusOneTest2() {
        String s = AddBinary.addBinary(a2, b2);
        assertThat(s.equals("10000")).isTrue();
    }

    @Test
    void plusOneTest3() {
        String s = AddBinary.addBinary(a3, b3);
        assertThat(s.equals("10101")).isTrue();
    }
    @Test
    void plusOneTest4() {
        String s = AddBinary.addBinary(a4, b4);
        assertThat(s.equals("111111")).isTrue();
    }
    @Test
    void plusOneTest5() {
        String s = AddBinary.addBinary(a5, b5);
        assertThat(s.equals("1")).isTrue();
    }
    @Test
    void plusOneTest6() {
        String s = AddBinary.addBinary(a6, b6);
        assertThat(s.equals("0")).isTrue();
    }
    @Test
    void plusOneTest7() {
        String s = AddBinary.addBinary(a7, b7);
        assertThat(s.equals("1001101")).isTrue();
    }




}