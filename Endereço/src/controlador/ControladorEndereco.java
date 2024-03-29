/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.EnderecoDao;
import javax.swing.JOptionPane;
import modelo.Endereco;


import tela.manutencao.ManutencaoEndereco;

/**
 *
 * @author Administrador
 */
public class ControladorEndereco {
    
    public static void alterar(ManutencaoEndereco man){
        Endereco objeto = new Endereco();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCódigo.getText()));
        objeto.setBairro(man.jtfBairro.getText());
        objeto.setComplemento(man.jtfComplemento.getText());
        objeto.setLogradouro(man.jtfLogradouro.getText());
        
        boolean resultado = EnderecoDao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void inserir(ManutencaoEndereco man){
        Endereco objeto = new Endereco();
        objeto.setCodigo(Integer.parseInt(man.jtfCódigo.getText()));
        objeto.setBairro(man.jtfBairro.getText());
        objeto.setComplemento(man.jtfComplemento.getText());
        objeto.setLogradouro(man.jtfLogradouro.getText());
        
        boolean resultado = EnderecoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void excluir(ManutencaoEndereco man){
        Endereco objeto = new Endereco();
        objeto.setCodigo(Integer.parseInt(man.jtfCódigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = EnderecoDao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
