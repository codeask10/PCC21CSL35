class staff {
    int staffid, phone, salary;
    String name;
    public staff(int id , int no, int sal, String na) {staffid=id;
        phone=no;
        salary=sal;
        name=na;
    }
    void display() {
        System.out.println("------------------------------------");
        System.out.println("Staff ID:"+ " "+ staffid);
        System.out.println("Staff Phone number:" + " "+ phone);
        System.out.println("Staff Salary:" +" "+ salary);
        System.out.println("Staff Name:" +" "+ name);
    }
}
class Teaching extends staff {
    String domain;
    int no_of_publications;
    public Teaching(int id, int no, int sal, String na,String d,int nop) {
        super(id,no,sal,na);
        domain=d;
        no_of_publications=nop;
    }
    void Tdisplay(){
        System.out.println("-----------------------------------");
        System.out.println("Teaching Staff Details");
        super.display();
        System.out.println("Domain :" +" "+domain);
        System.out.println("No_of_publications:"+" "+no_of_publications);
    }
}
class Technical extends staff {
    String skills;
    public Technical(int id , int no, int sal, String na,String sk) {
        super(id,no,sal,na);
        skills=sk;
    }
    void Tedisplay(){
        System.out.println("------------------------------------- ");
        System.out.println("Technical Staff Details");
        super.display();
        System.out.println("Skills :" + " "+skills);}
    }
class Contract extends staff {
    int period;
    public Contract(int id , int no, int sal, String na,int pd) {
        super(id,no,sal,na);
        period=pd;
    }
    void Cdisplay(){
        System.out.println("-------------------------------------");
        System.out.println("Contract Staff Details");
        super.display();
        System.out.println("ContractPeriod:" + " "+period + "years");
    }
}
public class Multilevel {
    public static void main(String args[]) {
        Teaching t1=new Teaching(11,998765434,31000,"Anil","CSE",10);
        Teaching t2=new Teaching(12,996655546,30000,"Anu","ISE",9);
        Teaching t3=new Teaching(13,999933442,32000,"Anusha","EEE",8);
        t1.Tdisplay();
        t2.Tdisplay();
        t3.Tdisplay();
        Technical te1=new Technical(21,994433221,22000,"Kumar","C");
        Technical te2=new Technical(22,998877665,28000,"Krisna","Java");
        Technical te3=new Technical(23,991654321,33000,"Kiran","Java");
        te1.Tedisplay();
        te2.Tedisplay();
        te3.Tedisplay();
        Contract ct1=new Contract(31,998765434,35000,"Anil",3);
        Contract ct2=new Contract(32,912345678,39000,"Meghana",2);
        Contract ct3=new Contract(33,992233445,30000,"Uma",4);
        ct1.Cdisplay();
        ct2.Cdisplay();
        ct3.Cdisplay();
    }
}