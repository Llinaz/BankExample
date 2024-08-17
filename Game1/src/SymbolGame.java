import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class SymbolGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(8, 3);
        setCellValueEx(0, 1, Color.AZURE, "J");
        setCellValueEx(1, 1, Color.MAGENTA, "A");
        setCellValueEx(2, 1, Color.BISQUE, "V");
        setCellValueEx(3, 1, Color.CADETBLUE, "A");
        setCellValueEx(4, 1, Color.CHARTREUSE, "R");
        setCellValueEx(5, 1, Color.CORAL, "U");
        setCellValueEx(6, 1, Color.MEDIUMTURQUOISE, "S");
        setCellValueEx(7, 1, Color.MEDIUMSEAGREEN, "H");
    }
}
