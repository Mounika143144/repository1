public class ReverseNumberExample1   
{  
public static void main(String[] args)   
{  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);
//changes made by Mounika in feature1 branch 
 public static void reverseNumber(int number)   
{  
if (number < 10)   
{  
//prints the same number if the number is less than 10  
System.out.println(number);  
return;  
}  
else   
{    
reverseNumber(number/10);  
}  
}  
} 
}
