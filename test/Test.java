import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test�[��() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected ="zero";
		String actual = ite.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void test�󕶎�() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected ="";
		String actual = ite.translateEng("");
		assertThat(actual,is(expected));
	}
	@Test
	public void test�͈͊O() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected ="�͈͊O�ł�";
		String actual = ite.translateEng(20);
		assertThat(actual,is(expected));
	}

}
