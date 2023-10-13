import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class dayTwo {

    List<String> inputs = new ArrayList<>();
    HashMap<String, Integer> guide = new HashMap<String, Integer>();

    public static void main(String[] args){

        dayTwo obj = new dayTwo();
        obj.startMap();
        
        try{
            try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

                String line;
                while((line = br.readLine()) != null){
                    obj.inputs.add(line.replaceAll("\\s", ""));
                }
                System.out.println(obj.inputs);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
        for(int i = 0; i < inputs.size(); i++){

        }
    }
}   
