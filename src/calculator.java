public  class calculator {
    double number_of_months;
    double counter;
    double initial_investment;
    double each_month;

    double stock_price;
    double dividend_yield;

    double number_of_stocks;
    double dividened_income;

    double right_before_tax;
    double not_invested_capital;
    int counter_2;
    int counter_3;

    int quarter;

    double quarterly_investment_original;

    double Quarterly_Number_of_months;
    double quarterly_dividened_income;
    double quarterly_dividend_yield;
    double right_before_dividends;

    public calculator (double number_of_months, double initial_investment,
                       double each_month, double stock_price, double dividend_yield){
        this.number_of_months = number_of_months;
        this.initial_investment = initial_investment;
        this.each_month = each_month;
        this.stock_price = stock_price; // Fixed the assignment of stock_price
        this.dividend_yield = dividend_yield;
        this.right_before_tax = right_before_tax;
        this.not_invested_capital = not_invested_capital;
        this.counter_2 = counter_2;
        this.counter_3 = counter_3;
        this.quarterly_investment_original = initial_investment;
        this.Quarterly_Number_of_months = number_of_months;
        this.quarterly_dividened_income = dividened_income;
        this.quarterly_dividend_yield = dividend_yield;
        this.right_before_dividends = right_before_dividends;



    }





    String caculating() {
        dividend_yield = ((dividend_yield / 100.0) * stock_price) / 12.0;
        while (counter < number_of_months) {
            counter++;
            // Store the initial_investment in a separate variable

            initial_investment = (initial_investment + each_month);
            dividened_income = ((initial_investment / stock_price) * dividend_yield);

            initial_investment += dividened_income;
            //right_before_dividends = (initial_investment + each_month)-dividened_income;
            right_before_tax = dividened_income;
            if (counter % 12 == 0) {
                right_before_tax = ((5.75 / 100.0) * right_before_tax); // Calculate the right_before_tax without modifying it
                //System.out.println(right_before_tax + " this is working");
                counter_2 += 1;
                System.out.println("After year "+ counter_2+": "+ "Monthly income is: $" + String.format("%.2f",dividened_income));
                System.out.println( "Total owed taxes after year " + counter_2 + ": $"+ String.format("%.2f",right_before_tax));
                System.out.println("Total Capital including the dividends, pre-taxes: $" + String.format("%.2f",initial_investment));


            }
            System.out.println("Month " + counter + " dividend income: $" + String.format("%.2f",dividened_income));
        }
        System.out.println("_______________________________________________________________________________________________________________________________________________________________");
        System.out.println("All the invested capital without the dividends: $" + String.format("%.2f",right_before_dividends));
        System.out.println("Monthly dividend income: $" + String.format("%.2f",dividened_income));
        //System.out.println( "Total Capital after taxes: $" + (dividened_income - right_before_tax));
        System.out.println( "Total owed taxes $" + String.format("%.2f" ,right_before_tax));
        return ("Total Capital including the dividends, pre-taxes: $" + String.format("%.2f",initial_investment));
    }



    String quarterly_calculating () {
        double quarterlyInvestment_new = quarterly_investment_original;
        quarterly_dividend_yield = ((dividend_yield/100)*stock_price)/4;
        counter = 0;
        while (counter < number_of_months) {

            counter ++;
            // Store the initial_investment in a separate variable
            quarterlyInvestment_new = (quarterlyInvestment_new + each_month);
            quarterly_dividened_income = ((quarterlyInvestment_new / stock_price) * quarterly_dividend_yield);
            quarterlyInvestment_new += quarterly_dividened_income;

            if (counter % 2 ==0) {
                counter_3 += 1;
                System.out.println("After year "+ counter_3+": "+ "Quarterly income is: $" + String.format("%.2f",quarterly_dividened_income));
                System.out.println("After year "+ counter_3+": "+ "Quarterly income tax owed: $" + String.format("%.2f",quarterly_dividened_income * ((5.75/100))));
                System.out.println("_______________________________________________________________________________________________________________________________________________________________");


            }

            //System.out.println("quarterly income from the dividends: $" + String.format("%.2f",quarterly_dividened_income));




        }


        return ("Total capital, including dividends: $" + String.format("%.2f",quarterlyInvestment_new));

    }}