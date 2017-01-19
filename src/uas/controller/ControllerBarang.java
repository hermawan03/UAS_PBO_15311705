/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.controller;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uas.model.ModelBarang;
import uas.util.Koneksi;

/**
 *
 * @author Toshiba
 */
public class ControllerBarang {
     Koneksi koneksi = new Koneksi();
    
    public void simpanData(ModelBarang mb){//memanggil kelas ModelPeminjaman dan membuat objek mb
         koneksi.koneksiDatabase();
        String query = "insert into tbl_barang(namaTeman,barangPinjam) values ('"+mb.getNama()+"','"+mb.getJenis()+"')";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }
    }
}
