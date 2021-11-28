/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalimprove;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class dataMember extends RentalImprove {
    
    ArrayList<String> Member = new ArrayList<>();
    ArrayList<String> NamaMember = new ArrayList<>();
    ArrayList<String> jnisMember = new ArrayList<>();
//    gold g = new gold();
//    premium p = new premium();
    
    Scanner idinput = new Scanner(System.in);
    Scanner data = new Scanner(System.in);
    
    private String jenisMember;
    private String nama;
    public String id;
    private int biayaSewa;
    private double diskon;
    private int poin;
    private int cashback;
    private int bonusPulsa;
    private int tglPinjam;
    private int blnPinjam;
    private int thnPinjam;
    private int tglKembali;
    private int blnKembali;
    private int thnKembali;
    private int jmlhpoin;
    private int totalSewa;
    
    void data(){
        System.out.print("Masukkan ID Member             : ");
        String x = idinput.nextLine();
        this.id = x;
        System.out.print("Masukkan Tanggal Pinjam(1-31)  : ");
        this.tglPinjam = data.nextInt();
        System.out.print("Masukkan Bulan Pinjam(1-12)    : ");
        this.blnPinjam = data.nextInt();
        System.out.print("Masukkan Tahun Pinjam(1-12)    : ");
        this.thnPinjam = data.nextInt();
        System.out.print("Masukkan Tanggal Kembali(1-31) : ");
        this.tglKembali = data.nextInt();
        System.out.print("Masukkan Bulan Kembali(1-12)   : ");
        this.blnKembali = data.nextInt();
        System.out.print("Masukkan Tahun Kembali(1-12)   : ");
        this.thnKembali = data.nextInt();
    }
    public String getId(){
        return this.id;
    }
    
    public int gettotalSewa(){
        if ("M001".equals(this.id)){
            this.totalSewa = (setlamaHari() * 25000) - ((setlamaHari() * 25000) * 1/100);
        } else if ("M002".equals(this.id)){
            this.totalSewa = (setlamaHari() * 30000) - ((setlamaHari() * 30000) * 2/100);
        } else if ("M003".equals(this.id)){
            this.totalSewa = (setlamaHari() * 45000) - ((setlamaHari() * 45000) * 3/100);
        }
        return this.totalSewa;
    }
    
    public int getjmlhpoin(){
        if ("M001".equals(this.id)){
            this.jmlhpoin = setlamaHari() * 1;
        } else if ("M002".equals(this.id)){
            this.jmlhpoin = setlamaHari() * 5;
        } else if ("M003".equals(this.id)){
            this.jmlhpoin = setlamaHari() * 10;
        } else{
            this.jmlhpoin = 0;
        }
        return this.jmlhpoin;
    }
    
    public int getbonusPulsa(){
        return this.bonusPulsa;
    }
    
    public int settglPinjam(){
        if(this.tglPinjam > 31 && this.tglPinjam < 0){
            this.tglPinjam = 0;
        } else{
            this.tglPinjam = this.tglPinjam;
        }
        return this.tglPinjam;
    }
    
    public int setblnPinjam(){
        if(this.blnPinjam > 12 && this.blnPinjam < 0){
            this.blnPinjam = 0;
        } else{
            this.blnPinjam = this.blnPinjam;
        }
        return this.blnPinjam;
    }
    
    public int getthnPinjam(){
        return this.thnPinjam;
    }
    
    public int settglKembali(){
        if(this.tglKembali > 31 && this.tglKembali < 0){
            this.tglKembali = 0;
        } else{
            this.tglKembali = this.tglKembali;
        }
        return this.tglKembali;
    }
    
    public int setblnKembali(){
        if(this.blnKembali > 12 && this.blnKembali < 0){
            this.blnKembali = 0;
        } else{
            this.blnKembali = this.blnKembali;
        }
        return this.blnKembali;
    }
    
    public int getthnKembali(){
        return this.thnKembali;
    }
    
    public String setnama(){
        if ("M001".equals(this.id)){
            this.nama = "Mr.X";
        } else if ("M002".equals(this.id)){
            this.nama = "Mr.Y";
        } else if ("M003".equals(this.id)){
            this.nama = "Mr.Z";
        }
        return this.nama;
    }
    
    public String setJenisMmber(){
        if ("M001".equals(this.id)){
            this.jenisMember = "Silver";
        } else if ("M002".equals(this.id)){
            this.jenisMember = "Gold";
        } else if ("M003".equals(this.id)){
            this.jenisMember = "Platinum";
        }
        return this.jenisMember;
    }

    //Method menghitung lama hari
    public int setlamaHari(){
        int x = this.thnKembali;
        int y = this.blnKembali;
        int z = this.tglKembali;
        int a = this.thnPinjam;
        int b = this.blnPinjam;
        int c = this.tglPinjam;
        LocalDate from = LocalDate.of(a, b, c);
        LocalDate to = LocalDate.of(x, y, z);
        Period selisih = Period.between(from, to);
        
        int bulan = selisih.getMonths();
        int hari = selisih.getDays();
        int tahun = selisih.getYears();
        
        int total =(tahun * 365) + (bulan * 30) + hari;
        
        return total;
    }
    
    
    ArrayList anggota(){
        this.Member.add("M001");
        this.Member.add("M002");
        this.Member.add("M003");
        return this.Member;
    }
    
    ArrayList namaAnggota(){
        this.NamaMember.add("Mr.X");
        this.NamaMember.add("Mr.Y");
        this.NamaMember.add("Mr.Z");
        return this.Member;
    }
    
    ArrayList JenisMember(){
        this.jnisMember.add("Mr.X");
        this.jnisMember.add("Mr.Y");
        this.jnisMember.add("Mr.Z");
        return this.Member;
    }

}
