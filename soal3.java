package modul6;

public class soal3 {
    public static void main(String[] args) {
        String [][] data= {{"ABDUL","085646668991","Kediri"}, {"KUSNO","085646668992","Trenggalek"},{"PONIRAN","085646668992","Bojonegoro"}};
        
        System.out.println("|Nama|Alamat|Telepon|");
        for(int i =0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                if(j==0){
                    System.out.print("|"+data[i][j]);
                }else if(j==1){
                    System.out.print("|"+data[i][j+1]);
                }else if(j==2){
                    System.out.print("|"+data[i][j-1]+"|");
                }
                
            }
            System.out.println();
        }
    }
}
