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
public class Employee {
    String nama, id, jabatan, istri, lembur;
    int anak, tahun, jamlembur, gaji;
    double bonus, tunjangan, total;
    
    public Employee(){
        
    }
    
    public Employee(String nm, String i, String j, int g, String is, int a, int t, String l, int jl){
        nama = nm;
        id = i;
        jabatan = j;
        gaji = g;
        istri = is;
        anak = a;
        tahun = t;
        lembur = l;
        jamlembur = jl;
        
    }
    
    public void hitunggaji(String nm, String i, String j, int g, String is, int a, int t, String l, int jl){
        if (istri.equalsIgnoreCase("ya")){
            if (1 <= anak && anak <=3 ){
                tunjangan = anak * (0.15 * gaji);
                if (tahun <= 5){
                    total = gaji + tunjangan + (0.1 * gaji);
                }
                else if (5 < tahun && tahun <= 10){
                    bonus = 0.05 * gaji; 
                    total = bonus + gaji + tunjangan + (0.1 * gaji);
                }
                else if (tahun > 10){
                    bonus = 0.1 * gaji; 
                    double tunj = tunjangan + (0.1 * gaji);
                    total = bonus + gaji + tunj + (0.1 * gaji);
                } 
            }
            else if (anak > 3){
                tunjangan = 3 * (0.15 * gaji);
                if (tahun <= 5){
                    total = gaji + tunjangan + (0.1 * gaji);
                }
                else if (5 < tahun && tahun <= 10){
                    bonus = 0.05 * gaji; 
                    total = bonus + gaji + tunjangan + (0.1 * gaji);
                }
                else if (tahun > 10){
                    bonus = 0.1 * gaji; 
                    double tunj = tunjangan + (0.1 * gaji);
                    total = bonus + gaji + tunj + (0.1 * gaji);
                }
            }  
        }
        else
            if (tahun <= 5){
                    total = gaji;
                }
                else if (5 < tahun && tahun <= 10){
                    bonus = 0.05 * gaji; 
                    total = bonus + gaji;
                }
                else if (tahun > 10){
                    bonus = 0.1 * gaji; 
                    double tunj = 0.1 * gaji;
                    total = bonus + gaji + tunj;
                }
        
    }
    
    
    
    
}
