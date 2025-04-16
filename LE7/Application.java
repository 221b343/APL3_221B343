public class Application{
    public static void main(String[] args){
        Crow crow = new indianCrow();
        CrowAdapter crowadapter = new CrowAdapter(crow);
        Client(crowadapter);
    }
    public static void Client (Swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}