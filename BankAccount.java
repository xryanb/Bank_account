public class BankAccount {
    private double checking;
    private double savings;
    public static int numberOfAccounts=0;
    public static int amountOfMoney=0;

    public BankAccount(){
        this.checking=0;
        this.savings=0;
    }


    public BankAccount(int checkingA, int savingA){
        this.checking=checkingA;
        this.savings=savingA;
        numberOfAccounts++;
    }

    public double getChecking(){
        return checking;
    }

    public void setChecking(double checking){
        this.checking=checking;
    }

    public double getSaving(){
        return savings;
    }

    public void setSaving(double saving){
        this.savings=saving;
    }

    public void depositMoney(double amount, String location){
        if (location == "checking"){
            this.checking += amount;
            amountOfMoney += amount;
        } else if(location == "savings"){
            this.savings += amount;
            amountOfMoney += amount;
        } else{
            System.out.println("Wrong location-you trying to rob us ?!");
        }
    }

    public void withdrawMoney(double amount, String location){
        if(location == "checking"){
            if(this.checking < amount ){
                System.out.println("Insufficient funds! ");
            }else {
                this.checking -= amount;
                amountOfMoney -= amount;
            }
        } else if(location == "savings"){
            if(this.savings < amount){
                System.out.println("Insufficient funds! ");
            } else {
                this.savings -= amount;
                amountOfMoney -= amount;
            }
        } else{
            System.out.println("Wrong location-you trying to rob us ?!");
        }
    }

    public void accountBalance(){
        System.out.println("Your checking accounts balance is : " + this.checking + ",Your savings account balance is: " + this.savings);
    }
}
