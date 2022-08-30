package mascotas;

public class Perrito extends AnimalitoA implements IPerrito{

    private String ladrido;

    public Perrito(){
        super();
    }

    public String getLadrido(){
        return this.ladrido;
    }

    public String setLadrido(String objeto){
        this.ladrido = objeto;
        return objeto;
    }

    public void estaFeliz(){
        System.out.println("Esta feliz");
    }


    @Override
    public void tieneHambre() {
        System.out.println("Tu mascsota esta hambrienta");
        }
    @Override
    public void estaEnojado() {
            System.out.println("Se enojo fuerte\n");
        }

    @Override
    public String toString() {
        return "Perrito{" +
                "ladrido= " + ladrido + '\'' +
                "nombre= " + getNombre() +
                "raza= " + getRaza() +
                "peso= " + getPeso() +
                "patas= " + getPatas() +
                '}';
    }
}
