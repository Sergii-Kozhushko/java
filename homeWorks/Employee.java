/*
   Programmed by Sergii Kozhushko 2022
   Date of creation: 25-Nov-2022 
*/

package gjava;
/*
Programmed by Sergii Kozhushko
*/

public class Employee {
    public final String COMPANYNAME = "NYCE Hotel";
    private int id;
    static int counter;
    public String FName;
    public String LName;
    private String role;
    private int salary;
    private int age;


    static {
        counter = 1005;
    }

    Employee(String fname, String lname, String role, int salary, int age){
        this.role = role;
        this.salary = salary;
        this.age = age;
        this.FName = fname;
        this.LName = lname;
        this.id = counter++;
    }
    Employee(){
        this.role = "Unknown";
        this.LName = "Unknown";
        this.salary = 0;
        this.id = counter++;
    }

    int getAge(){
        return age;
    }

    public String toString(){
        return "Employee(id:"+this.id+", "+this.FName+" "+this.LName+", "+this.role+", $"+this.salary+", "+this.age+" years)";
    }
    public static void main(String[] args) {
        Employee em1 = new Employee("Ivan","Ivanov","Boss",1000, 42);
        Employee em2 = new Employee("Petr","Petrov","Manager",500, 28);
        Employee em3 = new Employee("Maria", "Vasileva","Secretar",300, 22);
        System.out.println(em3.toString());
        //Employee em2 = new Employee();
    }
}


