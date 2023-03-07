public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 10;
    }
}

class Test {
    public static void main(String[] args) {
        SBI bank1 = new SBI();
        ICICI bank2 = new ICICI();
        AXIS bank3 = new AXIS();

        System.out.println("SBI Rate of interest: " + bank1.getRateOfInterest());
        System.out.println("ICICI Rate of interest: " + bank2.getRateOfInterest());
        System.out.println("AXIS Rate of interest: " + bank3.getRateOfInterest());
    }
}
