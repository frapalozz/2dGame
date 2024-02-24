package object;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Key extends SuperObject{
    
    GamePanel gp;

    public OBJ_Key(GamePanel gp) {

        this.gp = gp;
        
        name = "Key";
        try {
            image = ImageIO.read(new FileInputStream("game/res/objects/key.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
