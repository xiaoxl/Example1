import java.util.LinkedList;

/**
 * Created by xiao on 3/26/2015 for weijia
 */
public class jiapack {
    LinkedList list;
  //  jiaclass items;

 //   int size;
    jiapack(){
        list=new LinkedList();
    }

    void add(jiaclass A){
        jiaclass tem=new jiaclass();
        tem.set(A);
        list.add(tem);
    }
    void add(String A, int i){
        jiaclass tem=new jiaclass();
        tem.setName(A);
        tem.setNumber(i);
        list.add(tem);
    }

    jiaclass get(int i){
        return (jiaclass)list.get(i);
    }

    int size(){
        return list.size();
    }

    void set(int i,jiaclass A)    {
        list.set(i,A);
    }

    void increasByOne(int i){
        jiaclass tem=new jiaclass();
        tem.set((jiaclass)list.get(i));
        tem.setNumber(tem.getNumber()+1);
        list.set(i,tem);
    }

}
