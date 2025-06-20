public class Worker {
    private String name;
    private double hourlyRate;

    public String getName(){
        return name;
    }
public class Payroll {
    public Payroll(){

    }
    public void processPayments(Worker worker){

        System.out.println("Payment processed for worker " + worker.getName());
    }

    }
}
