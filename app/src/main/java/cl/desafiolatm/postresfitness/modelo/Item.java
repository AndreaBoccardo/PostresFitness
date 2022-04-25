package cl.desafiolatm.postresfitness.modelo;

public class Item {

    private int imagen;
    private String mensaje;

    public Item(int imagen, String mensaje) {
        this.imagen = imagen;
        this.mensaje = mensaje;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Item{" +
                "imagen=" + imagen +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
