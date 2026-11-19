package cat.iesesteveterradas.model;

public class Faccio {
    private int id;
    private String nom;
    private String resum;

    public Faccio() {}

    public Faccio(int id, String nom, String resum) {
        this.id = id;
        this.nom = nom;
        this.resum = resum;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getResum() { return resum; }
    public void setResum(String resum) { this.resum = resum; }

    @Override
    public String toString() {
        return String.format("[%d] %s: %s", id, nom, resum);
    }
}
