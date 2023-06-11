package stupid_fizzbuzz;

public class IAttachedABulletVibratorToMyBrain {
	
	public static void main(String[] args) {
		int max = 100000;
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < max; i++) {
			int i2 = -1 * (i + 1);
			if(~i2%5==0 && ~i2%3==0)
				sb.insert(sb.length(), "{" + (-i2 - 1) + ": FizzBuzz" + (i == (max-1) ? "}" : "}, "));
			else if(~i2%3==0)
				sb.insert(sb.length(), "{" + (-i2 - 1) + ": Fizz" + (i == (max-1) ? "}" : "}, "));
			else if(~i2%5==0)
				sb.insert(sb.length(), "{" + (-i2 - 1) + ": Buzz" + (i == (max-1) ? "}" : "}, "));
			else
				sb.insert(sb.length(), "{" + (-i2 - 1) + (i == (max-1) ? "}" : "}, "));
		}
		System.out.println(sb.toString());
	}
	
}
