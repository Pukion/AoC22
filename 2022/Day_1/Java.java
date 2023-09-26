import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Java {
    
    public static void main(String[] args) throws Exception{

        try{
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            List<String> inputs = new ArrayList<>();

            String line;
            while((line = br.readLine()) != null){
                inputs.add(line);
            }
            String currentString;
            int biggestCal = 0;
            int currentCal = 0;
            int previousCal = 0;
            for(int i = 0; i < inputs.size(); i++){
                currentString = inputs.get(i);
                if(!currentString.isEmpty()){
                    currentCal = Integer.valueOf(currentString);
                    previousCal = previousCal + currentCal;
                }
                else{
                    if(biggestCal < previousCal){
                        biggestCal = previousCal;
                        previousCal = 0;
                    }
                    else{
                        previousCal = 0;
                    }
                }   
            }
        System.out.println(biggestCal);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
