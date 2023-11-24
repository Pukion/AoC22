import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Java {
    
    public static List<String> inputs = new ArrayList<>();
    public static String currentString;
    public static int currentCal = 0;
    public static int previousCal = 0;
    public static int biggestCal = 0;
    public static int mediumCal = 0;
    public static int smallCal = 0;

    public static void main(String[] args) throws Exception{

        try{
            try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
                String line;
                while((line = br.readLine()) != null){
                    inputs.add(line);
                }
            }

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
            //Part Two 
            currentCal = 0;
            previousCal = 0;
            biggestCal = 0;

            for(int j = 0; j < inputs.size(); j++){
                currentString = inputs.get(j);
                if(!currentString.isEmpty()){
                    currentCal = Integer.valueOf(currentString);
                    previousCal = previousCal + currentCal;
                }
                else{
                    if(biggestCal < previousCal || mediumCal < previousCal || smallCal < previousCal){
                        if(biggestCal < mediumCal){
                            if(biggestCal < smallCal){
                                biggestCal = previousCal;
                                previousCal = 0;
                            }
                            else{
                                smallCal = previousCal;
                                previousCal = 0;
                            }
                        }
                        else if(mediumCal < smallCal){
                            mediumCal = previousCal;
                            previousCal = 0;
                        }
                        else{
                            smallCal = previousCal;
                            previousCal = 0;
                        }
                    }
                    previousCal = 0;
                }
            }
            int result = biggestCal + mediumCal + smallCal;
            System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
