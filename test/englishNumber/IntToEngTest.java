package englishNumber;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void キーボードで62と入力した時の出力結果() {
		IntToEng itg = new IntToEng();
		String expected = "sixty two";
		String actual = itg.printEnglishNumber(62);
		assertThat(actual, is(expected));
	}
	@Test
	public void キーボードで0と入力した時の出力結果() {
		IntToEng itg = new IntToEng();
		String expected = "zero";
		String actual = itg.printEnglishNumber(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void キーボードで100と入力した時の出力結果() {
		IntToEng itg = new IntToEng();
		String expected = "one hundred";
		String actual = itg.printEnglishNumber(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void キーボードで19と入力した時の出力結果() {
		IntToEng itg = new IntToEng();
		String expected = "nineteen";
		String actual = itg.printEnglishNumber(19);
		assertThat(actual, is(expected));
	}
	@Test
	public void キーボードで20と入力した時の出力結果() {
		IntToEng itg = new IntToEng();
		String expected = "twenty";
		String actual = itg.printEnglishNumber(20);
		assertThat(actual, is(expected));
	}
	@Test
	public void キーボードで21と入力した時の出力結果() {
		IntToEng itg = new IntToEng();
		String expected = "twenty one";
		String actual = itg.printEnglishNumber(21);
		assertThat(actual, is(expected));
	}

}
