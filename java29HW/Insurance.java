package Syntax.JavaHomeworks.java29HW;

public abstract class Insurance {
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance {
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Here's the quote for your " + carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Insurance for " + carModel + " was canceled\n" +
                "Thank you for being with: " + insuranceName);
    }
}

class Pet extends Insurance {
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("The insurance quote for your " + petType + " has been sent to your email");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Insurance for " + petType + " was canceled\n" +
                "Thank you for being with: " + insuranceName);
    }
}

class Health extends Insurance {
    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Your Health insurance quote has been sent to your email");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health insurance was canceled\n" +
                "Thank you for being with: " + insuranceName);
    }
}
