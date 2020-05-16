package Portfolio.Applications.PremiumCalculator.PolicySubObjects;

import Portfolio.Applications.PremiumCalculator.Enums.RiskType;

public class PolicySubObjects {
    public PolicySubObjects() {

    }

    public PolicySubObjects(String subObjectName, double insuredSum, RiskType riskType,
                            double insuredSumWater, double insuredSumFire) {
        this.subObjectName = subObjectName;
        this.insuredSum = insuredSum;
        this.riskType = riskType;
        this.insuredSumFire = insuredSumFire;
        this.insuredSumWater = insuredSumWater;
    }

    private String subObjectName;
    private double insuredSum;
    private RiskType riskType;
    private double insuredSumFire;
    private double insuredSumWater;

    public double getInsuredSumFire() {
        return insuredSumFire;
    }

    public void setInsuredSumFire(double insuredSumFire) {
        this.insuredSumFire = insuredSumFire;
    }

    public double getInsuredSumWater() {
        return insuredSumWater;
    }

    public void setInsuredSumWater(double insuredSumWater) {
        this.insuredSumWater = insuredSumWater;
    }

    public String getSubObjectName() {
        return subObjectName;
    }

    public void setSubObjectName(String subObjectName) {
        this.subObjectName = subObjectName;
    }

    public double getInsuredSum() {
        return insuredSum;
    }

    public void setInsuredSum(double insuredSum) {
        this.insuredSum = insuredSum;
    }

    public RiskType getRiskType() {
        return riskType;
    }

    public void setRiskType(RiskType riskType) {
        this.riskType = riskType;
    }
}
