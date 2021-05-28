package ca.utoronto.utm.othello.viewcontroller;

import ca.utoronto.utm.othello.model.Othello;
import ca.utoronto.utm.util.Observable;
import ca.utoronto.utm.util.Observer;

public class HumanvsHumanviewer implements Observer {
    @Override
    public void update(Observable o) {
        Othello oo = (Othello) o;
        System.out.println(oo.getBoardString());
    }
}
