public class compare {

public static void main(String[] args) {

 Question2
Explain what happens when a Java program attempts to divide one integer by another.
What happens to the fractional part of the calculation? How can you avoid that outcome?Explain what happens when a Java program attempts to divide one integer by another.

What happens to the fractional part of the calculation? How can you avoid that outcome?


when an interger deivide one another it get to throw away integer division to keep the frcational part we use dataype like double or float

int num1 = 5;
int num2 = 10;

System.out.println(num1 \ num2)

Question3
Describe the two ways in which control statements can be combined.

1. Using Nesting
print one control statement isnide another

int num = 0;
while (num < 10)
if(num %2 ==0) {
 System.out.println(num + "is even");
}


}

}

