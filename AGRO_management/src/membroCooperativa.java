public class membroCooperativa {
    private String nome; //name
    private int idade; //age
    private long idMembro; //memberId
}

//constructor
public membroCooperativa(String nome, int idade, int idMembro) {
    this.nome = nome;       
    this.idade = idade; 
    this.idMembro = idMembro;
}

//getters and setters
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade (int idade) {
    this.idade = idade;
}

public long getIdMembro() {
    return idMembro;
}

public void setIdMembro(long idMembro) {
    this.idMembro = idMembro;
}

public String mostrarInformacoes() {
    return "Nome: " + nome + "\nIdade: " + idade + "\nID do membro: " + idMembro;
}

