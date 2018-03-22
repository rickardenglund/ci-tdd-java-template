package se.cygni.palmithor.tdd;


import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void test() {
        assertThat(calculator.sumAll().get()).isEqualTo(0);
    }

    @Test
    public void test2() {
        assertThat(calculator.sumAll(null)).isEqualTo(Optional.empty());
    }

    @Test
    public void test3() {
        assertThat(calculator.sumAll(1,2,3)).get().isEqualTo(6);
    }

}