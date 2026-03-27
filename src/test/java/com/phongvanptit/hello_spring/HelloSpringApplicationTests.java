package com.phongvanptit.hello_spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("dev")                    // chỉ định dùng profile dev
@TestPropertySource(locations = "file:.env.dev")  // load thẳng file .env.dev
class HelloSpringApplicationTests {

    @Test
    void contextLoads() {
    }

}
