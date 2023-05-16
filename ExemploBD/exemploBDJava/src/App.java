import entily.usuario;
import dao.usuarioDAO;
public class App {
    public static void main(String[] args) throws Exception {

        usuario u = new usuario();
        
        u.setNome("joao");
        u.setLogin("zezin");
        u.setSenha("1234");
        u.setEmail("Rogerio.gt@gmail.com");

        
        new usuarioDAO().cadastrarUsuario(u);
    }
}
