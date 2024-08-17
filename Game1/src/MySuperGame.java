import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;


public class MySuperGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(3,3);
        showGrid(false);
        setCellValueEx(1, 1, Color.BISQUE, "X", Color.ALICEBLUE, 50);
    }
}
