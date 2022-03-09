package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void fact_negative_should_produce_an_exception() {
        int n = -1;
        Sample smpl = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> smpl.fact(n));
    }

    @Test
    void fact_zero_should_produce_1() {
        int n = 0;
        Sample smpl = new Sample();
        int result = smpl.fact(n);
        Assertions.assertThat(result).as("Fact(0)").isEqualTo(1);
    }

    @Test
    void fact_5_should_produce_120() {
        int n = 5;
        Sample smpl = new Sample();
        int result = smpl.fact(n);
        Assertions.assertThat(result).as("Fact(5)").isEqualTo(120);
    }

    @Test
    void op_add_1_1_should_produce_2() {
        int a = 1;
        int b = 1;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.ADD, a, b);

        Assertions.assertThat(result).as("ADD 1 and 1").isEqualTo(2);
    }

    @Test
    void op_add_negative_numbers() {
        int a = -12;
        int b = -45;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.ADD, a, b);

        Assertions.assertThat(result).as("ADD -12 and -45").isEqualTo(-57);
    }

    @Test
    void op_add_negative_and_positive() {
        int a = 12;
        int b = -45;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.ADD, a, b);

        Assertions.assertThat(result).as("ADD 12 and -45").isEqualTo(-33);
    }

    @Test
    void op_mult_positive_numbers() {
        int a = 12;
        int b = 10;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.MULT, a, b);

        Assertions.assertThat(result).as("MULT 12 and 1O").isEqualTo(120);
    }

    @Test
    void op_mult_negative_numbers() {
        int a = -12;
        int b = -10;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.MULT, a, b);

        Assertions.assertThat(result).as("MULT -12 and -1O").isEqualTo(120);
    }

    @Test
    void op_mult_by_zero_should_produce_zero() {
        int a = 12345678;
        int b = 0;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.MULT, a, b);

        Assertions.assertThat(result).as("MULT 12345678 and O").isEqualTo(0);
    }

    @Test
    void op_mult_negative_and_positive() {
        int a = -12;
        int b = 10;
        Sample smpl = new Sample();

        int result = smpl.op(Sample.Operation.MULT, a, b);

        Assertions.assertThat(result).as("MULT -12 and 1O").isEqualTo(-120);
    }
}
