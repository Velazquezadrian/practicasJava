package mascotas;

public abstract class AnimalitoA {

    private String nombre;
    private String raza;
    private int peso;
    private int patas;

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getPeso() {
        return peso;
    }

    public int getPatas() {
        return patas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void tieneHambre(){
        System.out.println("Tu mascsota esta hambrienta");
    }
}
