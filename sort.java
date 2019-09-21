public class sort{
    public int[] bubbleSort(int[] input){
        boolean realStatus = false;
        while(!realStatus){
            boolean status = true;
            for(int i = 0; i < input.length; i++){
                if(i != input.length-1 && !(input[i]<=input[i+1]) ){
                    status = false;
                }
            }
            realStatus = status;   
            for(int g = 0; g < input.length; g++){
                if(g != input.length - 1&& input[g] > input[g+1])
                {
                    int cache = input[g];
                    input[g] = input[g+1];
                    input[g+1] = cache;
                }
            } 
        }
        return input;
    }
}