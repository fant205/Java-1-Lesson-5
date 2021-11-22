package ru.geekbrains.lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Hatfield James", "Vocal", "Hatfield@mailbox.com", "89997775533", 40000, 55);
        persArray[2] = new Person("Ulrich Lars", "Drums", "Ulrich@mailbox.com", "89998885533", 50000, 50);
        persArray[3] = new Person("Hammett Kirk", "Guitar", "Hammett@mailbox.com", "89997775533", 60000, 25);
        persArray[4] = new Person("Trujillo Robert ", "Bass", "Trujillo@mailbox.com", "89995553311", 70000, 20);

        for (int i = 0; i < persArray.length; i++) {
            Person person = persArray[i];
            if(person.getAge() > 40){
                System.out.println(persArray[i].toString());
            }
        }
    }
}