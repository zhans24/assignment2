import human.Employee;
import human.Person;
import human.Student;

import java.util.*;

class Main{
    public static void main(String[] args) {
        Person s=new Student("Zhans","Gaziz",2.87);
        Person e=new Employee("Erlan","Kenesbay","Busy",400000);
        Person a=new Student("Nurs","Oryn",2.5);
        List<Person> list=Arrays.asList(s,e,a);
        Collections.sort(list);
        printData(list);
    }

    public static void printData(Iterable<Person> people){
        for(Person person:people){
            System.out.println(person+" earns "+person.getPaymentAmount());;
        }
    }

}