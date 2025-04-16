class CrowAdapter implements Swan{
    private Crow crow;
    public CrowAdapter(Crow crow){
        this.crow = crow;

    }
    public void eat(){
        crow.eat();
    }
    public void swim(){
        crow.fly();
    }
    public void sing(){
        crow.cry();
    }
}