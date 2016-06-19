/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapsample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.*;


/**
 *
 * @author Kudesnik
 */
public class HashMapSample {

    
    interface Prt<T>
    {
        void print(T t);
    }
    /**
     * @param args the command line arguments
     */
    void proba(Consumer<String> o)
        {
            System.out.print(o.toString()+" ");
            System.err.println(o);
        }

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        HashMap myHashMap = new HashMap();
        
        myHashMap.put("Россия", "+7");
        myHashMap.put("Эстония", "+372");
        myHashMap.put("США", "+1");
        System.out.println(myHashMap);
        
        HashMap myHashMap2 = (HashMap)myHashMap.clone();
        System.out.println(myHashMap2);
        
        myHashMap2.clear();
        System.out.println(myHashMap2);
        
        System.out.println(myHashMap2.isEmpty());
        
        System.out.println(myHashMap.containsKey("Россия"));
        
        System.out.println(myHashMap.containsValue("+7"));
        
        Set<Map.Entry<String,String>> ms = myHashMap.entrySet();
        for (Map.Entry<String,String> entry : ms) {
            System.out.print(entry.getKey()+ " ");
            System.out.println(entry.getValue());
        }
        
        Set<String> ks = myHashMap.keySet();
        System.out.println("ks = "+ks);
        
        Collection<String> kv = myHashMap.values();
        System.out.println("kv ="+kv);
        
        System.out.println(myHashMap.get("Россия"));
        
        System.out.println(myHashMap.getOrDefault("Литва","код не найден"));
        
        myHashMap2.putAll(myHashMap);
        System.out.println(myHashMap2);
        
        myHashMap2.remove("Эстония");
        System.out.println(myHashMap2);
        
        myHashMap2.remove("Россия", "+7");
        System.out.println(myHashMap2);
        
        System.out.println(myHashMap.putIfAbsent("Литва", "+370"));
        System.out.println(myHashMap.putIfAbsent("Литва", "+377"));
        
        myHashMap.replace("Россия", "+0", "+7");
        System.out.println(myHashMap);
        myHashMap.replace("Россия", "+0");
        System.out.println(myHashMap);
        
        
        //compute??
       
        String str1 = "aa";
        String str2 = "sd";
        String str3 =str1.concat(str2);
        System.out.println(str3);
        String str4;
        //str4 = ()->"z".concat("3");


//      myHashMap.merge("Россия", "+00", (v1, v2)->v1.concat(v2));        
 //      myHashMap.merge("Россия", "+00", (v1, v2)->(String)v1.concat(v2));
//        myHashMap.merge("Россия", "+00", String::concat);
//        System.out.println(myHashMap);


//~~~~~~~~~~~~~~~~
//        Prt proba = 
        kv.forEach(System.out::print);
        kv.forEach(value -> {
            System.out.println("   2121 ");
            System.out.println(value);});
        
        
       // System.out.println();
        Consumer<Object> cons = System.out::println;
        Consumer<Object> cons2 = value -> System.err.println("  dsd "+value);
        cons.accept(kv);
        cons2.accept(kv);
//        proba(kv);


    }
    
}
