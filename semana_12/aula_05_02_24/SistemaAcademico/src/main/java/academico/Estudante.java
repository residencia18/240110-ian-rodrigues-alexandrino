package academico;

public class Estudante {

    private int Id;
    private String Nome;
    private String Email;
    private String Matricula;

    public Estudante(){

    }

    public Estudante(int Id, String Nome, String Email, String Matricula){

        this.Id = Id;
        this.Nome = Nome;
        this.Email = Email;
        this.Matricula = Matricula;

    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMatricula() {
        return Matricula;
    }


}