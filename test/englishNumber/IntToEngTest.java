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

}
