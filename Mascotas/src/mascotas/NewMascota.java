package mascotas;

public class NewMascota {

    public static void main(String[] args) {
        Perrito m1 = new Perrito();
        m1.setNombre("Juan");
        m1.setRaza("Colie");
        m1.setPeso(20);
        m1.setPatas(3);
        m1.setLadrido("ladrando");

        System.out.println(m1);

        m1.estaEnojado();

        Gatito m2 = new Gatito();
        m2.setNombre("Murrungo");
        m2.setRaza("Callejero");
        m2.setPeso(7);
        m2.setPatas(5);
        m2.setMaullido("hinchando los huevos.");

        System.out.println(m2);

        m2.estaDurmiendo();
        m2.estaFeliz();

    }





}
