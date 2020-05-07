package com.compute.demo.dataStructure.array;

public class spareArray {
    public static void main(String[] args) {
        //创建二维数组
        int chessArr[][]=new int[11][11];
        chessArr[1][2]=1;
        chessArr[2][3]=2;
        for (int[] row:chessArr) {
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        int sum=0;
        for (int[] row:chessArr) {
            for(int data:row){
                if(data!=0)
                    sum++;
            }

        }
        int sparseArr[][]=new  int[sum+1][3];
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
//                if()
            }
        }


    }
}
