/**
Create a Policy class that will model an insurance policy for one person.  

Use the following guidelines to create the Policy class:

An insurance policy has the following attributes:
Policy Number
Provider Name
Policyholder’s First Name
Policyholder’s Last Name
Policyholder’s Age
Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
Policyholder’s Height (in inches)
Policyholder’s Weight (in pounds)
Include a no-arg constructor (set default values for all fields).
Include a constructor that accepts arguments (it must accept all necessary arguments to fully initialize the Policy object).
Include appropriate setters and getters (i.e., mutator and accessor methods) for each field.
Include a method that calculates and returns the BMI of the policyholder.*
BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 ).
Include a method that calculates and returns the price of the insurance policy*
The Insurance Policy has a base fee of $600
If the Policyholder is over 50 years old, there is an additional fee of $75
If the Policyholder is a smoker, there is an additional fee of $100
If the Policyholder has a BMI of over 35, there is an additional fee calculated as follows:
Additional Fee = ( BMI – 35 ) * 20
*/


public class Policy {

    private int policyNum;
    private String provName;



    private PolicyHolder pHolder;



    private Policy(){
        policyNum = 00000;
        provName = "provider";
        pHolder = new PolicyHolder();
    }



    /*
     * Constructor with arguments for building policy holder
     *  
     * @param policyNumber provided policy number for individual
     * @param providerName Name of insurance provider for individual
     * @param holderFirst First name of individual policy holder
     * @param holderLast Last name of individual policy holder
     * @param age Policy holder current age
     * @param smokerStatus Whether or not the policy holder is a smoker (yes/no)
     * @param height Listed height for policy holder
     * @param weight Listed weight for policy holder
     * 
     */

    public PolicyHolder getpHolder() {
        return pHolder;
    }

    public void setpHolder(PolicyHolder pHolder) {
        this.pHolder = pHolder;
    }

    Policy(int policyNumber, String providerName) {
        this.policyNum = policyNumber;
        this.provName = providerName;
    }
    /*
     * @return policyNum returns instance policy number 
     */
    public int getPolicyNumber(){
        return policyNum;
    }
    
    /*
     * @return provName returns instance provider name
     */
    public String getProviderName(){
        return provName;
    }



    public void setPolicyNumber(int newPolicyNum){
        this.policyNum = newPolicyNum;
    }
    
    public void setProviderName(String newProvName){
        this.provName = newProvName;
    }



    @Override
    public String toString() {
        return "Policy{" +
                "policyNum = " + policyNum +
                ", provName = '" + provName + '\'' + pHolder.toString() +
                '}';
    }

    /*
     * @return policyPrice returns the calculated price of the policy based on input 
     */
    public double policyPrice(){
        double policyPrice = 600;
        
        if (pHolder.getHolderAge() > 50){
            policyPrice += 75;

        }
        if (pHolder.getSmokerStatus() == "smoker"){
            policyPrice += 100;
        }
        if (pHolder.calculateBMI() > 35){
            policyPrice += ((pHolder.calculateBMI() - 35) * 20);
        }

        return policyPrice;
    }


}