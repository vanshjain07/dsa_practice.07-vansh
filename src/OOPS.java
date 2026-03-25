public class OOPS {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "Red";
        p.Tip=5;
        System.out.println(p.color+" "+p.Tip);
        p.setColor("Green");
        p.setTip(11);
        System.out.println(p.color+" "+p.Tip);

        BankAccount myAcc = new BankAccount();
        myAcc.userName="vansh07";
        myAcc.setPwd("Vansh@2026");


    }
}

class Pen{
    String color;
    int Tip;

    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int tipThickness){
        Tip = tipThickness;
    }
}

class Student{
    String name;
    int age;
    float perc;

    void calcPercentage(int phy, int m, int c){
        perc = ((phy+m+c)/3)*100;
    }
}

class BankAccount{
    public String userName;
    private String passWord;
    public void setPwd(String pwd){
        passWord = pwd;
    }
}
