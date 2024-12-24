/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi_postgre;

/**
 *
 * @author LENOVO 13
 */
import java.sql.*;
import javax.swing.*;
public class Koneksi_Postgres {
private String username, password, url;
    public Connection conn;
    public Koneksi_Postgres() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            url = "jdbc:postgresql://localhost/latihan13";
            username = "postgres";
            password = "12345678";
            try {
                conn = DriverManager.getConnection(url, username, password);
                JOptionPane.showMessageDialog(null, "ok berhasil");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "salah/n server belum start /n hubungi admin");
                System.exit(1);
            }
        } catch (Exception ex) {
            System.out.println("salah");
        }
    }
    public static void main(String[] a) {
        new Koneksi_Postgres();
    }
}

