import java.util.Arrays;

class Array{
    public static void main(String args[]){
        int a[]=new int[5];
        String s[]={"Sai","kondal","arun","sandeep","anvesh","Saichai","anil","padeep","sravan","pavan"};
        String b[]=new String[10];
        int a2[]=new int[5];
        int z[]={2,4,1,5,0,7};
        Arrays.sort(z);
        for(int g:z)
        {
            System.out.println(g+" ");
        }
        System.out.println(z);
        Arrays.fill(a2, 10);

        for(int x:a2)
        {
            System.out.println(x+" ");
        }
        



        System.arraycopy(s,0,b,0,10);
    }
}