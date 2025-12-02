public class Triangle {

    public static int triangle(int rows){
        if(rows == 0) return 0;
        return triangle(rows-1) + rows;
    }

    public static void main(String[] args){
        System.out.println(triangle(4));
    }
}
