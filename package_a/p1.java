class student{
    private int roll ;
    private String name ;
    private int adm_no;
    student(int roll,String name,int adm_no){
        this.roll = roll;
        this.name = name;
        this.adm_no = adm_no; 
    }
    void Work(){
        System.out.println(this.name + " is Studying");
    }
}

class p1{
    public static void main(String args[]){
        student s1 = new student(10,"Rahul",7801);
        student s2 = new student(13,"Rohit",1867);
        s1.Work();
    }
}