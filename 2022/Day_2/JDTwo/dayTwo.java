import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class dayTwo {

    List<String> inputs = new ArrayList<>();
    HashMap<String, Integer> guide = new HashMap<String, Integer>();
    HashMap<String, Integer> newGuide = new HashMap<String, Integer>();

    public static void main(String[] args){

        dayTwo obj = new dayTwo();
        obj.startMap();
        obj.startMap2();
        
        try{
            try(BufferedReader br = new BufferedReader(new FileReader("Input2.txt"))) {

                String line;
                while((line = br.readLine()) != null){
                    obj.inputs.add(line.replaceAll("\\s", ""));
                }
                //System.out.println(obj.inputs);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        obj.calculate();
        obj.calculateTwo();
    }
    
    public void startMap(){
        guide.put("AX", 4);
        guide.put("AY", 8);
        guide.put("AZ", 3);
        guide.put("BX", 1);
        guide.put("BY", 5);
        guide.put("BZ", 9);
        guide.put("CX", 7);
        guide.put("CY", 2);
        guide.put("CZ", 6);

    }
    public void calculate(){
        int result = 0;
        for(int i = 0; i < inputs.size(); i++){
            String current = inputs.get(i);

            if(guide.containsKey(current)){
               int curValue = guide.get(current);
               result = result + curValue;
            }
        }
        System.out.println(result);
    }
    public void startMap2(){
        newGuide.put("AX", 3);
        newGuide.put("AY", 4);
        newGuide.put("AZ", 8);
        newGuide.put("BX", 1);
        newGuide.put("BY", 5);
        newGuide.put("BZ", 9);
        newGuide.put("CX", 2);
        newGuide.put("CY", 6);
        newGuide.put("CZ", 7);
    }
    public void calculateTwo(){
        int result = 0;
        for(int i = 0; i < inputs.size(); i++){
            String current = inputs.get(i);

            if(newGuide.containsKey(current)){
                int curValue = newGuide.get(current);
                result = result + curValue;
            }
        }
        System.out.println(result);
    }
}   


/*
 * A = Rock 1
 * B = Paper 2
 * C = Scissors 3 
 * 
 * Y = Draw = 3
 * X = Lose = 0
 * Z = Win = 6
 */