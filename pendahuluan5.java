package modul6;

import javax.swing.JOptionPane;

public class pendahuluan5 {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        
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
        System.out.println("\nDO WHILE");
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
        
        //FOR
        System.out.println("\nFOR");
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                System.out.print(data2[i][j]+" ");
            }
            System.out.println();
        }System.out.println();
        
    }
}
