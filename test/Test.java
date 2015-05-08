import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void testƒ[ƒ() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected ="zero";
		String actual = ite.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void test‹ó•¶š() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected ="";
		String actual = ite.translateEng("");
		assertThat(actual,is(expected));
	}
	@Test
	public void test”ÍˆÍŠO() {
		//fail("Not yet implemented");
		IntToEng ite = new IntToEng();
		String expected ="”ÍˆÍŠO‚Å‚·";
		String actual = ite.translateEng(20);
		assertThat(actual,is(expected));
	}

}
