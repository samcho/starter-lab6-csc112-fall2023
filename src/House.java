// Author: Samuel S. Cho
// Created: Sept. 2023
// Permission to distribute, copy, and use *without* modification
// or *with* modifications if updates documented. No warranty given or implied.
// Update Author:
// Update Date:
// Update Description:
public class House {
    Stack<Student> studentList;
    int houseIndex;

    // default constructor
    public House() {
        studentList = new Stack<Student>();
        houseIndex = -1;
    }

    // overloaded constructor
    public House(int h) {
        studentList = new Stack<Student>();
        houseIndex = h;
    }

    // converts the integer value of a house into an alphanumeric string name
    public String getHouseName(int h) {
        String Name;
        switch(h) {
            case 1:
                Name = "Gryffindor";
                break;
            case 2:
                Name = "Hufflepuff";
                break;
            case 3:
                Name = "Ravenclaw";
                break;
            case 4:
                Name = "Slytherin";
                break;
            case 0:
                Name = "Muggles";
                break;
            default:
                Name = "";
                break;
        }
        return Name;
    }

    // checks if the student list is empty
    public Boolean isEmpty() {
        return studentList.isEmpty();
    }

    // add student to house
    public void addStudent(String name, int h) {
        Student wiz = new Student(name, h);
        studentList.push(wiz);
    }

    // remove a single student from house and returns it
    public Student removeStudent() {
        Student last = studentList.pop();
        studentList.pop();
        return last;
    }
    // retrieve the number of students in the house
    public int getSize() {
        return studentList.size();
    }

    // Print House
    public void printHouse() {
        // FINISH ME
     }

    // Empty House
    public void emptyHouse() {
        // FINISH ME
    }
}
