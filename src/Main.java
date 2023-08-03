
public class Main {
    public static void main(String[] args) {
        //double number_of_months = 120;
        //double counter;
        //double initial_investment = 50000;
        //double each_month = 5000;

        //double stock_price = 35.90;
        //double dividend_yield = 4.09;
        calculator cal1 = new calculator(120, 40000, 2850, 36.68, 4.12);

        System.out.println(cal1.caculating());
        System.out.println(cal1.quarterly_calculating());

        //System.out.println(cal1.not_invested_capital);



    }




}