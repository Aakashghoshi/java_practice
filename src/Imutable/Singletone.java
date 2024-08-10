package Imutable;

public class Singletone {

    private Singletone id;


    private Singletone(Singletone id){
        this.id=id;
    }
    public  Singletone getInstance() {
        if (id == null) {
            return new Singletone(id);
        } else {
            return id;
        }
    }

}
