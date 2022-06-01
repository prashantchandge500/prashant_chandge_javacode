
public class Clonearraydemo {
    public static void main(String[] args) {
    int arr1[]={1,2,3,4,5};
    int arr2[]=  arr1.clone();
    
     System.out.println(arr1==arr2);
        System.out.println(arr1!=arr2);
        System.out.println(arr1==arr1);
        System.out.println(arr2==arr2);
        
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
        System.out.println("  "
                + "");
     
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
    }
        
    }
    
    
}
