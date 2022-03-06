package com.muthu;

class Student{
    String name;
    int age;
    int id;
    String dept;

    public Student(String name, int age, int id, String dept) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dept = dept;
    }

    public String toString(){
        return  "Name :" + name + "  Age :" + age + "  Id :" + id + "  Dept :" + dept;
    }
}

class Address{
    int door_no;
    String village;
    String district;

    public Address(int door_no, String village, String district) {
        this.door_no = door_no;
        this.village = village;
        this.district = district;
    }

    public String toString(){
        return "Door_No :" + door_no + "  Village :" +village + "  District :" +district;
    }
}

public class StudentData {
    public static void main(String[] args) {
        Student s[] = new Student [10];
        s[0] = new Student("Akask",22,4001,"Mech");
        s[1] = new Student("Aravind",21,4002,"Mech");
        s[2] = new Student("Bala",24,4003,"Mech");
        s[3] = new Student("Balaji",22,4004,"Mech");
        s[4] = new Student("Chandru",22,4005,"Mech");
        s[5] = new Student("Dhanush", 23,4006,"Mech");
        s[6] = new Student("Dinesh",22,4007,"Mech");
        s[7] = new Student("Elavarasan",23,4008,"Mech");
        s[8] = new Student("Govind",23,4009,"Mech");
        s[9] = new Student("Hari", 24,4010,"Mech");
        Address a[] = new Address[10];
        a[0] = new Address(101,"Karanodai","Tiruvallur");
        a[1] = new Address(243,"kamarapalayam","Theni");
        a[2] = new Address(290,"Puduvalavu","Pudukottai");
        a[3] = new Address(621,"Puduvayal","Sivaganga");
        a[4] = new Address(443,"Gandhi Nagar","Coimbatore");
        a[5] = new Address(588,"Ponnamaravathi","Pudukottai");
        a[6] = new Address(934,"Pillamangalam","Sivaganga");
        a[7] = new Address(487,"Viralimalai","Trichy");
        a[8] = new Address(565,"Vadakur","ramanathapuram");
        a[9] = new Address(346,"Manali","Chennai");
        int n = 0;
        for(int i = 0 ; i < s.length ; i++)
        {
            System.out.println("Student " + ++n);
            System.out.println(s[i].toString());
            System.out.println(a[i].toString());
            System.out.println();
        }
    }
}
