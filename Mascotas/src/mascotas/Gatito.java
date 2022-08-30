package mascotas;

public class Gatito extends AnimalitoA implements IGatito{
    private String maullido;

    public Gatito(){
        super();
    }

    public String getMaullido(){
        return this.maullido;
    }

    public String setMaullido(String objeto){
        this.maullido = objeto;
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
    public void estaDurmiendo() {
        System.out.println("Le ronca el culo");
    }

    @Override
    public String toString() {
        return "El gatito " +
                "ahora esta maullando " + maullido + '\n' +
                "Su nombre es " + getNombre() +
                " es de la raza " + getRaza() +
                " pesa " + getPeso() + "kg" +
                " y tiene " + getPatas() + " patas."
                ;
    }
}
