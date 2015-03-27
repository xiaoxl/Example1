
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by xiao on 3/25/2015 for weijia
 */
public class column {
    public static void main(String[] args) {

        String st1="yes no yes no no yes";

        LinkedList<jiaclass> catalog=count(st1);
       // jiaclass objItem;
        int s=catalog.size();
        for (int i=0;i<s;i++){

            System.out.println(catalog.get(i).getName()+catalog.get(i).getNumber());
        }

    }



   static LinkedList<jiaclass> count(String inputAString){

        StringTokenizer st1=new StringTokenizer(inputAString);
        int numberOfItems=st1.countTokens();
        String[] items=new String[numberOfItems];

        for (int i=0;i<numberOfItems;i++){
            items[i]=st1.nextToken();
            //    System.out.println(items[i]);
        }

        LinkedList<jiaclass> catalog=new LinkedList<jiaclass>();
        jiaclass objItem;
        int numberInCatalog;

        int j;
        for (int i=0;i<numberOfItems;i++) {
            if (catalog.size() == 0) {
                objItem=new jiaclass();
                objItem.set(items[i],1);
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
                    if (items[i].equals(catalog.get(j).getName()))
                    {
                        flag=j;
                    }
                }

                if(flag<0){
                    //none
                    objItem=new jiaclass();
                    objItem.set(items[i],1);
                    catalog.add(objItem);

                }else{
                    //you
                   // tem=new jiaclass();
                  //  tem.set((jiaclass)catalog.get(flag));
                   // tem.setNumber(tem.getNumber()+1);
                    objItem=new jiaclass();
                    objItem.set(items[i],catalog.get(flag).getNumber()+1);
                    catalog.set(flag,objItem);
                    //  temp=catalogNumber.get(j);
                    //   catalogNumber.set(j,temp+1);
                }
            }

        }
        return catalog;
    }
}
