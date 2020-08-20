package behavioral.memento;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Caretaker {
    private  Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public static void main(String[] args) {
        Role role = new Role(100,100);
        System.out.println("--大战之前--");
        role.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.save());

        role.setBloodFlow(20);
        role.setMagicPoint(20);
        role.display();

        role.restore(caretaker.getMemento());
        role.display();

    }
}
