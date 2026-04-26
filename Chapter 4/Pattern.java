public class Pattern {
    public static void main(String[] args) {
        int starsPerRow = 12;  
        int totalRows = 12;  
        
        for (int row = 0; row < totalRows; row++) {
            if (row % 2 != 0) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < starsPerRow; col++) {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
    }
}
