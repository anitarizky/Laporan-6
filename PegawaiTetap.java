/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapinherit;

/**
 *
 * @author ANITA
 */
public class PegawaiTetap extends Employee {
    public PegawaiTetap(String nm, String i, String j, int g, String is, int a, int t, String l, int jl){
        super (nm, i, j, g, is, a, t, l, jl);
    }
    
    @Override
    public void hitunggaji(String nm, String i, String j, int g, String is, int a, int t, String l, int jl){
        super.hitunggaji(nama,id,jabatan,gaji,istri,anak,tahun,lembur,jamlembur);
        System.out.println("Total Gaji  : Rp "+total);
    }
    
    public void display(){
        System.out.println("Nama        : "+nama);
        System.out.println("ID Kerja    : "+id);
        System.out.println("Jabatan     : "+jabatan);
        System.out.println("Istri(y/t)  : "+istri);
        System.out.println("Jml Anak    : "+anak);
        System.out.println("Lama Kerja  : "+tahun+" tahun");
        hitunggaji(nama,id,jabatan,gaji,istri,anak,tahun,lembur,jamlembur);
        System.out.println("");
    }
}
