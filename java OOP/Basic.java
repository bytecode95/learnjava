//objects - it is a real time entity which has state and behaviors. aprt from that unique id- unique id is not for external users. it is for JVM in order to identify an unique object
// class - it is logical entity. which is blueprint or template of an objects 

import java.util.Scanner;
//OOP basic classes and object
public class Basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for(int i=0; i<students.length; i++){
            //object is a instance of a class 
            students[i] = new Student();
            System.out.println("Enter "+(i+1)+" name: ");
            students[i].name = sc.next();
            System.out.println("Enter "+(i+1)+" address: ");
            students[i].address = sc.next();
            System.out.println("Enter "+(i+1)+" age: ");
            students[i].age = sc.nextInt();
            System.out.println("Enter "+(i+1)+" mark: ");
            students[i].mark = sc.nextDouble();

        }
        sc.close();
    }
}


class Student{
    //attributes
    String name;
    String address;
    int age;
    double mark;
}
