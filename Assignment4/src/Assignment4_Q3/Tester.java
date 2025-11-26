package Assignment4_Q3;


import java.util.*;

public class Tester {
    public static void main(String[] args) {
        String str="Hello i am Vighnesh , i like to play Cricket";
        String arr[]=str.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
        	map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(Map.Entry<String,Integer>st:map.entrySet())
        {
        	System.out.println(st.getKey()+":"+st.getValue());
        }
    }
}

