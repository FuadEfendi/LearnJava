package ca.tokenizer.learn.array.concatenation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcatenationTest {

    int[] input;
    int[] expected;
    Concatenation o;

    @BeforeEach
    void setUp() {
        input = new int[]{1, 2, 3};
        expected = new int[]{1, 2, 3, 1, 2, 3};
        o = new Concatenation();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getConcatenation1() {
        assertArrayEquals(expected, o.getConcatenation1(input));
    }

    @Test
    void getConcatenation2() {
        assertArrayEquals(expected, o.getConcatenation2(input));
    }

    @Test
    void getConcatenation3() {
        assertArrayEquals(expected, o.getConcatenation3(input));
    }
}