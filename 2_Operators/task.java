//q1. 
/*
public class task
{
	public static void main(String[] args) {
		int x=2, y=5;
		int example1=(x*y/x);
		int example2=(x*(y/x));
		System.out.print(example1+",");
		System.out.print(example2);
	}
}
*/

//q2.
/*
public class task{
    public static void main(String[] args){
        int x=200,y=50,z=100;
        if(x>y && y>z){
            System.out.println("hello");
        }
        if(z>y && z<x){
            System.out.println("java");
        }
if((y+200)<x && (y+150)<z){
            System.out.println("hello java");
        }
    }
}
*/

//q3

/*
public class task{
    public static void main(String[] args){
       int x,y,z;
       x=y=z=2;
       x+=y;
       y-=z;
       z/=(x+y);
       System.out.println(x+","+y+","+z);
    }
}
*/

//q4.
// public class task{
//     public static void main(String[] args){
//         int x=9 , y=12;
//         int a=2,b=4,c=6;
//         int exp=4/3*(x+34)+9*(a+b*c)+(3+y*(2+a)/(a+b*y));50
//         43+234+3
//         System.out.println(exp);
//     }
// }

//Q5
public class task{
    public static void main(String[] args){
        int x = 10 , y =5;

        int exp1 = (y*(x/y+x/y));  
        int exp2 = (y*x/y+y*x/y); 
        System.out.println(exp1);
        System.out.println(exp2);
    }
}