package Portfolio.Applications.PremiumCalculator.Policy;

import Portfolio.Applications.PremiumCalculator.Enums.PolicyStatus;
import Portfolio.Applications.PremiumCalculator.PolicyObjects.PolicyObject;
import Portfolio.Applications.PremiumCalculator.PolicySubObjects.PolicySubObjects;

public class PolicyCalculator {
    private PolicyObject policyOject = new PolicyObject();
    private PolicySubObjects policySubObjects = new PolicySubObjects();

    private double premiumFire;
    private double premiumWater;

    public void run(double sumFire, double sumWater) {
        calculate(new Policy());

        premiumFire = sumFire * getFireCoefficient(sumFire);
        premiumWater = sumWater * getWaterCoefficient(sumWater);



    }

    private void calculate(Policy policy) {


        policyOject.setObjectName("FLAT");
        policy.setPolicyNumber("LV19-07-100000-1");
        policy.setPolicyStatus(PolicyStatus.APPROVED);

        policySubObjects.setSubObjectName("TV");


    }


    private static double getFireCoefficient(Double sumFire) {
        if (sumFire > 100) {
            return 0.023;
        }
        return 0.013;
    }

    private static double getWaterCoefficient(Double sumInsuredWater) {
        if (sumInsuredWater >= 10) {
            return 0.05;
        }
        return 0.1;
    }

    public double getPremiumFire() {
        return premiumFire;
    }

    public void setPremiumFire(double premiumFire) {
        this.premiumFire = premiumFire;
    }

    public double getPremiumWater() {
        return premiumWater;
    }

    public void setPremiumWater(double premiumWater) {
        this.premiumWater = premiumWater;
    }
}
