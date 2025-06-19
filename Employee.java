public class Employee {
    private String name;
    private int hours;
    
    public Employee(String name, int hours){

        this.name = name;
        this.hours = hours;
    }
    public double calculateSalary(){

        return hours * 20;
    }

    public class Professor{

        private String field;

        public Professor(String field){

            this.field = field;
        }
        public double calculateSalary(){

            return hours * 30;
        }

    }
    public class Staff{
        
        private int role;

        public Staff(int role){

            this.role = role;
        }
    }
}

