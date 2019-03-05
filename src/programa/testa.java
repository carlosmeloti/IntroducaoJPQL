/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import consultas.ConsultasJPQL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import model.SelectTeste;
import model.Serie;
import model.SerieDTO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author QoS Dev
 */
public class testa {
    
    public static void main(String[] args) {
        
        ConsultasJPQL c = new ConsultasJPQL();
        SerieDTO s =  new SerieDTO();
        Serie serie = new Serie();
        
	
        System.out.println(c.ListarTodasAsSeries());
        System.out.println("");
        System.out.println("-------");
        System.out.println(c.seriesCriadasAno2008());
        System.out.println("");
        System.out.println("-------");
        System.out.println(c.getSeriesCriadasNoAno(2013));
        System.out.println("");
        System.out.println("-------");
        System.out.println(c.listarSeriesCujoNomeContenha("Gotham"));
        System.out.println("");
        System.out.println("-------");
        System.out.println(c.listarSeriesPorAnoENome("Stranger Things", 2016));
        System.out.println("");
        System.out.println("-------");
        System.out.println(c.listarEpisodiosDaSerie("Gotham"));
        System.out.println("");
        System.out.println("-------");
        System.out.println(c.recuperarSeriesComNumeroMinimoDeTemporadas(3));
        

      //  System.out.println(c.buscaNomeSerie("Gotha"));
//      
//          System.out.println(c.buscaNomeSerieETemporada("Gotham", "A continuidade da história"));
//          System.out.println(serie.getNome());
        
    }
}
