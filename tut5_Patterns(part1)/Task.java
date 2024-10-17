/* ***************************************************

*****
*   *
*   *
*****

 */


// public class Task{
//     public static void main(String args[]){
//         int range = 4;
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1 || i==range){
//                     System.out.print("*");
//                 }
//                 else{
//                     if(j==1 || j==5){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();

//         }
//     }
// }


// public class Task{
//     public static void main(String args[]){
//         int range = 4;
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1 || i==range || j==1 || j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
// }


/* ***************************************************** INVERTED HALF PYRAMID PATTERN
      *
    * *
  * * *
* * * *     
   
 */

// public class Task{
//     public static void main(String args[]){
//         int range = 4;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=range;j++){
//                 if(j<range-i+1){
//                     System.out.print(" ");
//                 }else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// ******* OR **********************
// public class Task{
//     public static void main(String args[]){
//         int range = 4;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=range-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }


/* ************************************************  INVERTED HALF-PYRAMID 
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1

 */

// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=range-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


/* *********************************************** FLOYD'S TRIANGLE PATTERN
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */

// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+j-1);
//             }
//             System.out.println();
//         }
//     }
// }

/* ***************************************************** 
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         int number =1;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(number);
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }


/* *************************************************** 0-1 TRIANGLE PATTERN
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */


// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         int number =1;
//         for(int i=1; i<=range; i++){
//             int even=1;
//             int odd=0;
//             for(int j=1; j<=i; j++){
//                 if(i%2!=0){
//                     if(even==1){
//                     System.out.print(even);
//                     even--;
//                 }else{
//                     System.out.print(even);
//                     even++;
//                 }
//                 }else{
// if(odd==0){
//                     System.out.print(odd);
//                     odd++;
//                 }else{
//                     System.out.print(odd);
//                     odd--;
//                 }
//                 }
                
//             }
//             System.out.println();
//         }
//     }
// }


// *********** OR 
// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(0);
//                 }
//             }
            
            
//             System.out.println();
//         }
//     }
// }


/* ************************************************ butterfly pattern

 */

// public class Task{
//     public static void main(String args[]){
//         int range = 4;
//         int half = range/2;
//         for(int i=1; i<=range;i++){
//             if(i<=half){
//                 for(int j=1; j<=1; j++){
//                     for(int k=1; k<=i; k++){
//                         System.out.print("*");
//                     }
//                     for(int l=1; l<=half-i;l++){
//                         System.out.print(" ");
//                     }
//                 }
//                 for(int j=1; j<=1; j++){
//                     for(int l=1; l<=half-i;l++){
//                         System.out.print(" ");
//                     }
//                     for(int k=1; k<=i; k++){
//                         System.out.print("*");
//                     }
//                 }
//                     System.out.println();
//             }else{
//                 for(int j=1; j<=1; j++){
//                     for(int k=1; k<=range-i+1; k++){
//                         System.out.print("*");
//                     }
//                     for(int l=half+1; l<i;l++){
//                         System.out.print(" ");
//                     }
//                     // System.out.println();
//                 }
//                 for(int j=1; j<=1; j++){
//                     for(int l=half+1; l<i;l++){
//                         System.out.print(" ");
//                     }
//                     for(int k=1; k<=range-i+1; k++){
//                         System.out.print("*");
//                     }
//                 }
//                     System.out.println();
//             }
//         }
//     }
// }


// ******************** OR **************************

// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int k=1; k<=(2*range)-(2*i); k++){
//                 System.out.print(" ");
//             }
//             for(int l=1; l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=range; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int k=1; k<=(2*range)-(2*i); k++){
//                 System.out.print(" ");
//             }
//             for(int l=1; l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// ***************************************** SOLID RHOMBUS PATTERN
// public class Task{
//     public static void main(String args[]){
//         int range =5;
//         for(int i=1;i<=range;i++){
//             for(int j=1;j<=range-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
// for(int l=1;l<=range-i;l++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(" ");
//             }
            
//             System.out.println();
//         }
//     }
// }
// *********************** OR 

// public class Task{
//     public static void main(String args[]){
//         int range =5;
//         for(int i=1; i<=range;i++){
//             for(int j=1; j<=range-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=range; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ********************************* hollow rhombus pattern

// public class Task{
//     public static void main(String args[]){
//         int range =5;
//         for(int i=1;i<=range;i++){
//             for(int j=1;j<=range-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 if(i==1 || i==range){
//                     System.out.print("*");
//                 }else{
//                     if(k==1){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
               
//             }
// for(int l=1;l<=range-i;l++){
//     if(i==1 || i==range){
//         System.out.print("*");
//     }else{
//         if(l==range-i){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }
                
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(" ");
//             }
            
//             System.out.println();
//         }
//     }
// }

// ************ OR 
// public class Task{
//     public static void main(String args[] ){
//         int range = 5;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=range-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=range; k++){
//                 if(i==1 || i==range || k==1 || k==range){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// ******************************* diamond pattern
// public class Task{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int l=1;l<=4;l++){
//             for(int m=1;m<l;m++){
//                 System.out.print(" ");
//             }
//             for(int n=4*2-(2*l-1);n>=1;n--){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
//     }
// }


// *************************** OR
// public class Task{
//     public static void main(String args[]){
//         int range = 5;
//         for(int i=1; i<=range; i++){
//             for(int j=1; j<=range-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=(2*i)-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=range; i>=1; i--){
//             for(int j=1; j<=range-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=(2*i)-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// public class Task{
//     public static void main(String args []){
//         int range =5;
//         for(int i=1;i<=range;i++){
//             for(int k=1;k<=range-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


/*
public class Task{
    public static void main(String args []){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=2;j--){
                System.out.print(j);
            }
            for(int l=1;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
*/


