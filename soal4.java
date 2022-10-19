package modul6;

import javax.swing.JOptionPane;

public class soal4 {
    public static void main(String[] args) {
        int[][] matriks1= {{2,9},{1,5}};
        int[][] matriks2= {{5,17},{10,4}};
        
        //A
        int find = Integer.parseInt(JOptionPane.showInputDialog("Cari Index Angka"));
        for(int i=0;i<matriks1.length;i++){
            for(int j=0;j<matriks1[0].length;j++){
                if(find==matriks1[i][j]){
                    JOptionPane.showMessageDialog(null, "Posisi Indek = "+"["+i+"]"+"["+j+"]");
                }
            }
        }
        
        //B
        int[][] matriksBaru= {{0,0},{0,0}};
        for(int i=0;i<matriksBaru.length;i++){
            for(int j=0;j<matriksBaru.length;j++){
                matriksBaru[i][j] = matriks1[i][j]+matriks2[i][j];
                System.out.print(matriksBaru[i][j]+" ");
            }
            System.out.println();
        }
    }
}
