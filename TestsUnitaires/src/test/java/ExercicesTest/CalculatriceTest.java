package ExercicesTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Exercices.Calculatrice;

class CalculatriceTest
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all 0");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all 2");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each 3");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each 4");
	}

	@Test
	void test()
	{
		System.out.println("Test 1");
		
		Calculatrice calculatrice = new Calculatrice();		
		int result = calculatrice.add(1, 2);
		System.out.println(result);
	}

}
