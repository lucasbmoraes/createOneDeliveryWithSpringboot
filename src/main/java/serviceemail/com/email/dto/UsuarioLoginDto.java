package serviceemail.com.email.dto;

public class UsuarioLoginDto {

    private String login;
    private String senha;

    public UsuarioLoginDto(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public UsuarioLoginDto() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
