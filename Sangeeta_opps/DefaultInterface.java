package Amit_opps;


interface pencil{
    default void write(){
        System.out.println("I am Default...");
    }
}
interface eraser {
    void delete();
}
class pencilBox implements pencil,eraser{
    @Override
    public void write(){
        System.out.println("I am writing....");
    }
    @Override
    public void delete(){
        System.out.println("I am deleting....");

    }
}
public class DefaultInterface {
    public static void main(String[] args) {
        pencil obj = new pencilBox();
        obj.write();
        //obj.delete();
    }
}
