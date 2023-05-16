package dao;


import java.sql.PreparedStatement;

import conexao.Conexao;
import entily.usuario;

public class usuarioDAO {



    public void cadastrarUsuario(usuario usuario){
        String sql = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1,usuario.getNome());
            ps.setString(2,usuario.getLogin()); // pontos de interrogação da inserção
            ps.setString(3,usuario.getSenha());
            ps.setString(4,usuario.getEmail());
            
            ps.execute();
            ps.close();

        } catch (Exception e) {
          
            e.printStackTrace();

        }
       

        

    }

}