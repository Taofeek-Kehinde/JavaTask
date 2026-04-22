public class ErrorFix {

public static void main(String[] args) {

int age = 100;

if (age >= 65)

System.out.println("Age is greater than or equal to 65");
else
System.out.println("Age is less than 65");


int x = 1, total = 0;

while (x <= 10) {
total = ++x;
System.out.println(x);
}

while (x <= 100)
total = ++x;
System.out.println(x);

//int y = 100;
//while (x <= 100)
//total += x;
//++x;
// while (y != 0)
//System.out.println(x);
}

}
