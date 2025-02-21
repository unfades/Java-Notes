class ArrSum{
    public double[] calculate(int[] brr){
        double[] sumAvg = new double[2];
        int sum = 0;
        for(int i = 0; i<brr.length; i++){
            if(brr[i]<0){
                return null;
            }
            sum+=brr[i];
        }
        sumAvg[0] = sum;
        sumAvg[1] = (double)sum/brr.length;
        return sumAvg;
    }
}

class UserArrSum{
    public static void main(String[] args){
        double[] result;
        int[] arr = {1,2,3,4};
        ArrSum obj = new ArrSum();
        result = obj.calculate(arr);
        if(result == null){
            System.out.println("NULL NULL NULL");
        }else{
            System.out.println("sum is : " + result[0]);
            System.out.println("avg is : " + result[1]);
        }
    }
}
