package ea.slartibartfast.handsonspringbootgradle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SampleUnitTest {

    @Test
    void sampleUnitTest() {
        var test = "test";

        assertThat(test).isEqualTo("test");
        System.out.println("Category: UnitTest");
    }
}
