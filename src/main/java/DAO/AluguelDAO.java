package DAO;

import DTO.AluguelDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author igora
 */
public class AluguelDAO {

    Connection c;
    PreparedStatement p;
    ResultSet rs;
    ArrayList<AluguelDTO> lista = new ArrayList<>();
    SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");
    SimpleDateFormat formN = new SimpleDateFormat("dd/MM/yyyy");

    public void cadastrarAluguel(AluguelDTO obj) {
        String cadastrar = "INSERT INTO aluguel (modelo,dataAluguel,dataEntrega,nomeCliente,entregue,observacao,valorPago,cpfCliente,placaVeiculo) values (?,?,?,?,?,?,?,?,?)";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(cadastrar);
            p.setString(1, obj.getModelo());
            p.setString(2, obj.getDataAluguel());
            p.setString(3, obj.getDataEntrega());
            p.setString(4, obj.getNomeCliente());
            p.setString(5, obj.getEntregue());
            p.setString(6, obj.getObservacao());
            p.setDouble(7, obj.getValor());
            p.setString(8, obj.getCpfCliente());
            p.setString(9, obj.getPlacaVeiculo());

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO C: " + erro);
        }

    }

    // ALIMENTA A TABELA -----------------------------------------------
    public ArrayList<AluguelDTO> pesquisarAluguel() {
        String pesquisar = "SELECT * FROM aluguel ORDER BY nomeCliente";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(pesquisar);
            rs = p.executeQuery();

            while (rs.next()) {
                String anoA = rs.getString("dataAluguel").substring(0, 4);
                String mesA = rs.getString("dataAluguel").substring(5, 7);
                String diaA = rs.getString("dataAluguel").substring(8);
                String anoE = rs.getString("dataEntrega").substring(0, 4);
                String mesE = rs.getString("dataEntrega").substring(5, 7);
                String diaE = rs.getString("dataEntrega").substring(8);

                String dataEn = diaE + "-" + mesE + "-" + anoE;
                String dataAl = diaA + "-" + mesA + "-" + anoA;

                AluguelDTO obj = new AluguelDTO();
                obj.setModelo(rs.getString("modelo"));
                obj.setNomeCliente(rs.getString("nomeCliente"));
                obj.setPlacaVeiculo(rs.getString("placaVeiculo"));
                obj.setCpfCliente(rs.getString("cpfCliente"));
                obj.setValor(rs.getDouble("valorPago"));
                obj.setDataEntrega(dataEn);
                obj.setDataAluguel(dataAl);
                obj.setObservacao(rs.getString("observacao"));
                obj.setEntregue(rs.getString("entregue"));

                lista.add(obj);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO Pesquisar" + erro);
        }
        return lista;
    }

    /* public void alterarCliente(AluguelDTO obj) {
        String alterar = "UPDATE aluguel SET modelo=?, nomeCliente=?, placaVeiculo=?, cpfCliente=?,valor=?, dataEntrega=?, dataSaida=?, observacoes=? where idAluguel=?";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(alterar);
            p.setString(1, obj.getModelo());
            p.setString(2, obj.getNomeCliente());
            p.setString(3, obj.getPlacaVeiculo());
            p.setString(4, obj.getCpfCliente());
            p.setDouble(5, obj.getValor());
            p.setString(6, obj.getDataEntrega());
            p.setString(7, obj.getDataSaida());
            p.setString(8, obj.getObservacao());

            p.setInt(9, obj.getIdAluguel());

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO Alterar" + erro);
        }
    }
     */
    
    // METODO QUE FAZ A FILTRAGEM DA TABELA PELAS DATAS INICIAL E FINAL DO PERIODO.
    public ArrayList<AluguelDTO> buscarAluguel(String dataAlu,String dataEnt) {
        String pesquisar = "SELECT * FROM aluguel WHERE dataAluguel between ? and ? ORDER BY nomeCliente";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(pesquisar);
            p.setString(1, dataAlu);
            p.setString(2, dataEnt);
            rs = p.executeQuery();

            while (rs.next()) {                
                String anoA = rs.getString("dataAluguel").substring(0, 4);
                String mesA = rs.getString("dataAluguel").substring(5, 7);
                String diaA = rs.getString("dataAluguel").substring(8);
                String anoE = rs.getString("dataEntrega").substring(0, 4);
                String mesE = rs.getString("dataEntrega").substring(5, 7);
                String diaE = rs.getString("dataEntrega").substring(8);

                String dataEn = diaE + "-" + mesE + "-" + anoE;
                String dataAl = diaA + "-" + mesA + "-" + anoA;

                AluguelDTO obj = new AluguelDTO();
                obj.setModelo(rs.getString("modelo"));
                obj.setNomeCliente(rs.getString("nomeCliente"));
                obj.setPlacaVeiculo(rs.getString("placaVeiculo"));
                obj.setCpfCliente(rs.getString("cpfCliente"));
                obj.setValor(rs.getDouble("valorPago"));
                obj.setDataEntrega(dataEn);
                obj.setDataAluguel(dataAl);
                obj.setObservacao(rs.getString("observacao"));
                obj.setEntregue(rs.getString("entregue"));

                lista.add(obj);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO Pesquisar" + erro);
        }
        return lista;
    }
    
    // METODO QUE FAZ A FILTRAGEM DA TABELA PELA ESCOLHA FEITA PELO COMBOBOX.
    public ArrayList<AluguelDTO> buscarAluguel(String status) {
        String pesquisar = "SELECT * FROM aluguel WHERE entregue=? ORDER BY modelo";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(pesquisar);
            p.setString(1, status);            
            rs = p.executeQuery();

            while (rs.next()) {                
                String anoA = rs.getString("dataAluguel").substring(0, 4);
                String mesA = rs.getString("dataAluguel").substring(5, 7);
                String diaA = rs.getString("dataAluguel").substring(8);
                String anoE = rs.getString("dataEntrega").substring(0, 4);
                String mesE = rs.getString("dataEntrega").substring(5, 7);
                String diaE = rs.getString("dataEntrega").substring(8);

                String dataEn = diaE + "-" + mesE + "-" + anoE;
                String dataAl = diaA + "-" + mesA + "-" + anoA;

                AluguelDTO obj = new AluguelDTO();
                obj.setModelo(rs.getString("modelo"));
                obj.setNomeCliente(rs.getString("nomeCliente"));
                obj.setPlacaVeiculo(rs.getString("placaVeiculo"));
                obj.setCpfCliente(rs.getString("cpfCliente"));
                obj.setValor(rs.getDouble("valorPago"));
                obj.setDataEntrega(dataEn);
                obj.setDataAluguel(dataAl);
                obj.setObservacao(rs.getString("observacao"));
                obj.setEntregue(rs.getString("entregue"));

                lista.add(obj);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO Pesquisar" + erro);
        }
        return lista;
    }

    /* public void excluirAluguel(AluguelDTO obj) {
        String excluir = "DELETE FROM aluguel WHERE idAluguel = ?";
        c = new ConexaoDAO().conectaBD();

        try {

            p = c.prepareStatement(excluir);
            p.setInt(1, obj.getIdAluguel());

            p.execute();
            p.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO Excluir" + erro);
        }
    }*/
}
