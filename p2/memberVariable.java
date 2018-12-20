class member{
    String name;
    int age;
    float salary;
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
    }
}
class memberVariable{
    public static void main(String [] args){
        member member1 = new member();
        member1.name = "Nalin Shankar";
        member1.age=23;
        member1.salary=24200f;
        member1.display();
    }
}