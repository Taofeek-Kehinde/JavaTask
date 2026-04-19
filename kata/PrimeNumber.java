public class Main {


public static boolean primeNumbers (int Number)  {

if(Number <=1) {

 return false;
}

for (int count = 2; count < Number; count++){


 if(Number % count == 0) {

    return false;

 }

  }
 return true;

}
public static void main(String[] args) {


 System.out.println(primeNumbers(2));
 System.out.println(primeNumbers(3));
 System.out.println(primeNumbers(5));
 System.out.println(primeNumbers(8));
 System.out.println(primeNumbers(11));

}
}
