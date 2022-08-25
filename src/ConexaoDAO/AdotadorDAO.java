package ConexaoDAO;

import DTO.AdotadorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AdotadorDAO {
     Connection conn;
     PreparedStatement pstm;
     
    public void cadastrarAdotante(AdotadorDTO objadotadordto){
        String sql = "insert into adotante {nome_adotante, email_adotante} values {}";
    }
    
}
