import java.util.*;
class H{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int k[][]=new int[3][3],m[]=new int[3],r[]=new int[3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                k[i][j]=sc.nextInt();
        String s=sc.next().toUpperCase();
        for(int i=0;i<3;i++) m[i]=s.charAt(i)-65;

        for(int i=0;i<3;i++){
            r[i]=0;
            for(int j=0;j<3;j++) r[i]+=k[i][j]*m[j];
            r[i]=(r[i]%26+26)%26;
        }

        for(int i=0;i<3;i++) System.out.print((char)(r[i]+65));
    }
}

/*
in : 1 2 3
     0 1 4
     5 6 0
     ACT

out: JAM
*/