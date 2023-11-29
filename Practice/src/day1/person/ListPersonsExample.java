package day1.person;

import java.util.List;

public class ListPersonsExample {
    private List<Person> personList;


    public ListPersonsExample(List<Person> personList) {
        this.personList = personList;
    }

    public ListPersonsExample() {
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "ListPersonsExample{" +
                "personList=" + personList +
                '}';
    }
}
