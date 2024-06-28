package oop.schoolsystem;

// Inheriting from java.lang.Object

// Modifiers  class Keyword  Class Name  // INHERITANCE
public        class          Student     extends Person {
    // MEMBERS

    // Fields
    String id;

    // Methods

    /*
    modifier returnDataType id() {
    } */

    // Constructor (special method)
    public Student() {
        System.out.println("Creating object now...");
    }


    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String nameFirst) {
        this.id = id;
        this.nameFirst = nameFirst;
    }


    @Override
    public String toString() {
        return "Student # " + this.id;
    }


}
