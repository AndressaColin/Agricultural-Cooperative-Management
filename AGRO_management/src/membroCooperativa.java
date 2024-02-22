public class MembroCooperativa {
    private String nome; //name
    private int idade; //age
    private long idMembro; //memberId

    // Constructor
    public MembroCooperativa(String nome, int idade, long idMembro) {
        this.nome = nome;
        this.idade = idade;
        this.idMembro = idMembro;
    }

    // Getters and Setters
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

    public long getIdMembro() {
        return idMembro;
    }

    public void setIdMembro(long idMembro) {
        this.idMembro = idMembro;
    }

    // Método para mostrar informações do membro
    public String mostrarInformacoes() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nID do membro: " + idMembro;
    }
}
