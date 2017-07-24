import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int gcd=1;
for(int i=1;i<=81 && i<=153;++i)
{
if(81%i==0 && 153%i==0)
{
gcd=i;
}
}
System.out.println(gcd);
}
}

