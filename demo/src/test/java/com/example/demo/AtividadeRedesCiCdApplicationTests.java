package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AtividadeRedesCiCdApplicationTests {

	@Test
	void testExibirFrase() {
		GislaineController controller = new GislaineController();
		assertDoesNotThrow(() -> controller.exibirFrase());
	}
}
