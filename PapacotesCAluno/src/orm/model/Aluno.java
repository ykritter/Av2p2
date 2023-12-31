package orm.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alunos")
public class Aluno {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String email;
	private String Cpf;
	private String dataDeNascimento;
	private String naturalidade;
	private String endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCPF() {
		return Cpf;
	}
	public void setCPF(String cpf) {
		Cpf = cpf;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
    @Override
    public String toString() {
        return "\nId:" + id + ",\nNome:" + nome + ",\nE-mail:" + email + ",\nCpf:" + Cpf +
                ",\nDataDeNascimento:" + dataDeNascimento + ",\nnaturalidade:" + naturalidade + ",\nendereco:" + endereco;
    }
	

}
