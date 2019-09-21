public class matrix{
    int Row;
    int Colomn;
    double[][] matrix;
    public matrix(int r, int c){
        matrix = new double[r][c];
    }
    public int getRow(){
        return Row;
    }
    public int getColomn(){
        return Colomn;
    }
    public void put(double content, int r, int c){
        matrix[r][c] = content;
    }
    public double get(int r, int c){
        return matrix[r][c]; 
    }
    public matrix multiplyTwoMatrix(matrix m2){
        double[][] res = new double[Row][Colomn];
        if(Row != m2.getRow() || Colomn != m2.getColomn()){
            throw new IllegalArgumentException("not same matrix size");
        }
        else{
            for (int i = 0; i < Row; i++){
                for(int g = 0; g<Colomn; g++){
                    res[i][g] = matrix[i][g] * m2.get(i,g);
                }
            }
        }
        return res;
    }
    public matrix addTwoMatrix(matrix m2){
        double[][] res = new double[Row][Colomn];
        if(Row != m2.getRow() || Colomn != m2.getColomn()){
            throw new IllegalArgumentException("not same matrix size");
        }
        else{
            for (int i = 0; i < Row; i++){
                for(int g = 0; g<Colomn; g++){
                    res[i][g] = matrix[i][g] + m2.get(i,g);
                }
            }
        }
        return res;
    }
    public matrix subtractTwoMatrix(matrix m2){
        double[][] res = new double[Row][Colomn];
        if(Row != m2.getRow() || Colomn != m2.getColomn()){
            throw new IllegalArgumentException("not same matrix size");
        }
        else{
            for (int i = 0; i < Row; i++){
                for(int g = 0; g<Colomn; g++){
                    res[i][g] = matrix[i][g] - m2.get(i,g);
                }
            }
        }
        return res;
    }
    public void absVal(){
        for(int i = 0; i < Row; i++){
            for(int g = 0; g < Colomn; g++){
                 matrix[i][g] = Math.abs(matrix[i][g]);
            }
        }
    }

}