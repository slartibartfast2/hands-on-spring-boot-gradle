package ea.slartibartfast.handsonspringbootgradle;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleIntegrationTest {

    @Test
    void sampleIntegrationTest() {
        var test = "test";

        Assertions.assertThat(test).isEqualTo("test");
        System.out.println("Category: IntegrationTest");
    }
}
