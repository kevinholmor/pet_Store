public class petstoreApp {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("12/01/23", "Gato", "Michi" );
        Dueño dueño1 = new Dueño("11/04/98", "Human", "Luis");

        mascota1.setIdPet(102);
        mascota1.setHairColor("rojo");
        mascota1.setVaccines(2);
        dueño1.setLastName("Martinez");
        dueño1.setPhoneNumber(7334161);
        dueño1.setName("luis");

        System.out.println("La mascota de " + dueño1.getName() + " de nombre " + mascota1.getName() + " con id " + mascota1.getIdPet() + " se le colocaron " + mascota1.getVaccines() + " vacunas ");

    }
}
