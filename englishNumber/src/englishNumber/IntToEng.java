package englishNumber;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input%10 == 0 && input > 10) {
        	System.out.println(translateEng2(input/10 -2));
        } else {
        	System.out.println(translateEng(input));
        }

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
				"ten",
				"eleven",
				"twelve",
				"thirteen",
				"fifteen",
				"sixteen",
				"seventeen",
				"eighteen",
				"nineteen",
		};
        return english[n];
    }

	static String translateEng2(int n) {
		//20,30,40...
		String[] english2 = {
				"twenty",
				"thirty",
				"forty",
				"fifty",
				"sixty",
				"seventy",
				"eighty",
				"ninety",
				"one hundred",
		};
		return english2[n];
	}

}
