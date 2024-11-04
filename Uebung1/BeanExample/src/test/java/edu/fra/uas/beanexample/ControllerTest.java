package edu.fra.uas.beanexample;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.fra.uas.controller.BeanController;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ControllerTest {

    @Autowired
    private BeanController beanController;

    @Test
    void testController() {
        assertThat(beanController.putMessage("Hello World"))
                    .isEqualTo("Hello World");
    }

    @Test
    void testIncreaseCounter() {
        assertThat(beanController.increaseCounter())
                    .isEqualTo(beanController.getCounter());
    }



}
