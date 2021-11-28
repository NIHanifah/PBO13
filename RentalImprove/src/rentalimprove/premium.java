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
public class premium extends gold{
    private int bonusPulsa;
    dataMember data2 = new dataMember();
    
    public void pulsa(String x){
        if ("M003".equals(x)){
            this.bonusPulsa = 5000;
            System.out.println("Jumlah Pulsa    : " + this.bonusPulsa);
        } else{
            this.bonusPulsa = 0;
        }
        
    }

    void datas(String id, String nama, String jenis, int tglpnjm, int blnpjm, int thnpjm, int tglkbml, int tglblnkmbl, int thnkbml, int lmhr, int ttlsw, int jmlpn){
        if (anggota().contains(id)){
        System.out.println("ID Member       : " + id);
        System.out.println("Nama Member     : " + nama);
        System.out.println("Jenis Member    : " + jenis);
        System.out.print("Tanggal Pinjam  : ");
        System.out.print(tglpnjm);
        System.out.print("-");
        System.out.print(blnpjm);
        System.out.print("-");
        System.out.println(thnpjm);
        System.out.print("Tanggal Kembali : ");
        System.out.print(tglkbml);
        System.out.print("-");
        System.out.print(tglblnkmbl);
        System.out.print("-");
        System.out.println(thnkbml);
        System.out.println("Lama Sewa       : " + lmhr + " hari");
        System.out.println("Total Sewa      : " + ttlsw);
        System.out.println("Jumlah Poin     : " + jmlpn);
        } else{
            System.out.println("Data tidak ada");
            
    }
    }
   
}
