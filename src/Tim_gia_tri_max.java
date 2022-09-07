public class Tim_gia_tri_max {
    public static void main(String[] args) {
        double numBer[] = new double[]{
                1,6,9,4,1,6,2,4,6,10,24,0
        };
        double max = numBer[0];
        for (int i =0; i < numBer.length; i++) {
            if (numBer[i]>max){
                max = numBer[i];
            }
        }
        System.out.println("max :" + max);
    }
}
