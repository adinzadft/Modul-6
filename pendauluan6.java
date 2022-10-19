package modul6;

public class pendauluan6 {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        
        //FOR
        double jumlahData=0;
        int banyakData=0;
        System.out.println("FOR");
        for (int i = 0;i < data2.length;i++){
            for (int j = 0;j < data2[0].length;j++){
                System.out.print(data2[i][j]+" ");
                jumlahData+=data2[i][j];
                banyakData+=1;
            }
            System.out.println();
        }
        
        //Rata Rata
        double rata2=jumlahData/banyakData;
        System.out.println("Rata-rata = "+rata2); 
    }
}
