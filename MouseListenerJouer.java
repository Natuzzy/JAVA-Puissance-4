import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerJouer implements MouseListener {
	
	private PrintBoard printBoard;
	
	public MouseListenerJouer(PrintBoard printBoard){
		this.printBoard = printBoard;
	}
	
	public void mouseClicked(MouseEvent arg0) {
		printBoard.plateau();
	}

	public void mouseEntered(MouseEvent arg0) {
		
	}

	public void mouseExited(MouseEvent arg0) {
		
	}

	public void mousePressed(MouseEvent arg0) {
		
	}

	public void mouseReleased(MouseEvent arg0) {
		
	}
   
}
