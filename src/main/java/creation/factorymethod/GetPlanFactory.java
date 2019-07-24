package creation.factorymethod;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by pht on 23/07/2019.
 */
public class GetPlanFactory {

    private static final String DOMESTIC_PLAN = "A";
    private static final String COMMERCIAL_PLAN = "B";
    private static final String INSTITUTIONAL_PLAN = "C";

    public Plan getPlan(String planType) {
        if (StringUtils.isNotEmpty(planType)) {

            if(!DOMESTIC_PLAN.equals(planType) && !COMMERCIAL_PLAN.equals(planType) && !INSTITUTIONAL_PLAN.equals(planType)) {
                return null;
            }

            if(DOMESTIC_PLAN.equals(planType)) {
                return new DomesticPan();
            } else if (COMMERCIAL_PLAN.equals(planType)) {
                return new CommercialPlan();
            } else {
                return new InstitutionalPlan();
            }
        }
        return null;
    }
}
