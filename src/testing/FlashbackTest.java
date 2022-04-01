package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlashbackTest {

	Flashback f = new Flashback();

	@Test
	void testCalcularRetencion5() {
		int renta = 6000;

		assertTrue(f.calcularRetencion(renta) == 5);
	}

	@Test
	void testCalcularRetencion15() {
		int renta = 16000;

		assertTrue(f.calcularRetencion(renta) == 15);
	}

	@Test
	void testCalcularRetencion20() {
		int renta = 26000;

		assertTrue(f.calcularRetencion(renta) == 20);

	}

	@Test
	void testCalcularRetencion30() {
		int renta = 36000;

		assertTrue(f.calcularRetencion(renta) == 30);

	}
	@Test
	void testCalcularRetencion24() {
		int renta = 446000;

		assertTrue(f.calcularRetencion(renta) == 45);

	}
	
	@Test
	void testTraducirNotaNegativo() {
		float nota = -1;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("nota no válida"));
		
		
	}
	
	@Test
	void testTraducirNota0() {
		float nota = 1;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("suspenso"));
		
		
	}
	@Test
	void testTraducirNota5() {
		float nota = 5;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("aprobado"));
		
		
	}
	@Test
	void testTraducirNota7() {
		float nota = (float) 6.7;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("bien"));
		
		
	}
	@Test
	void testTraducirNota8() {
		float nota = 8;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("notable"));
		
		
	}

	@Test
	void testTraducirNota9() {
		float nota = (float) 9.5;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("sobresaliente"));
		
		
	}

	@Test
	void testTraducirNota10() {
		float nota = (float) 10;
		String notaNominal = f.traducirNota(nota);
		assertTrue(notaNominal.equals("matrícula de honor"));
		
		
	}
	
	@Test
	void testRealizarCambio2() {
		float dinero = 2;
		float cantidad = 2;
		assertTrue(f.realizarCambio(dinero, cantidad) == 0);
		
	}
	
	@Test
	void testRealizarCambio5() {
		float dinero = 2;
		float cantidad = 5;
		assertTrue(f.realizarCambio(dinero, cantidad) == 2);
		
	}
	
	
}
