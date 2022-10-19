package modul6;

import javax.swing.JOptionPane;

public class soal2 {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        //FOR
        System.out.println("\nFOR");
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                System.out.print(data2[i][j]+" ");
            }
            System.out.println();
        }System.out.println();
        
        /*A*/
        //WHILE
        System.out.println("WHILE");
        int a = 0,b = 0;
        while(a<data2.length){
            while(b<data2[0].length){
                System.out.print(data2[a][b]+" ");
                b++;
            }
            b=0;
            a++;
            System.out.println();
        }
        
        //DO wWHILE
        System.out.println("\nDO While");
        int c = 0,d=0;
        do{
            do{
                System.out.print(data2[c][d]+" ");
                d++;
            }while(d<data2[0].length);
            d=0;
            c++;
            System.out.println();
        }while(c<data2.length);
        
        /*B*/
        double jumlahData=0,rata2;
        int banyakData=0;
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                jumlahData+=data2[i][j];
                banyakData+=1;
            }
        }
        rata2=jumlahData/banyakData;
        System.out.println("\nRata-rata = "+rata2);
        
        
        /*C*/
        int check = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Akan Dicari"));
        String posisiIndex="";
        int gantiNilai = Integer.parseInt(JOptionPane.showInputDialog("Ganti Dengan "));
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                if(check == data2[i][j]){
                    posisiIndex += "["+i+"]"+"["+j+"]"+"\n";
                    data2[i][j]= gantiNilai;
                }
            }
        }
        System.out.println("\nData Array Baru");
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                System.out.print(data2[i][j]+" ");
            }
            System.out.println();
        }System.out.println();
        
        /*D*/
        int jumlah = 0;
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                if(j%2==0){
                    jumlah += data2[i][j];
                }
            }
        }System.out.println();
        
        System.out.println("Jumlah Elemen Indeks Genap Adalah"+ jumlah);
    }
}
