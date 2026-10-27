// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class Contato {
    private String email;
    private String telefone;

    //Sobrecarga
    public Contato() {
        this.email = "";
        this.telefone = "";
    }

    //Sobrecarga
    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}