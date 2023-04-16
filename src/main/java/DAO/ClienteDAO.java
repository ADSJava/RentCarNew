/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author igora
 */
public class ClienteDAO {
    Connection c;
    PreparedStatement p;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public void cadastrarFuncionario(ClienteDTO clientedto) {
        String cadastrar = "INSERT INTO cliente(nomeCliente, endereco, uf, telefone, cpf, email) VALUES(?,?,?,?,?,?)";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(cadastrar);
            p.setString(1, clientedto.getNomeCliente());
            p.setString(2, clientedto.getEndereco());
            p.setString(3, clientedto.getUf());
            p.setString(4, clientedto.getTelefone());
            p.setString(5, clientedto.getCpf());
            p.setString(6, clientedto.getEmail());

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Cadastrar" + erro);
        }

    }

    public ArrayList<ClienteDTO> PesquisarCliente() {
        String pesquisar = "SELECT * FROM cliente";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(pesquisar);
            rs = p.executeQuery();

            while (rs.next()) {
                ClienteDTO clDTO = new ClienteDTO();
                clDTO.setId(rs.getInt("idCliente"));
                clDTO.setNomeCliente(rs.getString("nomeCliente"));
                clDTO.setEndereco(rs.getString("endereco"));
                clDTO.setUf(rs.getString("uf"));
                clDTO.setTelefone(rs.getString("telefone"));
                clDTO.setCpf(rs.getString("cpf"));
                clDTO.setEmail(rs.getString("email"));

                lista.add(clDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + erro);
        }
        return lista;
    }

    public void alterarCliente(ClienteDTO clienteDTO) {
        String alterar = "UPDATE cliente SET nomeCliente = ?, endereco=?,uf=?, telefone=?,cpf=?, email=? where idCliente = ?";
        c = new ConexaoDAO().conectaBD();

        try {
            p = c.prepareStatement(alterar);
            p.setString(1, clienteDTO.getNomeCliente());
            p.setString(2, clienteDTO.getEndereco());
            p.setString(3, clienteDTO.getUf());
            p.setString(4, clienteDTO.getTelefone());
            p.setString(5, clienteDTO.getCpf());
            p.setString(6, clienteDTO.getEmail());
            p.setInt(7, clienteDTO.getId());

            p.execute();
            p.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Alterar" + erro);
        }
    }
}
