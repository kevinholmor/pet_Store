public class Mascota extends Animal{
    private int idPet;
    private String hairColor;
    private int vaccines;
    private String owner;

    public Mascota(){

    }

    public Mascota(String birthDate, String specie, String name) {
        super(birthDate, specie, name);
    }

    public Mascota(String birthDate, String specie, String name, int idPet, String hairColor, int vaccines, String owner) {
        super(birthDate, specie, name);
        this.idPet = idPet;
        this.hairColor = hairColor;
        this.vaccines = vaccines;
        this.owner = owner;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getVaccines() {
        return vaccines;
    }

    public void setVaccines(int vaccines) {
        this.vaccines = vaccines;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}
