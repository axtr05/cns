import java.util.*;
class C{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String e="",d="";
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                char b=Character.isUpperCase(c)?'A':'a';
                e+=(char)((c-b+k)%26+b);
            } 
            else e+=c;
        }
        for(char c:e.toCharArray()){
            if(Character.isLetter(c)){
                char b=Character.isUpperCase(c)?'A':'a';
                d+=(char)((c-b-k+26)%26+b);
            } 
            else d+=c;
        }
        System.out.println(e);
        System.out.println(d);
    }
}

/*
in : HelloWorld
     5
     
out: MjqqtBtwqi
     HelloWorld
*/