package oop.schoolsystem;

// Modifiers  class Keyword  Class Name
public        class          Student     {
    // MEMBERS

    // Fields
    String id;
    String name;

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

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
