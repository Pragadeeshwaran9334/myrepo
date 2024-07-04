// class main{
//      public static void main(String[] args) {
//         int a=10;
//         int b=15;
//         for(int i=1;i<=a;i++)
//         {
//             System.out.println("15"+"x"+i+"="+b*i);
//         }
//     }
// }

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        // if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        // {
        //     System.out.print("vowels");
        // }
        // else{
        //     System.out.print("consonent");
        // }
        // switch (a) {
        //     case 'a','e','i','o','u':
        //         System.out.print("vowels");
        //         break;
        
        //     default:
        //     System.out.print("consonent");
        //         break;
        // }

        int b=5;
        int sum=1;
        for(int i=1;i<=b;i++)
        {
            sum=sum*i;
        }
        System.out.print(sum);
    }
}
