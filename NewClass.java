package modul6;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        
        int search = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka yang Ingin Dicari"));
        
        String posisiIndex="";
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                if(search == data2[i][j]){
                    posisiIndex += "["+i+"]"+"["+j+"]"+"\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Posisi indek : \n"+posisiIndex);
    }
}
