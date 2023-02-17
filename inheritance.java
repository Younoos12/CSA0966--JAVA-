class vehicle{
void show(){
System.out.println("I am vhicle");
}
}

class car extends vehicle{
void show1(){
System.out.print("and I am car");
}
}

class truck extends vehicle{
void show2(){
System.out.println("and I am truck");
}
}

class motorcycle extends vehicle{
void show3(){
System.out.println("and I am motorcycle");
}
}

class Main{
public static void main(String[] args){
motorcycle m=new motorcycle();
truck t=new truck();
car c=new car();
m.show();
m.show3();
t.show();
t.show2();
c.show();
c.show1();
}
}



