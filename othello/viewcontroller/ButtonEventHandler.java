package ca.utoronto.utm.othello.viewcontroller;
import ca.utoronto.utm.othello.model.Othello;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonEventHandler implements EventHandler<ActionEvent>{
	
	private int row, col;
	private Othello othello;

	public ButtonEventHandler(int row, int col,Othello othello){
		this.row = row;
		this.col = col;
		this.othello = othello;
	}
	
	// Print out the current position
	@Override
	public void handle(ActionEvent e) {
		othello.move(this.row,this.col);
	}
		
}

