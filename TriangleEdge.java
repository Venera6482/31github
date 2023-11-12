public class TriangleEdge {
    public static int nextEdge(int side1, int side2){
        int result = (side1+side2)-1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(nextEdge(12, 67));
    }
}
