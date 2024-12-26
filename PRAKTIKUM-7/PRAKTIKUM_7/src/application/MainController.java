package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {

    // Tab Buku
    @FXML
    private TextField idField, judulField, penulisField, hargaField, stokField;
    @FXML
    private Button insertButton, updateButton, deleteButton;
    @FXML
    private TableView<Buku6> TableView;
    @FXML
    private TableColumn<Buku6, Integer> idColumn;
    
    @FXML
    private TableColumn<Buku6, String> titleColumn;

    @FXML
    private TableColumn<Buku6, String> penulisColumn;

    @FXML
    private TableColumn<Buku6, Integer> hargaColumn;

    @FXML
    private TableColumn<Buku6, Integer> stokColumn;

    // Tab Pelanggan
    @FXML
    private TextField pelangganIdField, pelangganNamaField, pelangganEmailField, pelangganTeleponField;
    @FXML
    private Button insertPelangganButton, updatePelangganButton, deletePelangganButton;
    @FXML
    private TableView<Pelanggan6> pelangganTableView;
    @FXML
    private TableColumn<Pelanggan6, Integer> pelangganIdColumn;
   
    @FXML
    private TableColumn<Pelanggan6, String> pelangganNamaColumn;

    @FXML
    private TableColumn<Pelanggan6, String> pelangganEmailColumn;

    @FXML
    private TableColumn<Pelanggan6, Integer> pelangganTeleponColumn;    
    // Tab Penjualan
    @FXML
    private TextField jumlahField, totalHargaField, tanggalField, pelangganIdFieldPenjualan, bukuIdField, penjualanIdField;
    @FXML
    private Button insertPenjualanButton, updatePenjualanButton, deletePenjualanButton;
    @FXML
    private TableView<Penjualan6> penjualanTableView;
    @FXML
    private TableColumn<Penjualan6, Integer> jumlahColumn;
 
    @FXML
    private TableColumn<Penjualan6, Integer> totalHargaColumn;

    @FXML
    private TableColumn<Penjualan6, Integer> tanggalColumnn;

    @FXML
    private TableColumn<Penjualan6, Integer> pelangganIdPenjualanColumn; 
    
    @FXML
    private TableColumn<Penjualan6, Integer> bukuIdPenjualanColumn; 
    
    @FXML
    private TableColumn<Penjualan6, Integer> penjualanIdColumn; 

    // Handler untuk tab Buku
    @FXML
    private void insertButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Insert di tab Buku
        System.out.println("Insert Buku: " + idField.getText());
    }

    @FXML
    private void updateButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Update di tab Buku
        System.out.println("Update Buku: " + idField.getText());
    }

    @FXML
    private void deleteButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Delete di tab Buku
        System.out.println("Delete Buku: " + idField.getText());
    }

    // Handler untuk tab Pelanggan
    @FXML
    private void insertPelangganButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Insert di tab Pelanggan
        System.out.println("Insert Pelanggan: " + pelangganIdField.getText());
    }

    @FXML
    private void updatePelangganButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Update di tab Pelanggan
        System.out.println("Update Pelanggan: " + pelangganIdField.getText());
    }

    @FXML
    private void deletePelangganButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Delete di tab Pelanggan
        System.out.println("Delete Pelanggan: " + pelangganIdField.getText());
    }

    // Handler untuk tab Penjualan
    @FXML
    private void insertPenjualanButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Insert di tab Penjualan
        System.out.println("Insert Penjualan: " + penjualanIdField.getText());
    }

    @FXML
    private void updatePenjualanButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Update di tab Penjualan
        System.out.println("Update Penjualan: " + penjualanIdField.getText());
    }

    @FXML
    private void deletePenjualanButton(ActionEvent event) {
        // Tambahkan logika untuk tombol Delete di tab Penjualan
        System.out.println("Delete Penjualan: " + penjualanIdField.getText());
    }
}
