public class TwoDArrayExercise{
  public static void main(String[] args){
   double [][] cookieSales = {{4559.49, 8860.30, 2291.90, 8550.84},
                              {7946.93, 9703.66, 9924.06, 531.69},
                              {5027.48, 8050.74, 3715.77, 9573.72},
                              {866.44, 2310.67, 2749.98, 3747.57},
                              {5133.77, 1812.53, 2690.81, 399.51}};

      // print the values in the array using nested for loops
      for(int row = 0; row < cookieSales.length; row++){
        for(int col = 0; col < cookieSales[0].length; col++){
          System.out.print(cookieSales[row][col] + " ");
        }
        System.out.println();
      }
      System.out.println();

      double totalSales = 0;
      for(int row = 0; row < cookieSales.length; row++){
        for(int col = 0; col < cookieSales[0].length; col++){
            totalSales += cookieSales[row][col];
        }
      }
      System.out.printf("Total sales for 2021: $%, .2f%n",totalSales);
      System.out.println();

      for(int col = 0; col < cookieSales[0].length; col++){
        double cookieTotal = 0;
        for(int row = 0; row < cookieSales.length; row++){
            cookieTotal += cookieSales[row][col];
        }
        System.out.printf("Total sales for cookie #%d: $%, .2f%n", (col+1), cookieTotal);
      }

    }
}
