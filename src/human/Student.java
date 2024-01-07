package human;

import Interface.Payable;

public class Student extends Person implements Payable {
    private double gpa;

    public Student(){
        super();
        setGpa(gpa);
    }

    public Student(String name,String surname,double gpa){
        super(name,surname);
        this.gpa=gpa;

    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (getGpa()>2.67) return 36660;
        else return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
