package hashmapsInJava;

import java.util.HashMap;

public class hashmap_basic {
    public static void main (String[] args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"divyansh");
        hashMap.put(2,"priyanshu");
        hashMap.put(3,"vishal");


        System.out.println("Hashmap elements: "+ hashMap);
        System.out.println("size of the hashmap is : "+hashMap.size());

        if(hashMap.containsValue("divyansh")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
}
