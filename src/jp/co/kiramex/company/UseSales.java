package jp.co.kiramex.company;

import jp.co.kiramex.company.entity.Sales;

public class UseSales {

    public static void main(String[] args) {
            Sales sales = new Sales(10, "南野", 200);

            sales.setAppointment("ほげほげ商事株式会社");

            sales.introduce();

            sales.greeting();

            sales.report();

            sales.showVitality();

    }

}
