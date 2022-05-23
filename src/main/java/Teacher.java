
public class Teacher extends Person{
    int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    //salary did not print out prior to toString()
    @Override
    public String toString() {
        return " \n " + super.toString() + " \n salary " + salary + " euro/month ";
    }
}
