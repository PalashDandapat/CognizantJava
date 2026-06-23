import java.util.*;
class Employee{
    private int employeeId,salary;
    private String name,position;
    public Employee(int employeeId,String name, String position,int salary){
        this.employeeId=employeeId;
        this.salary=employeeId;
        this.name=name;
        this.position=position;
    }
    public String toString(){
        return this.employeeId+"\t"+this.name+"\t"+this.position+"\t"+this.salary;

    }
    public int getId(){
        return this.employeeId;
    }
    public String getName(){
        return this.name;
    }

}
class EmployeeManagementSystem{
    static ArrayList<Employee> employeeList;
    static void traverse(){
        for(Employee emp1:employeeList){
            System.out.println(emp1);
        }
    }
    static void search(int n){
        int id=n;
        for(Employee emp1:employeeList){
            if(emp1.getId()==id){
                System.out.println("FOUND: "+emp1);
                return;
            }

        }
        System.out.println("Not Found: "+ n);

    }
    static void search(String n){
        String name=n;
        
        
        for(Employee emp1:employeeList){
            if(emp1.getName()==name){
                System.out.println("FOUND: "+emp1);
                return;
            }
        }
        System.out.println("Not Found: "+name);
    }
    static void add(int employeeId,String name, String position,int salary){
        Employee emp=new Employee(employeeId,name,position,salary);
        employeeList.add(emp);
        if(employeeList.get(employeeList.size()-1).getId()==employeeId){
            System.out.println("ADDED SUCCESS");
        }else{
            System.out.println("COULDN'T ADD");
        }
    }
    static void delete(int employeeId,String name){
        
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==employeeId && employeeList.get(i).getName().equalsIgnoreCase(name)){
                employeeList.remove(i);
                System.out.println("Removed Success ");
            }
        }
    }
    public static void main(String args[]){
        employeeList=new ArrayList<>();

        //adding few
        add(101,"Rohan","SDE1",53000);
        add(102,"Sohan","ASM",43000);
        add(103,"Roman","SDE3",93000);
        add(104,"Neha","SDE2",68000);
        add(105,"Sajal","HR",65000);

        //
        traverse();
        //search
        search("Rahul");
        search(102);
        traverse();
        //delete
        delete(104,"Neha");
        traverse();
    }

    
}