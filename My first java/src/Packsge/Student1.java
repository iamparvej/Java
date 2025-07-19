package Packsge;
public class Student1 {

    public class Student {
        private String name;
        private int roll;

        public Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        public void display() {
            System.out.println("Name: " + name + ", Roll No: " + roll);
        }
    }

}

