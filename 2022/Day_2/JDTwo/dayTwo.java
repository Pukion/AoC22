import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class dayTwo {

    public static void main(String[] args){

        dayTwo obj = new dayTwo();

        try{
            try(BufferedReader br = new BufferedReader(new FileReader("input2.txt"))) {
                List<String> inputs = new ArrayList<>();

                String line;
                while((line = br.readLine()) != null){
                    line.replaceAll("\\s+", "");
                    inputs.add(line);
                }
                System.out.println(inputs);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
