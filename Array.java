public class Array {

public static void main(String[] args) {


 char[][] chars = new char[3][3];

    chars[0][0] = 'X';
    chars[0][1] = 'O';
    chars[0][2] = 'X';
    chars[1][0] = 'O';
    chars[1][1] = '0';
    chars[1][2] = 'O';
    chars[2][0] = 'X';
    chars[2][1] = 'X';
    chars[2][2] = 'O';

 for (int number = 0; number < 3; number++) {
  
   for(int secondNumber = 0; secondNumber < 3; secondNumber++) {
    System.out.print(chars[number][secondNumber] + " ");


}
    System.out.println();

}
   

}


}
