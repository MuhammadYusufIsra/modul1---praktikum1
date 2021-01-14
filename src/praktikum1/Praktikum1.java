//Package
package praktikum1;
/**
 *
 * @author Yusuf Isra
 */
//Class
public class Praktikum1 {
    //Method main
public static void main (String []args){
    //Deklarasi Variabel     
    int i, j;
    //Perulangan for (Looping bersarang)
         for (i = 1; i<5; i++){
            for (j = 1; j<5; j++){
                //Percabangan IF/ELSE
                if(i==1 || i==4 || j==1 || j==4){
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}