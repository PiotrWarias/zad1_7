import java.util.Scanner;
class Main {
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String choinka = "*";
    int x = scan.nextInt();
    
    for(int i=0;i<x;i++)
      {
        for(int j=0;j<x*2;j++)
          {
            if(j<(x-i) || j>(x+i))
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(choinka);
            }
          }
        System.out.println("");
      }
  }
}