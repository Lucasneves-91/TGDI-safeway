package br.com.thesafeway.safeway.Modelos;

public class Empresa {

    private String nomeEmpresa;
    private String cnpj;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nomeEmpres='" + nomeEmpresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
