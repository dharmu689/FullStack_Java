public class con
{
    String name;
    int age;
    double sal;
    
    public con(String n,int u,double s)  //create a declear constractor
    {
        name = n;
        age = u;
        sal = s;
    }
    public static void main(String[] args) {
        con myCon = new con("Dharmu",21,500000); // create a object
        System.out.println(myCon.name );
        System.out.println(myCon.age );
        System.out.println(myCon.sal );
    }

}