package br.bossini;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

//ORM: Object-Relational-Mapping
public class PessoaDAO {
	// jdbc: java database connectivity
	public void cadastrar(Pessoa pessoa)
			throws Exception {
		// 1. Definir o comando SQL (INSERT)
		var sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
		// 2. Estabelecer uma conexão com o SGBD
		var connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.obterConexao();
		// 3. Preparar o comando
		PreparedStatement ps = conexao.prepareStatement(sql);
		// 4. Substituir os eventuais placeholders
		ps.setString(1, pessoa.getNome());
		ps.setString(2, pessoa.getFone());
		ps.setString(3, pessoa.getEmail());
		// 5. Executar o comando
		ps.execute();
		// 6. Fechar os recursos
		ps.close();
		conexao.close();
	}

	public void atualizar(Pessoa pessoa) throws Exception{
		//1. Definir o comando SQL
		var sql = "UPDATE tb_pessoa SET nome=?, fone=?, email=? WHERE cod_pessoa=?";
		//Java 7+
		//try-with-resources
		try(
			var conexao = 
					ConnectionFactory.obterConexao();
			var ps = conexao.prepareStatement(sql);
		){
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getFone());
			ps.setString(3, pessoa.getEmail());
			ps.setInt(4, pessoa.getCodigo());
			ps.execute();
		}
	}

	public void remover(Pessoa pessoa) throws Exception{
		//fazer em casa, removendo pelo codigo apenas
		//ou seja, a pessoa que vai chegar via parametro tem apenas
		//o codigo configurado
		//e fazer o case correspondente na classe Principal
	}

	public List<Pessoa> listar() throws Exception{
		var pessoas = new ArrayList<Pessoa>();
		var sql = "SELECT * FROM tb_pessoa ORDER BY nome";
		try(
			var conexao = ConnectionFactory.obterConexao();
			var ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		){
			//lidar com o resultado
			while(rs.next()){
				var codigo = rs.getInt("cod_pessoa");
				var nome = rs.getString("nome");
				var fone = rs.getString("fone");
				var email = rs.getString("email");
				var pessoa = new Pessoa(codigo, nome, fone, email);
				pessoas.add(pessoa);
			}
			return pessoas;
		}	
	}
}
