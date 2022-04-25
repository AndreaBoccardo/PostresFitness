package cl.desafiolatm.postresfitness.modelo;

import java.util.List;

public class Postre {

private List<Item> postre;

    public Postre(List<Item> postre) {
        this.postre = postre;
    }

    public List<Item> getPostre() {
        return postre;
    }

    public void setPostre(List<Item> postre) {
        this.postre = postre;
    }

    @Override
    public String toString() {
        return "Postre{" +
                "postre=" + postre +
                '}';
    }
}
