import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Date;
// -------------------------------------------------------------------------
/**
 * A scrollable textArea representing the game log. (i.e. moves made by each
 * player)
 * 
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGameLog extends JScrollPane {
    private JTextArea textArea;

    public ChessGameLog() {
        super(new JTextArea("", 5, 30), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textArea = (JTextArea) getViewport().getView();
    }

    public void addToLog(String s) {
        if (textArea.getText().isEmpty()) {
            textArea.setText(new Date() + " - " + s);
        } else {
            textArea.append("\n" + new Date() + " - " + s);
        }
    }

    public void clearLog() {
        textArea.setText("");
    }

    public String getLastLog() {
        String text = textArea.getText();
        int indexOfLastNewLine = text.lastIndexOf("\n");
        return (indexOfLastNewLine >= 0) ? text.substring(indexOfLastNewLine + 1) : text;
    }
}
