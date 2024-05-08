
public class coins {

	static int coinChange(int coins[], int amount) {

		if (amount == 0)
			return 0;

		int r = Integer.MAX_VALUE;
		int l=coins.length;
		for (int i = 0; i < l; i++) {
			if (coins[i] <= amount) {
				int sub_res = coinChange(coins, amount-coins [i]);

				if (sub_res != Integer.MAX_VALUE && sub_res + 1 < r)
					r = sub_res + 1;
			}
		}
		if(r == Integer.MAX_VALUE || r == 0) {
			return -1;
	}
		
		return r;
	}

	public static void main(String args[]) {
		int coins[] = { 4, 2, 9 };
		int amount= 30;
		
		System.out.println("Minimum coins required is " + coinChange(coins, amount));
	}
}