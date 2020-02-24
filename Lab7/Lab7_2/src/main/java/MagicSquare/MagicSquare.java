/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicSquare;

public class MagicSquare {
    private String[][] board;
    private int row;
    private int colum;
public MagicSquare(int n){
    row = n;
    colum = n;
    board = new String[row][colum];
        for (int ii = 0; ii < row; ii++)
        for (int jj = 0; jj < colum; jj++)
            board[ii][jj] = "";
    int i=0;
    int j=0;
    for (int num = 1; num<= row*colum ;num++){
        if (num ==1){i=row-1;j=colum/2;board[i][j]=num+"";}
        else if ((i<row-1 && j<colum-1) && i>0 && j>=0 && !"".equals(board[i+1][j+1])){board[i-1][j] = num+"";i--;}
        else if (i==row-1 && j==colum-1){board[i-1][j] = num+"";i--;}
        else if (i+1 == row){i=0;board[i][j+1]=num+"";j++;}
        else if (j+1 == colum){j=0;board[i+1][j]=num+"";i++;}
        else{board[i+1][j+1]=num+"";i++;j++;}
    }
            
        
        
    
        
    

}
public String toString(){
    String r = "";
    for (int i = 0; i < row; i++){
            for (int j = 0; j < colum; j++)
            {r = r + "\t" +board[i][j];}
            r = r + "\n";
}
return r;
}
}

