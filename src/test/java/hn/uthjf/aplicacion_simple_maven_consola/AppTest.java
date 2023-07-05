package hn.uthjf.aplicacion_simple_maven_consola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;




	public class AppTest {

			
			@BeforeClass
			
			public static void configuracionInicial1() {
				System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
			}
		   
	public void testSuma2(){
				assertTrue(App.sumar(4.5, 3.8) == 8.3);
			}
			
		
			public void testSuma3() {
				assertTrue(App.sumar(0, 0) == 0);
			}
			
		
			public void testSuma4() {
				assertTrue(App.sumar(-1, -1) == -2);
			}
			
		
			public void testResta1() {
				assertTrue(App.restar(1.0,1.0) == 0.0);
			}
			
			
			public void testResta2() {
				assertTrue(App.restar(2.0,1.0) == 1.0);
			}
			
			
			public void testRestaNegativos() {
				assertTrue(App.restar(1.0,2.0) == -1.0);
			}
			
		
			public void testRestaDecimales() {
				assertEquals(App.restar(2.9,2.8), 0.1, 0.0001);
			}
			
			
			public void testMulti1() {
				assertEquals(App.multiplicar(3,3), 9, 0.0001);
			}
			
			
			public void testMulti2() {
				assertEquals(App.multiplicar(0,3), 0, 0.0001);
			}
			
			
			public void testMulti3() {
				assertEquals(App.multiplicar(4,0), 0, 0.0001);
			}
			
		
			public void testMulti4() {
				assertEquals(App.multiplicar(-2,3), -6, 0.0001);
			}
			
			
			public void testMulti5() {
				assertEquals(App.multiplicar(-5,-5), 25, 0.0001);
			}
			
			
			public void testDivi1() {
				assertEquals(App.dividir(4,2), 2, 0.0001);
			}
			
			
			public void testDivi2() {
				assertEquals(App.dividir(0.0,2.0), 0.0, 0.0001);
			}
			
			
			public void testDivi3() {
				assertEquals(App.dividir(2.0,4.0), 0.5, 0.0001);
			}
			
			
			public void testDivi4() {
				assertEquals(App.dividir(1.0,1.0), 1.0, 0.0001);
			}
			
			
			public void testDivi5() {
				assertNull(App.dividir(5,0));
			}
			
			@AfterClass
			public void finalizacionPruebas() {
			
				System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
			}
		
			}

