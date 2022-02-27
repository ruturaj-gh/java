import java.util.ArrayList;
import java.util.Scanner;

public class assignments7 {
public static void main(String[] args) {
ArrayList<Integer> T=new ArrayList<>();
System.out.println("enter the size of the array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter the elements");
for (int i=0;i<n;i++){
T.add(sc.nextInt());
}
while(true){
System.out.println("enter the operation\n 1.iseven\n2.isodd\n3.is palindrome\n");
int op=sc.nextInt();
if(op==1){
System.out.println(iseven(T));
}
else if(op==2){
System.out.println(isodd(T));
}
else if(op==3){
palindrome(T,T.size());
}
}
}

static boolean iseven(ArrayList<Integer> t){
int k=0;
for(int i=0;i<t.size();i++){
if(t.get(i)%2==0){
k++;
}
}
return k==t.size();

}
static boolean isodd(ArrayList<Integer> t){
int k=0;
for(int i=0;i<t.size();i++){
if(t.get(i)%2==1){
k++;
}
}
return k==t.size();
}
static void palindrome(ArrayList<Integer> t, int n)
{
int flag = 0;

for (int i = 0; i <= n / 2 && n != 0; i++) {

if (t.get(i) != t.get(n-i-1)) {
flag = 1;
break;
}
}
if (flag == 1)
System.out.println("not palindrome");
else
System.out.println("palindrome");
}
}