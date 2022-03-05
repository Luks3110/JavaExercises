package com.frnlucas;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 22));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
    }

        private static void queues(){
            Queue<Person> supermarket = new LinkedList<>();
            supermarket.add(new Person("Julia", 21));
            supermarket.add(new Person("Alex", 22));
            supermarket.add(new Person("Jessy", 23));
            supermarket.add(new Person("Paulo", 24));

            for (Person person : supermarket){
                System.out.println(person);
            }
        }
    static record Person(String name, int age){};
}
