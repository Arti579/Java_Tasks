public interface Nameable {
    String getName();
}

class Planet implements Nameable{
    private String name;
    public Planet(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}

class Auto implements Nameable {
    private String mark;
    public Auto(String mark){
        this.mark = mark;
    }
    @Override
    public String getName(){
        return mark;
    }
}