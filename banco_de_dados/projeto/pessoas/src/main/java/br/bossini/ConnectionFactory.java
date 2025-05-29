package br.bossini;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
  private static String host = "localhost";
  private static String port = "5432";
  private static String db = "20251_fatec_ipi_poo_pessoas_bossini";
  private static String user = "postgres";
  private static String password = "postgres";

  //https://google.com:80/search
  public static Connection obterConexao() throws Exception{
    //string de conexão
    var s = String.format(
      "jdbc:postgresql://%s:%s/%s",
      host, port, db
    );
    //cláusula catch or declare
    //exceção verificada pelo compilador
    Connection c = DriverManager.getConnection(
      s, user, password
    );
    return c;
  }
}
