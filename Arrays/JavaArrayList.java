import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(59);
        arr.add(4);
        System.out.println(arr);
        // arr.set(0,78);
        // System.out.print("Array list: " + Arrays.toString(arr.toArray()));
        // System.out.print(arr.get(2));
        // System.out.println("\n"+arr.contains(590));
        // System.out.print("just some check: "+arr);
        // ArrayList<Integer> clone = (ArrayList<Integer>)arr.clone();
        // System.out.print("this is clone: "+clone);
        // System.out.print("Index:  "+clone.indexOf(59));
        // System.out.print("check empty: "+arr.isEmpty());
        // ArrayList myArray = new ArrayList(2);
        // myArray.add("i");
        // myArray.add(78);
        // myArray.add("@");
        // System.out.println("\nmyArray: "+myArray);
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add(0,"A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        // Traverse method one
        // for(int i=0; i<stringList.size(); i++){
        //     System.out.println(stringList.get(i));
        // }
        // Traverse method two | for each loop

        // for(String letter : stringList){
        //     System.out.println(letter);
        // }

        // Traverse method three | Iterator interface

        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){
            String letter = iterator.next();
            System.out.println(letter);
        }

        // serching

        for(String letter : stringList){
            if(letter.equals("C")){
                System.out.println("element found!");
                break;
            }
        }
    }
}
