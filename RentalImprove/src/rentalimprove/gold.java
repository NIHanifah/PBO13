/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalimprove;

/**
 *
 * @author ASUS
 */
public class gold extends dataMember {
    
    private int jmlcashback;
    
    dataMember data2 = new dataMember();
//    Contractor
    public int cashback(String x){
        if ("M002".equals(x)){
            this.jmlcashback = 5000;
            System.out.println("Jumlah Cashback : "+this.jmlcashback);
        } else if ("M003".equals(x)){
            this.jmlcashback = 10000;
            System.out.println("Jumlah Cashback : "+this.jmlcashback);
        } else{
            this.jmlcashback = 0;
        }
        return this.jmlcashback;
        
    }
    
    public void aidi(String x){
        System.out.print("jjjjj"+x);
    }
}
