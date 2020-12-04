/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.adrianmaidiyangsa.tabungan;
import java.util.*;
/**
 *
 * @author Beta Three
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("====Program Penarikan Uang====");
        
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tbgn = new Tabungan(scanner.nextInt());
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlah = scanner.nextInt();
       
        System.out.println("Saldo Anda Sekarang : "+tbgn.ambilUang(jumlah));
    }
    
}
