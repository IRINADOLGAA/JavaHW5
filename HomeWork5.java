package Lesson5.HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan","Engineer","ivivan@test.com","892312312",30000,30);
        persArray[1] = new Person("Petrov Petr","Senior Engineer","petrov@test.com","123312312",50000,45);
        persArray[2] = new Person("Smirnov Aleksandr","Junior Engineer","sidorov@test.com","892312300",15000,23);
        persArray[3] = new Person("Popov Dmitry","Data Engineer","popov@test.com","111112312",50000,38);
        persArray[4] = new Person("Pavlov Sergey","Product Manager","pavlov@test.com","123456789",80000,41);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
        
    }



}
