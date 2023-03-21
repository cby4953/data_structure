package com.atby;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

//模拟稀疏数组
public class SparseArray {
    public static void main(String[] args) {
        //稀疏数组
        int chess[][]=new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;
        chess[4][5] = 1;

        for (int row[] : chess){
            for(int i : row){
                System.out.print(i+"\t");
            }
            System.out.println();
        }

        int sum=0;
        int array[]=new int[121];
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if(chess[i][j] != 0){
                    array[sum*3]=i;
                    array[sum*3+1]=j;
                    array[sum*3+2]=chess[i][j];
                  sum++;
                }
            }
        }
        System.out.println("棋盘上棋子数量:"+sum);
        for (int i:array){
            System.out.print(i+"\t");
        }
        System.out.println("--------");
        int sparseArray[][]=new int[sum+1][3];
        System.out.println("sparseArray:");
        sparseArray[0][0]=11;
        sparseArray[0][1]=11;
        sparseArray[0][2]=sum;
        for (int i=1;i<sum+1;i++){
            for (int j=0;j<3;j++){
                sparseArray[i][j]=array[i*3+j-3];
            }
        }

        for(int i=0;i<sum+1;i++){
            for(int j=0;j<3;j++){
                System.out.print(sparseArray[i][j]+"\t");
            }
            System.out.println();
        }


        //文件写入;
        String str3="";
        FileOutputStream fileOutputStream=null;
        //将稀疏数组存入文件中
        for (int i=0;i<sum+1;i++){
            for(int j=0;j<3;j++){
                if(i*j==sum*2){
                    str3=str3+sparseArray[i][j];
                }else {
                    str3=str3+sparseArray[i][j]+",";
                }
            }
        }
        System.out.println("稀疏数组转为字符串");
        System.out.println(str3);
        String str="D:\\sparsearray.txt";
        try {
            fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(str3.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //文件读取
        String filePath="D:\\sparsearray.txt";
        FileInputStream fileInputStream=null;
        int readData=0;
        int[][] sparseArray01=null;//用二维数组接收文件内容
        try {
            fileInputStream = new FileInputStream(filePath);
            //定义一个字符串接收读取内容
            String str4="";
            while ((readData=fileInputStream.read()) != -1){
                Character a=(char)readData;
                String s = a.toString();
                str4=str4+s;
            }
            System.out.println("从文件读取到的内容");
            System.out.println(str4);
            String[] split_string = str4.split(",");
            int[] split_int=new int[split_string.length];
            for(int i=0;i<split_string.length;i++){
                split_int[i]=Integer.parseInt(split_string[i]);
            }
            System.out.println("将字符串转成数组");
            System.out.println(split_int.length);

            System.out.println("转成稀疏数组");
            sparseArray01 = new int[sum + 1][3];
            sparseArray01[0][0]=split_int[0];
            for (int i=1;i<split_int.length;i++){
                sparseArray01[i/3][i%3]=split_int[i];
            }

            for(int i=0;i<sum+1;i++){
                for(int j=0;j<3;j++){
                    System.out.print(sparseArray01[i][j]+"\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //稀疏数组还原棋盘
        int[][] chess01 = new int[sparseArray01[0][0]][sparseArray01[0][1]];
        for (int i=0;i<sum;i++){
            chess01[sparseArray01[i+1][0]][sparseArray01[i+1][1]]=sparseArray01[i+1][2];
        }

        System.out.println("还原后的棋盘");
        for (int row[] : chess01){
            for(int i : row){
                System.out.print(i+"\t");
            }
            System.out.println();
        }

    }
}
