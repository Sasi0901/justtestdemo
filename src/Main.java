// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String first = sc.next();
//        System.out.println("Enter Second String");
//        String second =sc.next();
//        System.out.println("The length of the first string is "+first.length());
//        System.out.println("The length of the second string is "+second.length());
//        if(first.length()==second.length()) {
//            System.out.println("The length of the two strings are the same");
//        }
//        else{
//            System.out.println("The length of the two strings is not the same");
//        }
//
//        if(first.equals(second)){
//            System.out.println("Two strings are equal");
//        }
//        else {
//            System.out.println("Two strings are not equal");
//        }
        //=============================================================================================
//        ArrayList<String> list = new ArrayList<String>();
//        HashSet<String> hashSet = new HashSet<String>();
//        HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
//
//        for(int i=0;i<5;i++){
//            String st =sc.next();
//            list.add(st);
//            hashSet.add(st);
////            if(hashmap.containsKey(st)){
////                Integer te=hashmap.get(st);
////                hashmap.replace(st,te+1);
////            }
////            else{
////                hashmap.put(st,1);
////            }
//            hashmap.put(st,hashmap.getOrDefault(st,0)+1);
//        }
//        System.out.println("List Contains: ");
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println("set Contains: ");
//        Iterator<String> its = hashSet.iterator();
//        while(its.hasNext()){
//            System.out.println(its.next());
//        }
//        System.out.println("Frequency of the words: ");
//        for(String key: hashmap.keySet()){
//            System.out.println("Word = "+key+",Frequency = "+hashmap.get(key));
//        }
        try {
            File file = new File("C://Users//DELL//IdeaProjects//Intellijproject//src//test.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String st2="";
            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
            while((st2= br.readLine())!=null){
                String []arr=st2.trim().split(",");
                for(String st3: arr){
                    hashMap.put(st3,hashMap.getOrDefault(st3,0)+1);
                }
            }
            ArrayList<Map.Entry<String,Integer>> arr = new ArrayList<>(hashMap.entrySet());
            arr.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
            System.out.println("Top 3 Repeated Words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : arr) {
                if (count < 3) {
                    System.out.println(entry.getKey());
                    count++;
                } else {
                    break;
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}