import human.*;

import java.util.*;

class Main{
    public static void main(String[] args) {
        Person s=new Student("Zhans","Gaziz",2.87);
        Person e=new Employee("Erlan","Kenesbay","Director",400000);
        Person a=new Student("Nurs","Oryn",2.5);

        Student b=new Student();
        Employee c=new Employee();

        b.setName("Almas");b.setSurname("Zhas");b.setGpa(2.90);
        c.setName("Kamal");c.setSurname("Baba");c.setSalary(600000);

        List<Person> list=Arrays.asList(s,e,a,b,c);
        Collections.sort(list);
        printData(list);

    }

    public static void printData(Iterable<Person> people){
        for(Person person:people){
            System.out.println(person+" earns "+person.getPaymentAmount());;
        }
    }

}