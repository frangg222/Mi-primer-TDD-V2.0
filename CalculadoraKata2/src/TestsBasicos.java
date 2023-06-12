import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestsBasicos {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Una_nueva_calculadora_debe_iniciar_en_cero() {
		Calculadora calc=new Calculadora();
		Assert.assertEquals(0,calc.valor());
	}
	
	@Test
	public void sumar_2_mas_3_debe_dar_5() {
		Calculadora calc=new Calculadora();
		calc.Sumar(2,3);
		Assert.assertEquals(5 , calc.valor());
	}


	@Test
	public void sumar_4_mas_3_debe_dar_7() {
		Calculadora calc=new Calculadora();
		calc.Sumar(4,3);
		Assert.assertEquals(7 , calc.valor());
	}

}
