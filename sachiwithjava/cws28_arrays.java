public class cws28_arrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int [] []flats;
        flats =new int[2] [3];
        flats [0] [0] = 101;
        flats [0] [1] = 102;
        flats [0] [2] = 103;
        flats [1] [0] = 101;
        flats [1] [1] = 102;
        flats [1] [2] = 103;
        for(int i=0; i<flats.length; i++){
            for(int j=0;j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        

    }
}
