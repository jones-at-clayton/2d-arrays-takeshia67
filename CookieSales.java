public class TwoDArrayExerise{
  public static void main(String[] args){
   double cookieSales ={{4559.49, 8860.30, 2291.90, 8550.84},
                        {7946.93, 9703.66, 9924.06, 531.69},
                        {5027.48, 8050.74, 3715.77, 9573.72},
                        {866.44, 2310.67, 2749.98, 3747.57},
                        {5133.77, 1812.53, 2690.81, 399.51}};

      System.out.println(cookieSales);
      // print the values in the array using nested for loops 
      for(int row = 0; row < 5; row++){
        for(int col = 0; col < 4; col++){
          Sytem.out.println(cookieSales[row][col]);
        }
     } 
      
      // print the values in the array using nested for loops 
      for(int row = 0; row < 5; row++){
         for(int col = 0; col < 4; col++){
            System.out.print(doublecookieSales [row][col] + ", ");
            
         }
         System.out.println(cookieSales);
       }
     
