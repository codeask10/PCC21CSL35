//----------------------- Constructor Overloading -----------------------------
//Program 5B
        //File Name should be Demo.java
        
public class Demo {
    int l, b;
    Demo(){
        l=10; b=20;
    }
    Demo(int u, int v){
        l=u; b=v;
    }
    int area (){
        return l*b;
    }
    public static void main(String args[]){
        Demo a1=new Demo();
        int r1=a1.area();
        System.out.println("The area is: "+r1);
        Demo a2=new Demo(30,40);int r2=a2.area();
        System.out.println("The area is: "+r2);
    }
}