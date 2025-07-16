/*
1.Constructors are similar to methods,, but they are used to initialize an object.
2.Constructors do not have any return type(not even void).
3.Every time we create an object by using the new() keyword, a constructor is called.*/

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 786;
        name = "Parvej Ansari";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {

        MyMainEmployee Parvej = new MyMainEmployee();

        System.out.println(Parvej.getId());
        System.out.println(Parvej.getName());
    }
}
