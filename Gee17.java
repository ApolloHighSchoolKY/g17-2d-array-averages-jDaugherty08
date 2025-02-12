public class Gee17{
  public static void main(String[] args)
  {

  int[][] ray = new int[7][7];

  //populate the array with seqential numbers
  /*
   1 2 3  4  5  6  7
   8 9 10 11 12 13 14
   ...
  */
  int nums = 0;
  for(int row =0; row<ray.length; row++)
  {
  for(int col = 0; col<ray[row].length; col++)
  {
    nums++;
    ray[row][col] += nums;
  }


  }

    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
