class Main {
  public static void main(String[] args) 
  {
    int Wysokosc = 4;
    int Powtorz = 3;
    for(int l = 0; l < Powtorz; l++)
      {
for(int i = 1; i <= Wysokosc; i++)
      {
        for(int j = 0; j < Wysokosc - i; j++)
          {
        System.out.print(" ");
          }
        for(int k = 0; k < i; k++)
          {
        System.out.print("*");
          }
        System.out.println("");
      }
    }  
  }
}