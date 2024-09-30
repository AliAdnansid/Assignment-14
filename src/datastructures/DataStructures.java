/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructures;

import java.util.*;

/**
 *
 * @author Ali
 */
public class DataStructures {

    public static void arrayListStructure(){
        //Intialization and Declaration of ArrayList
        //Type Safe
        ArrayList<Integer> list = new ArrayList();
        
        //Insertion In ArrayList
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        
        //Modify Existing Elements
        list.set(0, -1);  //Here we added -1 at the place of 1 at index 0
        
        //Traverse in ArrayList
        list.forEach((i)->{
            System.out.println("Elemet in ArrayList : "+i);
        });
        
        //Delete an element from list
        list.remove(0);
        //Printing After Remove -1
        list.forEach((i)->{
            System.out.println("Elemet in ArrayList After deletion of an element : "+i);
        });
    }
    
    public static void linkedListStructure(){
        //Intialization and Declearation of LinkedList
        //Type Safe (String)
        LinkedList <String> fruits = new LinkedList();
        
        //Insertion In LinkedList
        fruits.add("Apples");
        fruits.add("Grapes");
        fruits.add("Bananas");
        fruits.add("Apricot");
        fruits.add("Blueberry");
        
        //Modifing existing values like Apples into Oranges
        fruits.set(0, "Oranges");
        
        //Printing Elements by Traversing LinkedList
//        fruits.forEach((i)->{
//            System.out.println("Fruit In LinkedList : "+ i);
//        });
        
        Iterator it = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        //Deletion in LinkedList
        fruits.remove(0);//Removing Oranges From the list
        
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Elements After Deletion : "+fruits.get(i));
        }
        
    }
    
    public static void hashSetStructure(){
            //Intialization and Declaration of HashSet
        HashSet<String> countries = new HashSet();
        
        //Insertion in HashSet
        countries.add("Pakistan");
        countries.add("India");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("Pakistan"); //Adding duplicate value to check Property od SET(DISTINCT VALUES)
        
        //Traversing
        countries.forEach((a)->{
            System.out.println("Country List : " + a); //Pakistan will be print only once due to distinct property of set
        });
        
        //Modifying 
        countries.remove("India");   //Deletion then adding updated element
        countries.add("Palestine");
        countries.forEach((a)->{
            System.out.println("Country List After Deletion : " + a); //Pakistan will be print only once due to distinct property of set
        });
    }
    
    public static void treeSetStructure(){
        //Initailiazation and Declearation
        TreeSet<String> ts = new TreeSet();
        
        //Insertion in Set
        //It stores data in an asscending order 
        ts.add("Ali");
        ts.add("Ahmed");
        ts.add("Zeeshan");
        ts.add("Bob");
        ts.add("Kashif");
        
        System.out.println("Element : "+ ts);
        
        //Modifing Data
        ts.remove("Bob");       //Deletion
        ts.add("Baby");
        
        System.out.println("Element : "+ ts);
        
        //Traversing
        ts.forEach((i)->{
            System.out.println("Element through traverse : " + i);
        });
    }
    
    public static void hashMapStructure(){
         //Intialiazation and Declearation of Hashmap
        HashMap<String,Integer> marks = new HashMap<>();
        //Insertion
        marks.put("Ali", 10);
        marks.put("Asad", 90);
        marks.put("Zubair", 60);
        marks.put("Jawad", 80);
        marks.put("Yusra", 100); //Not a specific order it allows null keys and values
        
        System.out.println(marks);
        
        marks.replace("Ali", 10, 100);
        
        System.out.println(marks); //Modifing Data
        
        marks.remove("Zubair", 60);
        
        System.out.println("After Deletion : "+marks);
        
        //Traverse
        marks.forEach((i,a)->{
            System.out.println(i+"  "+a);
        });
        
    }
    
    public static void hashTableStructure(){
        //Intialization And Declearation
        Hashtable<String,String> grading = new Hashtable();
        
        //Insertion
        grading.put("Ali Adnan", "A+");
        grading.put("Sania Imam", "A");
        grading.put("Talha Ayaz", "A-");
        grading.put("UmeYusra Khan", "A");
        grading.put("Tahira Rehmat", "A+");
        grading.put("Ch Farukh", "B+");
        
        //Print All
        System.out.println(grading);
        
        //Modifing Existing Data
        grading.remove("Talha Ayaz"); //Removing old data
        grading.put("Talha Ayaz", "A+"); //Updating grade of talha
        
        //Traversing
        Enumeration<String> elements = grading.elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
    
    public static void treeMapStructure(){
        
        //Intialization and Declearation
        TreeMap<String, Integer> tm  = new TreeMap<>();
        //Insertion In Treemap
        tm.put("Pakistan", 100);
        tm.put("India", 90);
        tm.put("Bangladesh", 98);
        tm.put("Nepal", 75);          //Stores data in Asscending Order
        tm.put("Afganistan", 60);
        tm.put("Zimbawea", 86);
        
        //Print All Elements
        System.out.println(tm);
        
        //Traversing
        tm.forEach((a,i)->{
            System.out.println("Key : "+ a + " Value : "+ i);
        });
    } 
    
    public static void stackStructure(){
        
        //Intialization and Declearation
        Stack<Integer> s = new Stack();
        
        //Insertion
        for (int i = 0; i < 10; i++) {
            s.push(i+12+9/7*i);
        }
        //Print All
        System.out.println(s);
        
        //Pop for removing peek element
        //PEEK TO SEE UPER ELEMENT
        
        System.out.println("Peek : " + s.peek());
        s.pop();
        System.out.println("Peek After Pop : " + s.peek());
        
        Iterator<Integer> it= s.iterator();
        int a=1;
        while(it.hasNext()){
            
            System.out.println("ELEMENT NO."+ a++ +" "+ it.next());
            //a++;
        }
    }
    
    public static void queueStructure(){
        
        //Intaiiazation And Declearation
        //Uisng LinkedList to implement queue because queue is an interface
        Queue<String> people = new LinkedList<>();
        //Insertion in Quene
        people.add("Ali");
        people.add("Adnan");
        people.add("Kashif");
        people.add("Khan");
        //Print All Elements
        System.out.println(people);
        //Modifing data
        System.out.println(people.element()); //First In First Out Logic
        people.poll();//Removes head
        System.out.println(people.element()); //First In First Out Logic
        //Traversing
        Iterator<String> iterator = people.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
    
    public static void vectorStructure(){
        Vector<Integer> v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        
        //modification of existing data
        v.add(1, 5); //puting 5 at 1 index mean 2nd position
        
        //Printing All
        System.out.println(v);
        
        v.remove(1);
        v.forEach((i)->{
            System.out.println("ELEENT : "+ i);
        });
    }
    
    public static void priorityQueueStructure(){
        // Creating a priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Ali");
        pq.add("Jamshed");
        pq.add("Zubair");
        System.out.println("PriorityQueue: " + pq);

        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
        
        System.out.println("Poll Method : "+pq.poll());
        System.out.println("PriorityQueue: " + pq);
        
        //Traversing
        pq.forEach((i)->{
            System.out.println(i);
        });
    }
    
    public static void setStructure(){
        // Creating an object of Set class 
        // Declaring object of Integer type 
        Set<Integer> a = new HashSet<Integer>();
      
        // Adding all elements to List 
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
      
      // Again declaring object of Set class
      // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();
        
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        
        // Traversing
        b.forEach((i)->{
            System.out.println(i);
        });
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        arrayListStructure();
//        linkedListStructure();
//        hashSetStructure();
//        treeSetStructure();
//        hashMapStructure();
//        hashTableStructure();
//        treeMapStructure();
//        stackStructure();
//        queueStructure();
//        priorityQueueStructure();
//        setStructure();

//        Complete Assignment 14 :)
        
    }
    
}
