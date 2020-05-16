package Portfolio.Applications.PremiumCalculator.Policy;

import Portfolio.Applications.PremiumCalculator.Enums.PolicyStatus;
import Portfolio.Applications.PremiumCalculator.PolicyObjects.PolicyOject;

import java.util.List;

public class Policy {

    Policy() {

    }

    public Policy(String policyNumber, PolicyStatus policyStatus, List<PolicyOject> policyOjects, Double premium) {
        this.policyNumber = policyNumber;
        this.policyStatus = policyStatus;
        this.policyObjects = policyOjects;
        this.premium = premium;

    }

    private String policyNumber;
    private PolicyStatus policyStatus;
    private List policyObjects;
    private double premium;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    public List getPolicyObjects() {
        return policyObjects;
    }

    public void setPolicyObjects(List policyObjects) {
        this.policyObjects = policyObjects;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }
}

