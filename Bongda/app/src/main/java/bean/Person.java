package bean;

/**
 * Created by Pham Duyen on 23/04/2016.
 */
public class Person {
    private  String name;
    private String sdt;
    public Person(){

    }
    public Person(String name,String sdt){
        this.name = name;
        this.sdt = sdt;
    }
    public  void setName(String name){
        this.name = name;
    }
    public  void setSdt(String sdt){
        this.sdt = sdt;
    }
    public String getName(){
        return this.name;
    }
    public String getSdt(){
        return this.sdt;
    }

}
