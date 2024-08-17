import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class RainbowGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 7; j++) {
                setCellColor(i, j, colors[j]);
            }
        }

        showMessageDialog(Color.DARKGREEN, "Epic Fail", Color.WHITE, 80);
    }
}

