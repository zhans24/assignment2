package human;

import Interface.Payable;

public abstract class Person implements Payable, Comparable<Person>{
    private int id;
    private static int lastid;
    private String name;
    private String surname;

    public Person(){
        setName(name);
        setSurname(surname);
        this.id=++lastid;
    }

    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
        this.id=++lastid;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return getId()+"."+name+" "+surname;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getPaymentAmount()==o.getPaymentAmount()) return 0;

        else if (this.getPaymentAmount()<o.getPaymentAmount()) return -1;

        else return 1;
    }
}
