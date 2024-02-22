public class Agricultor {
    private String nome;
    private int idade;
    private long idAgricultor;    
}

public Agricultor(String nome, int idade, long idAgricultor) {
    this.nome = nome;
    this.idade = idade;
    this.idAgricultor = idAgricultor;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public long getIdAgricultor() {
    return idAgricultor;
}

public void setIdAgricultor(long idAgricultor) {
    this.idAgricultor = idAgricultor;
}

public String mostrarInformacoes() {
    return "Nome: " + nome + "\nIdade: " + idade + "\nID do agricultor: " + idAgricultor;
}