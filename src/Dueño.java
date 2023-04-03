public class Dueño extends Animal {
    private String name;
    private String lastName;
    private double phoneNumber;

    public Dueño (){

    }

    public Dueño(String birthDate, String specie, String name) {
        super(birthDate, specie, name);
    }

    public Dueño(String birthDate, String specie, String name, String lastName, double phoneNumber) {
        super(birthDate, specie, name);
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
