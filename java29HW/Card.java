package Syntax.JavaHomeworks.java29HW;

public abstract class Card {
    String creditCardType;
    public Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }
    abstract void getBankName();
    abstract void getStatement();
    void getCardType(){
        System.out.println("Card type: "+creditCardType);
    }
    void info(){
        getBankName();
        getStatement();
        getCardType();
    }
}
class Chase extends Card{
    public Chase(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void getBankName() {
        System.out.println("Bank name is: Chase");
    }

    @Override
    void getStatement() {
        System.out.println("Your Chase Bank statements were sent to your email");
    }
}
class WellsFargo extends Card{
    public WellsFargo(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void getBankName() {
        System.out.println("Bank name is: Wells Fargo");
    }

    @Override
    void getStatement() {
        System.out.println("Your Wells Fargo statements were sent to your email");
    }
}
class TDBank extends Card{
    public TDBank(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void getBankName() {
        System.out.println("Bank name is: TD Bank");
    }

    @Override
    void getStatement() {
        System.out.println("Your TD Bank statements were sent to your email");
    }
}