public class TotalTax {
	
	public static int calcTotalTax(int n, int[] arr) {
		int sum = 0;
		int f = arr[0];
		for(int i = 1; i < n; i++) {
			sum += 0.1 * (arr[i] - f);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {1000, 2000, 3000, 4000, 5000};
		System.out.println(calcTotalTax(n, arr));
	}

}
