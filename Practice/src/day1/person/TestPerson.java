package day1.person;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestPerson {

    public static void main(String[] args) {

        ListPersonsExample listPersonsExample= new ListPersonsExample();
        List<Person> li= Arrays.asList(new Person(1,"Nithin"),
                new Person(2,"Nithin"),
                new Person(3,"Atturu"),
                new Person(4,"Venkat"),
                new Person(5,"Nithin"));
        listPersonsExample.setPersonList(li);
//        System.out.println(listPersonsExample.toString());
        System.out.println(listPersonsExample.getPersonList());

        for(int i=0;i<li.size();i++){
            if(li.get(i).getName().equals("Nithin")){
                System.out.println(li.get(i));
                break;
            }
        }

    }
}
