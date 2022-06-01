public class Arraymulti {
    public static void main(String[] args) {
        int arr1[][] ={{1,6,3},{2,3,6},{4,3,5}};
        int arr2[][] ={{5,3,2},{6,8,41},{7,20,9}};
        int multi [][]= new int[3][3];
        System.out.println("First matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]);  
            }
            System.out.println("");
          }
        System.out.println("Second matrix");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]);   
    }
            System.out.println("");
            
    
}
        System.out.println("Addition of two matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                multi[i][j]=arr1[i][j]* arr2[i][j];
                System.out.print(multi[i][j]+"");
       
    }
            System.out.println("");
}
    }
}
