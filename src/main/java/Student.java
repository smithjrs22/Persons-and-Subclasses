//extends keyword for Student inheriting Person

public class Student extends Person{
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study() {
        this.credits++;
    }
    //At creation, a student has 0 study credits. Every time a student studies, the amount of study credits goes up
    public int credits() {
        return credits;
    }
    //overwrite Person toString()
    //super.toString() calls parent class methods in case of inheritance
    //in this case super.toString() calls the Person class (name, address)
    @Override
    public String toString(){
        return "\n " + super.toString() + " \n Study credits " + credits;

    }


}