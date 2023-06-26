package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {
    private String host;
    private String dbName;
    private int port;
    private String password;
    private String user;
    private Connection conn = null;

    public MyDB(String host, int port, String dbName) {
        this.host = host;
        this.port = port;
        this.dbName = dbName;
    }
    private void connect() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        try {
            conn = DriverManager.getConnection(
                    jdbcString,
                    connectionProps
            );
        }
        catch (SQLException e) {
            System.out.println("Błąd połączenia do bazy: " + jdbcString);
            System.out.println("Komunikat błędu: " + dbName);
            conn = null;
        }
        System.out.println("Connected to database " + dbName);
    }

    public Connection getConnection() {
        if (conn == null) connect();
        return conn;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
