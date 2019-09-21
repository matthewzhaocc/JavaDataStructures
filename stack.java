import java.util.ArrayList;

public class stack{
    ArrayList<String> stack = new ArrayList<String>();
    public void add(String content){
        stack.add(content);
    }
    public String get(){
        String res = stack.get(stack.size());
        stack.remove(stack.size());
        return res;
    }
    public String[] getAll(){
        String[] res = new String[stack.size()];
        for(int i = 0; i<stack.size(); i++){
            res[i] = stack.get(i);
        }
        return res;
    }
    public int getSize(){
        return stack.size();
    }
}