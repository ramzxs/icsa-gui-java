package oop.schoolsystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("SCHOOL SYSTEM");

        // OOPS
        // Object declaration
        Student std;                   // null
        // Construct and initialize
        /*
        std = new Student();           // Constructor => Student@MemoryLocation

        std.id = "2024-0001";          // . = OOP access operator
        std.name = "John";
        */

        std = new Student("2024-0001");
        std.nameFirst = "John";
        std.nameLast = "Wick";
        std.dob = "2000-01-01";
        std.sex = "Male";

        System.out.println("Student ID: " + std.id);
        System.out.println("Student Name: " + std.nameFirst + " " + std.nameLast);

        System.out.println(std.toString());


        Person p = new Person();
        p.nameFirst = "Kath";
        System.out.println(p);
        System.out.println(p.nameFirst);


        Employee e = new Employee();
        e.nameFirst = "Lola";
        System.out.println(e);
        System.out.println(e.nameFirst);
    }
}
