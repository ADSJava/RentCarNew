/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClienteDTO;
import DTO.VeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author João Carser
 */
public class VeiculoDAO {

    Connection c;
    PreparedStatement p;
    ResultSet rs;
    ArrayList<VeiculoDTO> lista = new ArrayList<>();

    //SOMENTE FUNÇÃO CADASTRAR VEÍCULO
    public void cadastrarVeiculo(VeiculoDTO obj) {
        String cadastrar = "INSERT INTO veiculo (nome,numero,placa,fabricante,anoModelo,qntPortas,acessorios) VALUES(?,?,?,?,?,?,?)";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(cadastrar);

            p.setString(1, obj.getNome());
            p.setInt(2, obj.getNumero());
            p.setString(3, obj.getPlaca());
            p.setString(4, obj.getFabricante());
            p.setInt(5, obj.getAnoModelo());
            p.setInt(6, obj.getQtdPortas());
            p.setString(7, obj.getAcessorios());

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO Cadastrar" + erro);
        }

    }

    public ArrayList<VeiculoDTO> pesquisarVeiculo() {
        String pesquisar = "SELECT * FROM veiculo ORDER BY nome";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(pesquisar);
            rs = p.executeQuery();

            while (rs.next()) {
                VeiculoDTO c = new VeiculoDTO();
                c.setNome(rs.getString("nome"));
                c.setNumero(rs.getInt("numero"));
                c.setPlaca(rs.getString("placa"));
                c.setFabricante(rs.getString("fabricante"));
                c.setAnoModelo(rs.getInt("anoModelo"));
                c.setQtdPortas(rs.getInt("qntPortas"));
                c.setAcessorios(rs.getString("acessorios"));
                c.setIdVeiculo(rs.getInt("idVeiculo"));

                lista.add(c);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + erro);
        }
        return lista;
    }

    public void alterarVeiculo(VeiculoDTO obj) {
        String alterar = "UPDATE veiculo SET nome=?,numero=?,placa=?,fabricante=?,anoModelo=?,qntPortas=?,acessorios=? WHERE idVeiculo=?";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(alterar);
            p.setString(1, obj.getNome());
            p.setInt(2, obj.getNumero());
            p.setString(3, obj.getPlaca());
            p.setString(4, obj.getFabricante());
            p.setInt(5, obj.getAnoModelo());
            p.setInt(6, obj.getQtdPortas());
            p.setString(7, obj.getAcessorios());

            p.setInt(8, obj.getIdVeiculo());

            p.execute();
            p.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO ALTERAR: " + erro);
        }
    }

    public ArrayList<VeiculoDTO> buscarVeiculo(String nome, String placa) {
        String buscar = "SELECT * FROM veiculo WHERE nome like ? OR placa like ? ORDER BY nome";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(buscar);
            p.setString(1, nome);
            p.setString(2, placa);
            rs = p.executeQuery();

            while (rs.next()) {
                VeiculoDTO obj = new VeiculoDTO();
                obj.setNome(rs.getString("nome"));
                obj.setNumero(rs.getInt("numero"));
                obj.setPlaca(rs.getString("placa"));
                obj.setFabricante(rs.getString("fabricante"));
                obj.setAnoModelo(rs.getInt("anoModelo"));
                obj.setQtdPortas(rs.getInt("qntPortas"));
                obj.setAcessorios(rs.getString("acessorios"));
                obj.setIdVeiculo(rs.getInt("idVeiculo"));

                lista.add(obj);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + erro);
        }
        return lista;
    }
    
    public void excluirVeiculo(VeiculoDTO obj) {
        String excluir = "DELETE FROM veiculo WHERE idVeiculo=?";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(excluir);
            
            p.setInt(1, obj.getIdVeiculo());

            p.execute();
            p.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir" + erro);
        }
    }

}
