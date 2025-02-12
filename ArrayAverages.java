import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int rowAvg = 0;

    for(int row = 0; row < ray.length; row++)
    {
      rowAvg = 0;
      for(int col=0; col<ray[row].length; col++)
      {
        rowAvg += ray[row][col];
      }
      System.out.println("the average of row " + row + " is " + (double)rowAvg / ray.length);
    }
  }

  
// Don't think this is exactly what we were supposed to do, but it works
  public void columnAverages(){
    int colAvg = 0;

    for(int col = 0; col < ray.length; col++)
    {
      colAvg = 0;
      for(int row=0; row<ray.length; row++)
      {
        colAvg += ray[row][col];
      }
      System.out.println("the average of column " + col + " is " + (double)colAvg / ray.length);
    }

  }

  public void arrayAverage(){
    int rayAvg = 0;
    int lazy = 0;
    for(int[] row: ray)
    {
      for(int col: row)
      {
        rayAvg += col;
        lazy++;
      }
    }

    System.out.println("The average of the whole array is " + (double)rayAvg / lazy);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
