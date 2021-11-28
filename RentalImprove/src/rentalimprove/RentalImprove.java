/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalimprove;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class RentalImprove {

    /**
     * @param args the command line arguments
     */

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        dataMember dataz = new dataMember();
        premium p = new premium();
        gold g = new gold();
        dataz.data();

        
        String x = dataz.id;
        p.datas(x, dataz.setnama(), dataz.setJenisMmber(), dataz.settglPinjam(), dataz.setblnPinjam(), dataz.getthnPinjam(), dataz.settglKembali(), dataz.setblnPinjam(), dataz.getthnKembali(), dataz.setlamaHari(), dataz.gettotalSewa(), dataz.getjmlhpoin());
        g.cashback(x);
        p.pulsa(x);
        
    }
    
}
