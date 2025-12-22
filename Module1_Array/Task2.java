class Student{
    String name;
    int age;
    
    void getName(){
        System.out.println(name);
    }
}

class Main {
    public static void main(String[] args){
        Student a = new Student();
        a.name = "Uday Karthik";
        a.age = 18;
        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
        
    }
}
