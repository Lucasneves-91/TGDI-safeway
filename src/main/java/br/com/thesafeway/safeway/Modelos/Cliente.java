package br.com.thesafeway.safeway.Modelos;

public class Cliente {
    private String nomeCliente;
    private String cpf;
    private String telefone;
    private String email;


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                '}';
    }
}
