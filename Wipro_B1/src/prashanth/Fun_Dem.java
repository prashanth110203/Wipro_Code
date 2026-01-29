package prashanth;
 
@FunctionalInterface   //Annotation
interface validator
{
boolean validator(String input);
}
 
public class Fun_Dem
{
public static void main(String[] args)
{
validator emailCheck=email->email.contains("@");
 
System.out.println(emailCheck.validator("test@gmail.com"));
}
 
}
