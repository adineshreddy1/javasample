public class TotalTax
{

  public static int calcTotalTax (int n, int[]arr)
  {
    double sum = 0;
    int i = 0;
    while (i < n)
      {
	if (arr[i] >= 1000)
	  {
	    sum = (arr[i] - 1000) * 0.10 + sum;

	  }
      
	i++;
      }
    // return sum;

    return (int) sum;

  }

  public static void main (String[]args)
  {
    // TODO Auto-generated method stub
    //Sample inputs 
    //No of input 
    int n = 5;
    //No of values to enter
    int[] arr = { 1000, 2000, 3000, 4000, 5000 };
    System.out.println (calcTotalTax (n, arr));
  }

}
