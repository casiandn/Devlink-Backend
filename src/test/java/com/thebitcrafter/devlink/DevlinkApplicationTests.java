package com.thebitcrafter.devlink;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DevlinkApplicationTests {

	@Test
	void contextLoads() {
	}

}
