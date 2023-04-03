public class Animal {
    private String birthDate;
    private String specie;
    private String name;

    public Animal() {
    }

    public Animal(String birthDate, String specie, String name) {
        this.birthDate = birthDate;
        this.specie = specie;
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
