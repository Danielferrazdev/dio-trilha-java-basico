package main.java.Set.OperacoesBasicas;

public class Palavra {
    // atributo
    private String palavra;

    // construtor
    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    // get
    public String getPalavra() {
        return palavra;
    }

    // regras pra usar o Set
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Palavra other = (Palavra) obj;
        if (palavra == null) {
            if (other.palavra != null)
                return false;
        } else if (!palavra.equals(other.palavra))
            return false;
        return true;
    }

    // toString
    @Override
    public String toString() {
        return "Palavra [palavra=" + palavra + "]";
    }

}
