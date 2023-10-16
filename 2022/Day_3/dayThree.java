import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class dayThree{

    List<String> inputs = new ArrayList<>();
    String guideStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int result = 0;

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
        obj.func(obj.inputs);    
        System.out.println(obj.result);   
    }
    public void func(List<String> input){
        String current = "", A = "", B = "";
        int num;
        for(int i = 0; i < input.size(); i++){
            current = input.get(i);
            num = (current.length() - 1) / 2;
            A = current.substring(0, num + 1);
            B = current.substring(num + 1);
            compare(A, B);
        }
         System.out.println(current);
         System.out.println(A);
         System.out.println(B);
    }
    public void compare(String a, String b){
        char first, second, next = ' ';
        for(int i = 0; i < a.length(); i++){
            first = a.charAt(i);
            for(int j = 0; j < b.length(); j++){
                second = b.charAt(j);
                if(first == second){
                    next = first;
                }
            }
        }
        value(next);
    }
    public void value(char ch){
        for(int i = 0; i < guideStr.length(); i++){
            if(ch == guideStr.charAt(i)){
                result = result + (i + 1);
            }
        }
    }
}