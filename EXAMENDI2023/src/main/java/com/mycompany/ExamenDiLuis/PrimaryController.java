package com.mycompany.ExamenDiLuis;

import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField ADTxt;

    @FXML
    private Label Creador;

    @FXML
    private TextField DITxt;

    @FXML
    private Button DescargarBtn;

    @FXML
    private TextField EIETxt;

    @FXML
    private TextField HLCTxt;

    @FXML
    private TextField Nombre;

    @FXML
    private TextField PMDMTxt;

    @FXML
    private TextField PSPTxt;

    @FXML
    private TextField SGETxt;

    @FXML
    private TableView<?> Tabla;

    @FXML
    private TextField apellidosTxt;

    @FXML
    private Button añadirBtn;

    @FXML
    private TableColumn<?, ?> cAD;

    @FXML
    private TableColumn<?, ?> cApellidos;

    @FXML
    private TableColumn<?, ?> cDI;

    @FXML
    private TableColumn<?, ?> cEIE;

    @FXML
    private TableColumn<?, ?> cHLC;

    @FXML
    private TableColumn<?, ?> cNombre;

    @FXML
    private TableColumn<?, ?> cPMDM;

    @FXML
    private TableColumn<?, ?> cPSP;

    @FXML
    private TableColumn<?, ?> cSGE;

    @FXML
    private Button salirBtn;

    @FXML
    void DescargarBtnOnAction(ActionEvent event) {
        pdf();
    }

    @FXML
    void añadirBtnOnAction(ActionEvent event) {

    }

    @FXML
    void salirBtnOnAction(ActionEvent event) {

    }

    public void pdf()throws JRException, ClassNotFoundException, SQLException {

        HashMap hm = new HashMap();


        JasperReport report = JasperCompileManager.compileReport("src/main/resources/Reports/InformeNotas.jrxml");

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report,
                hm,
                JDBCconnection.getConnection()
        );

        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("InformeNotasPDF.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();
    
    }

}
