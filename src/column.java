
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by xiao on 3/25/2015 for weijia
 */
public class column {
    public static void main(String[] args) {

        String st1="yes no\nyes no\nno yes a a a\nyes no \n b b";

        LinkedList<jiaclass> catalog=count(stringsToArrays(st1,"\n"));
       // jiaclass objItem;
        for(jiaclass item: catalog ) {
            System.out.println(item.getName()+item.getNumber());
        }

    }

    static String[] stringsToArrays(String inputAString) {
      StringTokenizer st1 = new StringTokenizer(inputAString);
      int numberOfItems = st1.countTokens();
      String[] items = new String[numberOfItems];

       for (int i = 0; i < numberOfItems; i++) {
         items[i] = st1.nextToken();
        //    System.out.println(items[i]);
        }
        return items;
    }

    static String[] stringsToArrays(String inputAString, String sep) {
        StringTokenizer st1 = new StringTokenizer(inputAString,sep);
        int numberOfItems = st1.countTokens();
        String[] items = new String[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            items[i] = st1.nextToken();
            //    System.out.println(items[i]);
        }
        return items;
    }

   static LinkedList<jiaclass> count(String[] items){

        LinkedList<jiaclass> catalog=new LinkedList<jiaclass>();
        jiaclass objItem;
        int numberInCatalog;

        int j;
        for (String itemString: items) {
            if (catalog.size() == 0) {
                objItem=new jiaclass();
                objItem.set(itemString,1);
                catalog.add(objItem);
                //   System.out.println(catalog.get(0));
            }
            else
            {
                numberInCatalog=catalog.size();


            //    jiaclass tem=new jiaclass();
                int flag=-1;
                for (j=0;flag<0&&j<numberInCatalog;j++)
                {
                  //  tem.set((jiaclass)catalog.get(j));
                    if (itemString.equals(catalog.get(j).getName()))
                    {
                        flag=j;
                    }
                }

                if(flag<0){
                    //none
                    objItem=new jiaclass();
                    objItem.set(itemString,1);
                    catalog.add(objItem);

                }else{
                    //you
                   // tem=new jiaclass();
                  //  tem.set((jiaclass)catalog.get(flag));
                   // tem.setNumber(tem.getNumber()+1);
                    objItem=new jiaclass();
                    objItem.set(itemString,catalog.get(flag).getNumber()+1);
                    catalog.set(flag,objItem);
                    //  temp=catalogNumber.get(j);
                    //   catalogNumber.set(j,temp+1);
                }
            }

        }
        return catalog;
    }
}
