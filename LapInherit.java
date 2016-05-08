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
public class LapInherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m1 = new Manager("Anton", "M01", "Manager", 5000000, "y", 5, 12, "t", 0);
        
        PegawaiTidakTetap ptt1 = new PegawaiTidakTetap("Budi", "N01", "NON - PNS", 1000000, "Y", 1, 3, "t", 0);
        PegawaiTidakTetap ptt2 = new PegawaiTidakTetap("Rizky", "N02", "NON - PNS", 1000000, "Y", 3, 5, "y", 8);
        PegawaiTidakTetap ptt3 = new PegawaiTidakTetap("Agus", "N03", "NON - PNS", 1000000, "Y", 4, 12, "y", 12);
        PegawaiTidakTetap ptt4 = new PegawaiTidakTetap("Tono", "N04", "NON - PNS", 1000000, "T", 0, 3, "y", 3);
        PegawaiTidakTetap ptt5 = new PegawaiTidakTetap("Herman", "N05", "NON - PNS", 1000000, "T", 0, 12, "y", 12);
        
        PegawaiTetap pt1 = new PegawaiTetap("Budi", "P01", "PNS", 3000000, "T", 0, 5, "t", 0);
        PegawaiTetap pt2 = new PegawaiTetap("Anto", "P02", "PNS", 3000000, "T", 0, 12, "t", 0);
        PegawaiTetap pt3 = new PegawaiTetap("Yudi", "P03", "PNS", 3000000, "T", 0, 8, "t", 0);
        PegawaiTetap pt4 = new PegawaiTetap("Doni", "P04", "PNS", 3000000, "Y", 2, 2, "t", 0);
        PegawaiTetap pt5 = new PegawaiTetap("Candra", "P05", "PNS", 3000000, "Y", 4, 6, "t", 0);
        PegawaiTetap pt6 = new PegawaiTetap("Dono", "P06", "PNS", 3000000, "Y", 0, 12, "t", 0);
        PegawaiTetap pt7 = new PegawaiTetap("Salim", "P07", "PNS", 3000000, "Y", 4, 2, "t", 0);
        PegawaiTetap pt8 = new PegawaiTetap("Dwi", "P08", "PNS", 3000000, "Y", 4, 12, "t", 0);
        PegawaiTetap pt9 = new PegawaiTetap("Yudha", "P09", "PNS", 3000000, "Y", 1, 12, "t", 0);
        PegawaiTetap pt10 = new PegawaiTetap("Norman", "P10", "PNS", 3000000, "Y", 5, 12, "t", 0);
        
        m1.display();
        pt1.display();
        pt2.display();
        pt3.display();
        pt4.display();
        pt5.display();
        pt6.display();
        pt7.display();
        pt8.display();
        pt9.display();
        pt10.display();
        ptt1.display();
        ptt2.display();
        ptt3.display();
        ptt4.display();
        ptt5.display();
        
        
    }
    
}
