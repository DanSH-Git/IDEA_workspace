package DataStructure;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author asus1
 * @create 2020/11/24 20:32
 * 将一个数组保存为稀疏数组，同时能够对该数组进行转换；
 * 任务:
 * 将稀疏数组保存到磁盘上，比如map.data;
 */
public class SparseArr {
    public static void main(String[] args) throws IOException {
        int[][] oriArr = new int[11][11];
        oriArr[1][2] = 1;
        oriArr[2][3] = 2;
        oriArr[3][4] = 3;
        oriArr[4][5] = 4;
        oriArr[5][6] = 5;
        System.out.println("OriArr:");
        print(oriArr);
        int[][] arr1 = changeSparArr(oriArr);
        System.out.println("SparseArr:");
        print(arr1);
        System.out.println("saving...");
        save(arr1);
        System.out.println("saved");
        int[][] arr2 = changeOri(arr1);
        System.out.println("changeOri:");
        print(arr2);
    }

    /* * 将一个数组保存为稀疏数组，同时能够对该数组进行转换；
     *   任务:
     *  将稀疏数组保存到磁盘上，比如map.data;*/
    public static void save(int[][] array) throws IOException {

            PrintStream fw = new PrintStream("src\\DataStructure\\save.txt");
//            String[] ss = new String[array.length * array[0].length];
//          OutputStreamWriter osw=new OutputStreamWriter(fw,"utf-8");
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                for (int i1 = 0; i1 < array[0].length; i1++) {
                    //System.out.print(array[i][i1] + "|");
                   fw.print(array[i][i1]+" ");
                }
                fw.println( );
            }
            fw.close();
        System.out.println("文件保存到src\\DataStructure\\save.txt，保存成功");
    }




    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[0].length; i1++) {
                System.out.print(array[i][i1] + "|");
            }
            System.out.println();
        }
    }
    public static int[][] changeSparArr(int[][] array) {
        int row;
        int col;
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                if (array[i][i1] != 0)
                    value++;
            }
        }
        int[][] array1 = new int[value + 1][3];//创建数组
        //填充行列数
        array1[0][0] = array.length;//行
        array1[0][1] = array[0].length;//列
        array1[0][2] = value;//值
        //填充行列信息
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                if (array[i][i1] != 0) {
                    array1[k][0] = i;
                    array1[k][1] = i1;
                    array1[k][2] = array[i][i1];
                    k++;
                }
            }
        }

        return array1;

    }

    public static int[][] changeOri(int[][] array) {
        int row;
        int col;
        int value;
        int[][] array1 = new int[array[0][0]][array[0][1]];
        //int k=1;
        for (int i = 1; i < array.length; i++) {
            array1[array[i][0]][array[i][1]] = array[i][2];
        }

        return array1;
    }
}
