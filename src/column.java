import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by xiao on 3/25/2015.
 */
public class column {
    public static void main(String[] args) {
        StringTokenizer st1;


        st1=new StringTokenizer("a b a");

        int numberOfItems=st1.countTokens();
        String[] items=new String[numberOfItems];
        for (int i=0;i<numberOfItems;i++){
            items[i]=st1.nextToken();
            System.out.println(items[i]);
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
                j=0;
                while(j<numberInCatalog && items[i].equals(catalog.get(j).getName)==false)
                {j++;}
                System.out.println(j);
                if(j==numberInCatalog){
                    //none
                    catalog.add(items[i]);
                    catalogNumber.add(1);
                }else{
                    //you
                    int temp=1;
                 //  temp=catalogNumber.get(j);
                 //   catalogNumber.set(j,temp+1);
                }
            }

        }
        for (int i=0;i<catalog.size();i++){
            System.out.println(catalog.get(i));
            System.out.println(catalogNumber.get(i));
        }


    }

}
