package autofight.domain;

import autofight.utils.MessageHandler;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ScreenData {
    private final int COORDINATES_COUNT = 2;
    private final String PLEASE_PATTERN = "Please, move on your mouse to the ";
    private final String HP_BAR_MOB_FULL = "end of MOB HP BAR.";
    private final String HP_BAR_MOB_DIED = "start of DEAD MOB HP BAR";
    private List<Point> points = new ArrayList<>();
    private Queue<String> stringQueue = new ArrayDeque<>();

    public void initCoordinates() {
        prepareMessages();
        try {
            for (int i = 0; i < COORDINATES_COUNT; i++) {
                MessageHandler.print(PLEASE_PATTERN + getMousePositionMessage());
                MouseAction.waitForCursorPosition();
                points.add(getPoint());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Point getPoint() {
        return MouseInfo.getPointerInfo().getLocation();
    }

    private String getMousePositionMessage() {
        return stringQueue.poll();
    }

    private void prepareMessages() {
        stringQueue.add(HP_BAR_MOB_FULL);
        stringQueue.add(HP_BAR_MOB_DIED);
    }
}

