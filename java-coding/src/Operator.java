public class Operator {
    public static void main(String[] args) {
      int meal_cost=12,tip_percent=20,tax_percent=8;

      solve(meal_cost,tip_percent,tax_percent);
    }

    static void solve(int meal_cost,int tip_percent,int tax_percent){
       int totalCost = 0;
       double tip,tax;

       tip = meal_cost*tip_percent/100;
       tax=meal_cost*tax_percent/100;

       totalCost =(int)(meal_cost +tip+ tax);

       int result = Math.round(totalCost);

       System.out.println(result);

    }
}

