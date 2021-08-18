package xingshou;

//将数组压缩为稀疏数组
public class for_array {
    public static void main(String[] args) {
        int [][] array1 = new int[10][10];
        array1[2][2] = 7;
        array1[9][8] = 8;
        array1[3][7] = 3;
        //for循环遍历二维数组
       for (int[] ints : array1){
           for (int anInt : ints){
               System.out.print(anInt+"\t");
           }
           System.out.println();
       }

       //获取有效数组的个数
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (array1[i][j]!= 0){
                    sum++;
                }
            }
        }

       //创建一个稀疏数组的数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 10;
        array2[0][1] = 10;
        array2[0][2] = sum;

        //遍历二维数组，将非零值放入稀疏数组
       int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        
        System.out.println("---------");
        for (int[] value : array2) {
            System.out.println(value[0] + "\t"
                    + value[1] + "\t"
                    + value[2] + "\t");
        }

        for (int[] ints : array2){
            for (int anIn : ints){
                System.out.print(anIn+"\t");
            }
        }


    }
}
