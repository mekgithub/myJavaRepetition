package javatekrar;
//23 after while,next 'Do While'
//Question:List all numbers divisible by 4 between 20-150,use while loop.
public class WhileLoop2 {
    public static void main(String[] args) {
        int i=20;
        while(i<151){
            i++;
            if(i%4==0){
                System.out.printf("%4d"+",",i);
            }

        }
    }
}
