/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.VeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author João Carser
 */

public class VeiculoDAO {

    Connection c;
    PreparedStatement p;
    
    //SOMENTE FUNÇÃO CADASTRAR VEÍCULO
    public void cadastrarVeiculo(VeiculoDTO veiculoDTO){
        String cadastrar = "INSERT INTO veiculo(idVeiculo, nome, numero, placa, fabricante, anoModelo, qtdPortas, Acessorios) VALUES(?,?,?,?,?,?,?,?)";
        
        c = new ConexaoDAO().conectaBD();
        
        try {
            p = c.prepareStatement(cadastrar);
            
            p.setInt(1, veiculoDTO.getIdVeiculo());
            p.setString(2, veiculoDTO.getNome());
            p.setInt(3, veiculoDTO.getNumero());
            p.setInt(4, veiculoDTO.getPlaca());
            p.setString(5, veiculoDTO.getFabricante());
            p.setDate(6, veiculoDTO.getAnoModelo());
            p.setInt(7, veiculoDTO.getQtdPortas());
            p.setString(8, veiculoDTO.getAcessorios());
            

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO Cadastrar" + erro);
        }
        
        
    }
    
    

    
}
