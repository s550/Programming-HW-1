public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(){
        name = "(not set)";
        idNumber = 0;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String n, int idNum){
        if (n == null){
            name = "(not set)";
        }
        else{
            name = n;
        }
        idNumber = idNum;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String n, int idNum, String dep, String pos){
        if (n == null){
            name = "(not set)";
        }
        else if(dep == null){
            department = "(not set)";
        }
        else if(pos == null){
            position = "(not set)";
        }
        else{
            name = n;
            idNumber = idNum;
            department = dep;
            position = pos;
        }

    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public String getPosition(){
        return position;
    }

    public int getIdNumber(){
        return idNumber;
    }
}
