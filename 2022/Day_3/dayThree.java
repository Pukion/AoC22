import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class dayThree{

    List<String> inputs = new ArrayList<>();
    String guideStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args){

        dayThree obj = new dayThree();

        try{
            try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
                String line;
                while((line = br.readLine()) != null){
                    obj.inputs.add(line);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }
    public void func(ArrayList<String> input){
        String current = "", A = "", B = "";
        int num;
        for(int i = 0; i < input.size(); i++){
            current = input.get(i);
            num = (current.length() - 1) / 2;
            A = current.substring(0, num);
            B = current.substring(num + 1);
        }
        System.out.println(current);
        System.out.println(A);
        System.out.println(B);
    }
}