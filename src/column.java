import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by xiao on 3/25/2015 for weijia
 */
public class column {
    public static void main(String[] args) {
        StringTokenizer st1;


        st1=new StringTokenizer("a cb c b c a c b");

        int numberOfItems=st1.countTokens();
        String[] items=new String[numberOfItems];
        for (int i=0;i<numberOfItems;i++){
            items[i]=st1.nextToken();
        //    System.out.println(items[i]);
        }

        LinkedList catalog=new LinkedList();
        jiaclass objItem;
        int numberInCatalog;

        int j;
        for (int i=0;i<numberOfItems;i++) {
            if (catalog.size() == 0) {
                objItem=new jiaclass();
                objItem.setName(items[i]);
                objItem.setNumber(1);
                catalog.add(objItem);
             //   System.out.println(catalog.get(0));
            }
            else
            {
                numberInCatalog=catalog.size();


                jiaclass tem=new jiaclass();
                int flag=-1;
                for (j=0;flag<0&&j<numberInCatalog;j++)
                {
                    tem.set((jiaclass)catalog.get(j));
                    if (items[i].equals(tem.getName()))
                    {
                        flag=j;
                    }
                }

                if(flag<0){
                    //none
                    tem=new jiaclass();
                    tem.setName(items[i]);
                    tem.setNumber(1);
                    catalog.add(tem);

                }else{
                    //you
                    tem=new jiaclass();
                    tem.set((jiaclass)catalog.get(flag));
                    tem.setNumber(tem.getNumber()+1);
                    catalog.set(flag,tem);
                 //  temp=catalogNumber.get(j);
                 //   catalogNumber.set(j,temp+1);
                }
            }

        }
        for (int i=0;i<catalog.size();i++){
            objItem=new jiaclass();
            objItem.set((jiaclass)catalog.get(i));
           System.out.println(objItem.getName()+objItem.getNumber());
        }


    }

}
