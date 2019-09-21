import java.util.ArrayList;

public class queue{
    public ArrayList<String> queue = new ArrayList<String>();
    public void add(String input){
        queue.add(0, input);
    }
    public String[] getAll(){
        String[] res = new String[queue.size()];
        for(int i=0;i<queue.size();i++){
            res[i] = queue.get(i);
        }
        return res;
    }
    public void delete(String content){
        for(int i = 0; i < queue.size();i++){
            if(queue.get(i).intern()==content){
                queue.remove(i);
            }
        }
    }
    public int getSize(){
        return queue.size();
    }
}
