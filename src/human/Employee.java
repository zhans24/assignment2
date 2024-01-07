package human;

import Interface.Payable;

public class Employee extends Person implements Payable {
    private String position;
    private double salary;
    public Employee(){
        super();
        setPosition(position);
        setSalary(salary);
    }

    public Employee(String name,String surname,String position,double salary){
        super(name, surname);
        this.position=position;
        this.salary=salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getPosition() {
        return position+":";
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
