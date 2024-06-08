import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ad=sc.nextLine();
        int n=ad.length();
        if(n==12||n==14){
            int c=0;
            for(int i=0;i<n;i++){
                char ch=ad.charAt(i);
                if((ch>='0'&& ch<='9') && (n==12||n==14 && i!=4 || i!=9)){
                    c++;
                }
                else if(n==14 && (i==4 && ch==' ')||(i==9 && ch==' ')){
                    c++;
                }
            }
            if(c==n){
                System.out.println("valid Adhaar");
            }
            else{
                System.out.println("Invalid Adhaar");
            }
        }
        else{
            System.out.println("Invalid Adhaar");
        }
    }
}