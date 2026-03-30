import java.util.*;
class S{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String x="abcdefghijklmnopqrstuvwxyz ",y="zyxwvutsrqponmlkjihgfedcba ";
        String e="",d="";
        for(char c:s.toCharArray()) e+=x.indexOf(c)!=-1?y.charAt(x.indexOf(c)):c;
        for(char c:e.toCharArray()) d+=y.indexOf(c)!=-1?x.charAt(y.indexOf(c)):c;
        System.out.println(e);
        System.out.println(d);
    }
}

/*
in : aceho

out: zxvsl
     aceho
*/