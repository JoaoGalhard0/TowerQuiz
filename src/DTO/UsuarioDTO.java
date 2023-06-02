
package DTO;


public class UsuarioDTO {
    
    private int idUsuario;
    public String nome_usuario, RA, email, Username, senha_usuario;

  
    public int getIdUsuario() {
        return idUsuario;
    }

 
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }


    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }


    public String getEmail() {
        return email;
    }

  
    public void setEmail(String email) {
        this.email = email;
    } 
        
    public String getSenha_usuario() {
        return senha_usuario;
    }


    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

   
    public String getUsername() {
        return Username;
    }

    
    public void setUsername(String Username) {
        this.Username = Username;
    }
}
