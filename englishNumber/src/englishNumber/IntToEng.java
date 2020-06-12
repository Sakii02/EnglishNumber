package englishNumber;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printEnglishNumber(input);

	}

	public static String printEnglishNumber(int input) {
		if(input < 20) {
        	System.out.println(from0To19(input));
        	return (from0To19(input));
        } else {
			int coreNumber = 10;
			if(input%coreNumber == 0) {
				//20以上で10で割り切れるとき
				System.out.println(divisibleBy10(input/coreNumber -2));
				return divisibleBy10(input/coreNumber -2);
			} else {
				//20以上で10で割り切れない時
				System.out.println(divisibleBy10(input /coreNumber -2) +" "+from0To19(input % coreNumber));
				return (divisibleBy10(input /coreNumber -2) +" "+from0To19(input % coreNumber));
			}
		}
	}

	static String from0To19(int n) {
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
				"fourteen",
				"fifteen",
				"sixteen",
				"seventeen",
				"eighteen",
				"nineteen",
		};
        return english[n];
    }

	static String divisibleBy10(int n) {
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
