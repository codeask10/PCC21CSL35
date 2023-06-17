//File Name should be ArrayListP.java

import java.util.*;
public class ArrayListP {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<String>();
        /* Append - add at end */
        obj.add("Arun");
        obj.add("Balaji");
        obj.add("Chandru");
        obj.add("David");
        obj.add("Elango");
    
        System.out.println("\n"+"Elements in ArrayList:");
        System.out.print("\t"+obj+" "+"\n" + "\n");

        /* Insert - add at particular index */
        obj.add(0, "Arujun");
        obj.add(1, "Barath");System.out.println("After Inserting Elements:"+"");
        System.out.print("\t"+obj+" "+"\n" + "\n");

        /* Searching Elements in ArrayList */
        System.out.println("Search For Element:");
        Scanner in = new Scanner(System.in);
        String searchStr=in.nextLine();
        boolean ans = obj.contains(searchStr);
        if (ans)
            System.out.println("\t"+"ArrayList contains " +searchStr+ "\n");
        else
            System.out.println("ArrayList does not contains "+searchStr);
            
        /* List all string starts with given letter in ArrayList */
        System.out.println("Arraylist get the strings starting with given letter:");
        ArrayList<String> obj1 = new ArrayList<String>();
        String start= in.next();
        for(int i=0;i<obj.size();i++){
            if(obj.get(i).startsWith(start.toUpperCase())){
                obj1.add(obj.get(i));
            }
        }
        System.out.print("\t"+obj1+" "+"\n" + "\n");
    }
}