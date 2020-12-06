package algorithm.migong;

public class MiGong {

    private static int[][] arrays = new int[8][8];

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            arrays[0][i] = 1;
            arrays[7][i] = 1;
            arrays[i][0] = 1;
            arrays[i][7] = 1;
        }

        arrays[3][1] = 1;
        arrays[3][2] = 1;
//        printArray(arrays);
        setWay(arrays,1,1);
        printArray(arrays);


    }


    private static void printArray(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                System.out.print(arrays[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean setWay(int[][] arrays,int i,int j){
        if (arrays[6][6]==2){
            return true;
        }else {
            if (arrays[i][j]==0){
                arrays[i][j]=2;
                if (setWay(arrays,i+1,j)){
                    return true;
                }else if(setWay(arrays,i,j+1)){
                    return true;
                }else if(setWay(arrays,i-1,j)){
                    return true;
                }else if(setWay(arrays,i,j-1)){
                    return true;
                }else{
                    arrays[i][j]=3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }

}
