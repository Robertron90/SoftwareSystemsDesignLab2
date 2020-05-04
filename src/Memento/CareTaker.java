package Memento;

public interface CareTaker {
    public void add(Memento state);
    public Memento get(int index);
}
