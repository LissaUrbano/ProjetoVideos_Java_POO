public class Gafanhoto extends Pessoa {

    // atributos
    private String login;
    private int totalAssitido;

    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);//construtor classe mae
        this.login = login;
        this.totalAssitido = 0;
    }
    
    //getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssitidp() {
        return totalAssitido;
    }

    public void setTotalAssitidp(int totalAssitidp) {
        this.totalAssitido = totalAssitidp;
    }

    @Override
    public String toString() {
        return "Gafanhoto" + super.toString() + "\n[login = " + login + ", totalAssitido = " + totalAssitido + "]";
    }
}
