
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manis
 */
public class P1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fout = new FileOutputStream("Indb.properties");
        Properties p = new Properties();
        p.setProperty("url", "jdbc:mysql://localhost:3306/db");
        p.setProperty("un", "root");
        p.setProperty("ps","Manish@2163");
        p.store(fout,"This File is Created By Me");
        System.out.println("Data Written success");
        
        
//        FileInputStream fin = new FileInputStream("indb.properties");
//        Properties p = new Properties();
//        p.load(fin);
//        System.out.println("UserName : " + p.getProperty("un"));
//        System.out.println("Password : " + p.getProperty("ps"));
//        System.out.println("URL : " + p.getProperty("url"));

    }
}
