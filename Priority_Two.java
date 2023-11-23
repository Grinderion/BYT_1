public class Priority_Two extends Calculator {

    public Priority_Two(Calculator next) {
        super(next);
    }
    @Override
    public void Calculate(String calculation) {
        while(true) {
            int index = 0;
            int index0 = 0;
            index = calculation.indexOf('+');
            index0 = calculation.indexOf('-');
            if (index != -1)
            {
                int index1, index2;
                String temp1 = calculation.substring(0,index);
                String temp2 = calculation.substring(index+1);
                index1 = temp1.lastIndexOf('-');
                index2 = temp1.lastIndexOf('+');
                int tempindex1 = Math.max(index1,index2);
                index1 = temp2.indexOf('-');
                index2 = temp2.indexOf('+');
                int tempindex2 = Math.max(index1,index2);
                if (tempindex1 == -1){tempindex1 = 0;};
                if (tempindex2 == -1){tempindex2 = temp2.length();};
                float result = Float.parseFloat(temp1.substring(tempindex1, index)) +
                        Float.parseFloat(temp2.substring(0,tempindex2));
                calculation = temp1.substring(0,tempindex1) + result +
                        temp2.substring(tempindex2);
                System.out.println(calculation);

            }
            else if (index0 != -1)
            {
                int index1, index2, index3, index4;
                String temp1 = calculation.substring(0,index0);
                String temp2 = calculation.substring(index0+1);
                index1 = temp1.lastIndexOf('-');
                index2 = temp1.lastIndexOf('+');
                int tempindex1 = Math.max(index1,index2);
                index1 = temp2.indexOf('-');
                index2 = temp2.indexOf('+');
                int tempindex2 = Math.max(index1,index2);
                if (tempindex1 == -1){tempindex1 = 0;};
                if (tempindex2 == -1){tempindex2 = temp2.length();};
                float result = Float.parseFloat(temp1.substring(tempindex1, index0)) -
                        Float.parseFloat(temp2.substring(0,tempindex2));
                calculation = temp1.substring(0,tempindex1) + result +
                        temp2.substring(tempindex2);
                System.out.println(calculation);
            } else
            {
                break;
            }
        }
    }
}