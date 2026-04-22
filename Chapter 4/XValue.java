public class XValue{
    public static void main(String[] args) {
        int x = 10; 
        System.out.println("x before: " + x);
        
        x += x++ - 5; 
        
        System.out.println("x after: " + x);
    }
}
