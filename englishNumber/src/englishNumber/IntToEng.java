package englishNumber;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

	}

	static String translateEng(int n) {
		String[] english = {
				"zero",
				"one",
				"two",
				"three",
				"four",
				"five",
				"six",
				"seven",
				"eight",
				"nine",
				"ten"
		};
        return english[n];
    }

}
