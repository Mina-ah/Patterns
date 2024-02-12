/**
 * pattern1
 * we need to know three major point while solving this
 * 1- how many rows are there
 * 2- for each row how many columns are there
 * 3- and what we need to print
 */
public class pattern1 {
public static void main(String args[]){
for(int i=1;i<=4;i++){
    for(int j=1;j<=4-i+1;j++){
        System.out.print("*");
    }
    System.out.println("");
}
}
}
