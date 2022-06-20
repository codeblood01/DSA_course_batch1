import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
            int arr[]= new int[];
    }

    public static char[][] patternCreator(){
        char result[][] = new char[4][5];
        for (int i = 0; i < 4; i++) {
            if(i==0){
                result[i][0]='*';
                break;
            }
            for (int j = 0; j < i+1; j++) {
                if(j==0||j==i+1||i==4){
                    result[i][j]='*';
                }else{
                    result[i][j]='^';
                }
            }
        }
        return result;
    }

}
