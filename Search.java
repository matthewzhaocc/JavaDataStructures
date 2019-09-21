public class Search{
    public int binarySearch(int[] input, int LookingFor){
        int index = input.length/2;
        while(true){
            if(input[index] == LookingFor){
                break;
            }
            if(input[index] > LookingFor){
                index /=2;
            }
            if(input[index] < LookingFor){
                index *=1.5;
            }
        }
        return index;
    }
    public int linearSearch(int[] input, int LookingFor){
        for(int i = 0; i < input.length; i++){
            if(input[i] == LookingFor){
                return i;
            }
        }
        return -1;
    }
}