/**
 * Created by xiao on 3/25/2015 for weijia
 */
public class jiaclass {
    String name;
    int number;


    int getNumber()
    {
       return number;
    }

    String getName()
    {
        return name;
    }

    void set(String A,int n) {
        name=A;
        number=n;
    }
    void setName(String A)
    {
        name=A;
    }
    void setNumber(int n)
    {
        number=n;
    }
    void set(jiaclass A)
    {
        name=A.getName();
        number=A.getNumber();
    }
}
