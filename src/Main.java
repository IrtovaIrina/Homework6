public class Main {
    public static void main(String[] args) {
      //задание1
      for ( int i = 1; i < 11;i++)
          System.out.println(i);
      //задание2
      for ( int i = 10; i > 0;i--)
          System.out.println(i);
      //задание3
      for ( int i = 2; i < 18 ; i += 2)
          System.out.println(i);
      //задание4
      for ( int i = - 10; i < 11 ; i ++)
          System.out.println(i);
       //задание5
      for (int i = 1904; i <= 2096; i+=4){
          if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
              System.out.println(i + " год является високосным");
          }
          else{
              continue;
          }
      }
      //задание6
      for ( int i = 7; i < 99 ; i += 7)
            System.out.println(i);
      //задание 8
      int monthlySavings = 29000;
      int savings = 0;
      for (int i = 1;i < 13; i++){
          savings += monthlySavings;
          System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
      }
      //задание9
      savings = monthlySavings;
      System.out.println("Месяц 1 , сумма накоплений равна " + savings + " рублей");
      for (int i = 2;i < 12; i++){
          savings += monthlySavings + monthlySavings * 0.1;
          System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
      }
      //задание10
      for ( int i = 1; i < 11;i++) {
          int f = i * 2;
          System.out.println("2*" + i + "=" + f);
      }
    }
}