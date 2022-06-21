package com.example.randomNumberGenerator;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {

    Service service = new Service();


    @Test
    public void test_Controller(){
        int n = service.sum(5, 5);

        assertThat(n).isEqualTo(10);
    }

}
