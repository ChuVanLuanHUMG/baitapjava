import java.util.LinkedList;
public class App38 {
     public static void main (String[] args) {
         LinkedList<String> list = new LinkedList<String>();
         list.add("java");
         list.add("C++");
         list.add("PHP");
         list.add("C#");
         System.out.println(" ví dụ sử dụng phương thức addAll()");
         System.out.println(" ví dụ sử dụng phương thức addALL");
         LinkedList<String> listA = new LinkedList<String>();
         listA.addAll(list);
         System.out.print("listA");
         showList (listA);
         System.out.println("\n ví dụ sử dụng thương thức reaiAll()");
         System.out.println("\n ví dụ sử dụng thương thức reaiAll()");
         LinkedList<String> list8 = new LinkedList<String>();
         list8.add("java");
         listA.retainAll(list8);
         System.out.print("listA");
         showList (listA );
         System.out.println("\n ví dụ sử dụng thương thức removeAll()");
         System.out.println("\n ví dụ sử dụng thương thức removeAll()");
         list.removeAll(list8);
         System.out.print("list");
         showList (list);  
     }
     public static void showList(LinkedList<String> list) {
         for (String obj: list){
             System.out.print("\t" +obj + " , ");

         }
         System.out.println();
     }
}
