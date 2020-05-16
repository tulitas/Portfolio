package Portfolio.Applications.PremiumCalculator.PolicyObjects;

import Portfolio.Applications.PremiumCalculator.PolicySubObjects.PolicySubObjects;

import java.util.List;

public class PolicyObject {
    private String objectName;
    private List<PolicySubObjects> policySubObjects;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public List<PolicySubObjects> getPolicySubObjects() {
        return policySubObjects;
    }

    public void setPolicySubObjects(List<PolicySubObjects> policySubObjects) {
        this.policySubObjects = policySubObjects;
    }
}
