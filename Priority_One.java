public class Priority_One extends Calculator
{
    int MAX = 200;

    public Priority_One(Calculator next) {
        super(next);
    }

    @Override
    public void Calculate(String calculation) {
        System.out.println(calculation);
        int index = 0;
        int index0 = 0;
        while(true){
            index = calculation.indexOf('*');
            index0 = calculation.indexOf('/');
            if (index != -1)
            {
                int index1, index2, index3, index4;
                String temp1 = calculation.substring(0,index);
                String temp2 = calculation.substring(index+1);
                index1 = temp1.lastIndexOf('/');
                index2 = temp1.lastIndexOf('-');
                index3 = temp1.lastIndexOf('+');
                index4 = temp1.lastIndexOf('*');
                int tempindex1 = Math.max(index1,index2);
                tempindex1 = Math.max(tempindex1, index3);
                tempindex1 = Math.max(tempindex1, index4);
                index1 = temp2.indexOf('/');
                index2 = temp2.indexOf('-');
                index3 = temp2.indexOf('+');
                index4 = temp2.indexOf('*');
                int tempindex2 = Math.max(index1,index2);
                tempindex2 = Math.max(tempindex2,index3);
                tempindex2 = Math.max(tempindex2,index4);
                if (tempindex1 == -1){tempindex1 = 0;};
                if (tempindex2 == -1){tempindex2 = temp2.length();};
                float result = Float.parseFloat(temp1.substring(tempindex1, index)) *
                        Float.parseFloat(temp2.substring(0,tempindex2));
                calculation = temp1.substring(0,tempindex1+1) + result +
                        temp2.substring(tempindex2);
                System.out.println(calculation);

            }

            else if (index0 != -1)
            {
                int index1, index2, index3, index4;
                String temp1 = calculation.substring(0,index0);
                String temp2 = calculation.substring(index0+1);
                index1 = temp1.lastIndexOf('/');
                index2 = temp1.lastIndexOf('-');
                index3 = temp1.lastIndexOf('+');
                index4 = temp1.lastIndexOf('*');
                int tempindex1 = Math.max(index1,index2);
                tempindex1 = Math.max(tempindex1, index3);
                tempindex1 = Math.max(tempindex1, index4);
                index1 = temp2.indexOf('/');
                index2 = temp2.indexOf('-');
                index3 = temp2.indexOf('+');
                index4 = temp2.indexOf('*');
                int tempindex2 = Math.max(index1,index2);
                tempindex2 = Math.max(tempindex2,index3);
                tempindex2 = Math.max(tempindex2,index4);
                if (tempindex1 == -1){tempindex1 = 0;};
                if (tempindex2 == -1){tempindex2 = temp2.length();};
                float result = Float.parseFloat(temp1.substring(tempindex1, index0)) /
                        Float.parseFloat(temp2.substring(0,tempindex2));
                calculation = temp1.substring(0,tempindex1+1) + result +
                        temp2.substring(tempindex2);
                System.out.println(calculation);
            } else
            {
                break;
            }
        }
        super.Calculate(calculation);
    }
}