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
        std.name = "John";
        
        System.out.println("Student ID: " + std.id);
        System.out.println("Student Name: " + std.name);        
    }
}
