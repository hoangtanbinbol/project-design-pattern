package creation.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pht on 24/07/2019.
 */
public class main {

    public static void main(String[] args) throws IOException {

        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill generated: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String planType = bufferedReader.readLine();

        System.out.println("Enter the number of units for bill be calculated: ");
        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = getPlanFactory.getPlan(planType);

        System.out.print("Bill amount for " + planType + " of " + units + " units is: ");
        plan.getRate();
        plan.calculateBil(units);

    }
}
