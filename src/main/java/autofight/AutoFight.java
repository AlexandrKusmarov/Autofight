package autofight;

import autofight.domain.ScreenData;
import autofight.utils.MessageHandler;

public class AutoFight {
    private static final String DESCRIPTION = "Follow instructions and give some coordinates. \n ";

    public static void main(String[] args) {
        ScreenData screenData = new ScreenData();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MessageHandler.print(DESCRIPTION);
        screenData.initCoordinates();
    }
}
