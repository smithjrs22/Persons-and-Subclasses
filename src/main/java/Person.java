public class Person {
    //attributes
    private String name;
    private String address;
    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }


    //to String helps print out the actual name and address rather than just the space in memory
    public String toString() {
        return this.name + this.address;
    }

}
