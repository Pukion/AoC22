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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void printout(ArrayList<String> x){
        System.out.println(x);
    }
}
