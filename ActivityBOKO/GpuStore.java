package ActivityBOKO;

public class GpuStore {
    private int id;
    private String rtx70, rtx80, rtx90;
    private double price1, price2, price3;

    GpuStore (){
        rtx70 = "RTX 3070 SERIES";
        price1 = 25000.00;

        rtx80 = "RTX 3080 SERIES";
        price2 = 30000.00;

        rtx90 = "RTX 3090 SERIES";
        price3 = 45000.00;
    }

    public void setid(int thisid) {
        id = thisid;
    }
    public String getName1() {
        return rtx70;
    }
    public double getPrice1() {
        return price1;
    }

    public String getName2() {
        return rtx80;
    }
    public double getPrice2() {
        return price2;
    }

    public String getName3() {
        return rtx90;
    }
    public double getPrice3() {
        return price3;
    }
    public void checker() {
        if (id == 1) {
            System.out.println("ID: 1");
            System.out.println("NAME: " + getName1());
            System.out.println("PRICE: " + getPrice1());
        }
        else if (id == 2) {
            System.out.println("ID: 2");
            System.out.println("NAME: " + getName2());
            System.out.println("PRICE: " + getPrice3());
        }
        else if (id == 3) {
            System.out.println("ID: 3");
            System.out.println("NAME: " + getName3());
            System.out.println("PRICE: " + getPrice3());
        } 
        else if (id == 4) {
            System.out.println("Good Bye.");
        }
        else {
            System.out.println("Enter Valid ID.\nTry Again.\n");
        }
    }


}
