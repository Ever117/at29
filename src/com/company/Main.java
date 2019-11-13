package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("John", 30);
        //person.name = "John";
        System.out.println(person.name);
        System.out.println(person.age);

        person.woAmI();

        person.getAge();

        Person person1 = person.getPerson();
        System.out.println(person1 .name);


       /* int i=0;
        while (i <10) {
            i++;

                    if (i%2 == 0)
                    {
                        System.out.println(i);

                    }

*/
            System.out.println(person1 .name);


        }


    }


}
