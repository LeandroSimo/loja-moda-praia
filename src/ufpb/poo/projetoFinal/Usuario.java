package ufpb.poo.projetoFinal;


public class Usuario {
    
    	private String nome;
	private String login;
	private String senha;
        private String cargo;
	
	public Usuario(String nome,String cargo, String login, String senha) {
		this.nome = nome;
                this.cargo = cargo;
		this.login = login;
		this.senha = senha;
	}
        public String getCargo(){
            return this.cargo;
        }
        
        public void setCargo(String cargo){
            this.cargo = cargo;
        }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

    @Override
    public String toString() {
        return "NOME: " + nome + "\n"+"LOGIN: "+ login + "\n" +"CARGO: " + cargo ;
    }
        

}
    

