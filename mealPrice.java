// pseudo code for mealPrice.java

// • Step 1 - Calculate Tip: tip = tipRate * listedMealPrice;
// • Step 2 - Calculate Tax: tax = taxRate * listedMealPrice;
// Step 3 - Calculate Result: result = tip + tax +
// listedMealPrice;
// • Step 4 - Output Result: System.out.println(result);

public class Main {

  public static void calculateTotalMealPrice(double listedMealPrice,
      double tipRate,
      double taxRate) {
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    System.out.println("Your total meal price is " + result);
  }

  public static void main(String[] args) {

  }

}