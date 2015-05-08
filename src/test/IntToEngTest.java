package test;

import static org.junit.Assert.*;
import inttoeng.IntToEng;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	
	
	@Test

	public void testゼロ() {

	//fail("Not yet implemented");
    IntToEng ite = new IntToEng();	

	String expected ="zero";

	String actual = ite.translateEng(0);

	assertThat(actual,is(expected));

	}


	@Test

	public void test範囲外() {

	//fail("Not yet implemented");

	IntToEng ite = new IntToEng();

	String expected ="範囲外です";

	String actual = ite.translateEng(-1);

	assertThat(actual,is(expected));

	}
	
	
	//ここから0-19
	
	
	@Test

	public void test14() {

	

	IntToEng ite = new IntToEng();

	String expected ="fourteen";

	String actual = ite.translateEng(14);

	assertThat(actual,is(expected));

	}
	
	@Test

	public void test11() {

	

	IntToEng ite = new IntToEng();

	String expected ="eleven";

	String actual = ite.translateEng(11);

	assertThat(actual,is(expected));

	}
	
	@Test

	public void test12() {

	

	IntToEng ite = new IntToEng();

	String expected ="twelve";

	String actual = ite.translateEng(12);

	assertThat(actual,is(expected));

	}

	//ここから20-99
	@Test

	public void test40() {

	

	IntToEng ite = new IntToEng();

	String expected ="forty";

	String actual = ite.translateEng(40);

	assertThat(actual,is(expected));

	}
	
	@Test

	public void test97() {

	

	IntToEng ite = new IntToEng();

	String expected ="ninety seven";

	String actual = ite.translateEng(97);

	assertThat(actual,is(expected));

	}
	
	@Test
	public void test100() {

		

		IntToEng ite = new IntToEng();

		String expected ="one hundred";

		String actual = ite.translateEng(100);

		assertThat(actual,is(expected));

		}
	
	@Test
	public void test234() {

		

		IntToEng ite = new IntToEng();

		String expected ="two hundred thirty four";

		String actual = ite.translateEng(234);

		assertThat(actual,is(expected));

		}
	
	@Test
	public void test2340() {

		

		IntToEng ite = new IntToEng();

		String expected ="two thousand three hundred forty";

		String actual = ite.translateEng(2340);

		assertThat(actual,is(expected));

		}
	@Test
	public void test5678() {

		

		IntToEng ite = new IntToEng();

		String expected ="five thousand six hundred  seventy eight";

		String actual = ite.translateEng(5678);

		assertThat(actual,is(expected));

		}
	@Test
	public void test9000() {

		

		IntToEng ite = new IntToEng();

		String expected ="nine thousand";

		String actual = ite.translateEng(9000);

		assertThat(actual,is(expected));

		}
}
