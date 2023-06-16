package hn.uth.com.proyecto.maven.tarea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {

	static App calculadoraAreas;
	
	@BeforeClass
	public static void inicio() {
		System.out.println("Iniciando prueba sobre el sistema de calculadora");
		calculadoraAreas = new App();
	}
	
	@AfterClass
	public static void fin() {
		System.out.println("Finalizando pruebas sobre el sistema");
	}
	
	// Pruebas sobre las operaciones de la funcion areaCirculo
	@Test
	public void pruebaAreaCirculoEnterosPositivos() {
		assertEquals(153, App.areaCirculo(7));
	}
	@Test
	public void pruebaAreaCirculoValorCero() {
		assertEquals(0, App.areaCirculo(0));
	}
	@Test
	public void pruebaAreaCirculoEnterosNegativos() {
		assertEquals(201, App.areaCirculo(-8));
	}
	
	// Pruebas sobre las operaciones de la funcion areaCuadrado
	@Test
	public void pruebaAreaCuadradoEnterosPositivos() {
		assertEquals(2704, App.areaCuadrado(52));
	}
	@Test
	public void pruebaAreaCuadradoValorCero() {
		assertEquals(0, App.areaCuadrado(0));
	}
	@Test
	public void pruebaAreaCuadradoEnterosNegativos() {
		assertEquals(4761, App.areaCuadrado(-69));
	}
	
	// Pruebas sobre las operaciones de la funcion areaRectangulo
	@Test
	public void pruebaAreaRectanguloEnterosPositivos() {
		assertTrue(App.areaRectangulo(9, 6) == 54);
	}
	@Test
	public void pruebaAreaRectanguloBaseCero() {
		assertTrue(App.areaRectangulo(0, 11) == 0);
	}
	@Test
	public void pruebaAreaRectanguloAlturaCero() {
		assertTrue(App.areaRectangulo(18, 0) == 0);
	}
	@Test
	public void pruebaAreaRectanguloEnterosNegativos() {
		assertNull(App.areaRectangulo(-24, -8));
	}
	
	// Pruebas sobre las operaciones de la funcion areaTriangulo
	@Test
	public void pruebaAreaTrianguloEnterosPositivos() {
		assertTrue(App.areaTriangulo(89, 4) == 356);
	}
	@Test
	public void pruebaAreaTrianguloBaseCero() {
		assertTrue(App.areaTriangulo(0, 56) == 0);
	}
	@Test
	public void pruebaAreaTrianguloAlturaCero() {
		assertTrue(App.areaTriangulo(108, 0) == 0);
	}
	@Test
	public void pruebaAreaTrianguloEnterosNegativos() {
		assertNull(App.areaTriangulo(-89, -15));
	}
}
