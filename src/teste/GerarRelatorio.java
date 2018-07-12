package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import dao.CarroDAO;
import model.Carro;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Diego Munhoz
 */
public class GerarRelatorio {

    public static void gerarRelatorio(InputStream entrada, OutputStream saida, ListDataSource dataSource)
            throws JRException {
        JasperPrint printReport = JasperFillManager.fillReport(entrada, null, dataSource);
        JasperExportManager.exportReportToPdfStream(printReport, saida);
    }

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, JRException {
        try {
            InputStream entrada = GerarRelatorio.class.getClassLoader().getResourceAsStream("relatorio/carro.jasper");
            URL url = GerarRelatorio.class.getResource("rel.pdf");
            URI uri = url.toURI();
            File f = new File(uri);
            FileOutputStream saida = new FileOutputStream(f);
            ListDataSource<Carro> dataSource = new ListDataSource<Carro>(new CarroDAO().buscarTodos());
            GerarRelatorio.gerarRelatorio(entrada, saida, dataSource);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}