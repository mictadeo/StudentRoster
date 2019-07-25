package com.tadeoman.java;

//Michael Tadeo
//Western Governor's University
//Student ID: #000595100

import java.util.ArrayList;

public class Roster {

    static ArrayList<Student> stdRoster = new ArrayList<Student>();

    public static void main(String[] args){

        //Add Student data

        add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
        add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
        add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
        add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
        add("5", "Michael", "Tadeo", "mtadeo@wgu.edu", 34, 82, 83, 84);



        //Remove Student from the list
        System.out.println();
        remove("3");

        //Repeating the removal of Student ID: 3 will indicate that it cannot be found since it was deleted earlier.
        System.out.println();
        remove("3");


        //Print Student list
        System.out.println();
        print_all();

        //Print invalid emails
        System.out.println();
        print_invalid_emails();

        //Print Students average grades
        System.out.println();
        print_average_grade("current_loop_student");





    }


    public static void add(String studentID, String firstname, String lastname, String email, int age, int grade1, int grade2, int grade3){

        int[] grades = {grade1, grade2, grade3};
        Student newStudent = new Student(studentID, firstname, lastname, email, age, grades);
        stdRoster.add(newStudent);

    }

    public static void remove(String StudentID){

        int counter = 0;
        int index = Integer.parseInt(StudentID);
        for(Student i : stdRoster) {
            if (i.getStudentID().equals(StudentID)) {
                stdRoster.remove(index-1);
                counter++;
                break;
            }
        }
        if(counter == 0){
            System.out.println("\t\tStudent ID: " + StudentID + " was not found.");
        } else { }
    }


    public static void print_all(){

        for(int i=0; i < stdRoster.size(); i++){
            stdRoster.get(i).print();
        }
    }

    public static void print_average_grade(String StudentID){

        for (Student i : stdRoster ){
            if (i.getStudentID().equals(StudentID)){
                int average = ((i.getGrades()[0] + i.getGrades()[1] + i.getGrades()[2]) / 3);
                System.out.println("\t\tStudent ID: " + StudentID + "\tAverage Grade: " + average);

            } else if (StudentID.matches("current_loop_student")) {

                for (Student ave : stdRoster ){
                    int average = ((ave.getGrades()[0] + ave.getGrades()[1] + ave.getGrades()[2]) / 3);
                    System.out.println("\t\tStudent ID " + ave.getStudentID() + "\tAverage Grade: " + average);}
                    return;

            }


            }

        }


    public static void print_invalid_emails(){

        for (Student email : stdRoster){

            if (email.getEmail().contains("@") && (email.getEmail().contains(".")) &! (email.getEmail().contains(" "))){

            } else {
                System.out.println("\t\tEmail address: " + email.getEmail() + " is invalid.");
            }

        }
    }



}