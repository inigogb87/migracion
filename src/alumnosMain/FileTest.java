package alumnosMain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSplit(){
	String linea = "Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR";
	
	String []aCampos = linea.split(",");
	
	assertEquals("Ted", aCampos[0]);
	assertEquals("Upton", aCampos[1]);
	assertEquals("Sant Andreu De La Barca", aCampos[2]);
	assertEquals("8", aCampos[3]);
	assertEquals("tedfupton@mailinator.com", aCampos[4]);
	assertEquals("12277015Y", aCampos[5]);
	assertEquals("TRABAJADOR", aCampos[6]);

	}
}