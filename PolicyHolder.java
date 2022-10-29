
import java.util.*;


public class
PolicyHolder {
    private String holdFirst;
    private String holdLast;
    private int holdAge;
    private String smokerStatus;
    private double height;
    private double weight;

    PolicyHolder(){
        /*policyNum = 00000;
        provName = "provider";*/
        holdFirst = "peter";
        holdLast = "parker";
        holdAge = 18;
        smokerStatus = "non-smoker";
        height = 72;
        weight = 165;
    }

    PolicyHolder(String holderFirst, String holderLast, int age, String smokerStatus, double height, double weight) {
        this.holdFirst = holderFirst;
        this.holdLast = holderLast;
        this.holdAge = age;
        this.smokerStatus = smokerStatus;
        this.height = height;
        this.weight = weight;

    }
    /*
     * @return policyNum returns instance policy number
     */
    /*public int getPolicyNumber(){
        return policyNum;
    }

    *//*
     * @return provName returns instance provider name
     *//*
    public String getProviderName(){
        return provName;
    }*/

    /*
     * @return holdFirst returns first name of policy holder
     */
    public String getHolderFirst(){
        return holdFirst;
    }

    /*
     * @return holdLast returns last name of policy holder for getter
     *
     */
    public String getHolderLast(){
        return holdLast;
    }

    /*
     * @return holdAge returns age of policy holder for getter
     *
     */
    public int getHolderAge(){
        return holdAge;
    }

    /*
     * @return smokerStatus returns smoker status of policy holder for getter
     */
    public String getSmokerStatus(){
        return smokerStatus;
    }

    /*
     * @return height returns height of policy holder for getter
     */
    public double getHeight(){
        return height;
    }
    /*
     * @return weight returns weight of policy holder for getter
     */
    public double getWeight(){
        return weight;
    }

    public void setHolderFirst(String newHoldFirst){
        this.holdFirst = newHoldFirst;
    }

    public void setHolderLast(String newHoldLast){
        this.holdLast = newHoldLast;
    }

    public void setHolderAge(int newHoldAge){
        this.holdAge = newHoldAge;
    }

    public void setSmokerStatus(String newSmokerStatus){
        this.smokerStatus = newSmokerStatus;
    }

    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    /*
     * @return bmi returns bmi as calculated from height and weight of policy holder
     */
    public double calculateBMI(){

        return (weight * 703) / (height * height);
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "holdFirst = '" + holdFirst + '\'' +
                ", holdLast = '" + holdLast + '\'' +
                ", holdAge = " + holdAge +
                ", smokerStatus = '" + smokerStatus + '\'' +
                ", height = " + height +
                ", weight = " + weight +
                ", bmi = " + calculateBMI() +
                '}';
    }
}
