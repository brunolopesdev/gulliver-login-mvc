
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario", "senha123");
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(usuario, loginView);

        loginController.realizarLogin();
        loginView.fechar();
    }
}