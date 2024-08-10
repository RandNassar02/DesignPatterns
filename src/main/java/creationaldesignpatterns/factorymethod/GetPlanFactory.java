package creationaldesignpatterns.factorymethod;

public class GetPlanFactory {
    //use getPlan method to get object of type Plan

    public Plan getPlan(String planType) {

        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }

        if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }

        if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
