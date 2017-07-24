import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int hcf=1;
int p=m*n;
for(int i=2;i<p;i++)
{
if(m%i==0 && n%i==0)
{
hcf=i;
}
}
System.out.println(hcf);
}
}
