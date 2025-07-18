package Abstract;

abstract  class arithmetic_operation {
    abstract void  printInfo();
    
    
}

//class add
class add extends arithmetic_operation{
    void printInfo()
    {
        int a = 5;
        int b = 10;
        System.out.println(a+b);
    }
}
//class sub
class sub extends arithmetic_operation{
    void printInfo (){
        int c = 4;
        int d = 5;
        System.out.println(c-d);

    }
}
//drive class
class abstraction{
    public static void main(String[] args) {
        arithmetic_operation n = new add();
        n.printInfo();
        arithmetic_operation y = new sub();
        y.printInfo();
    }
}