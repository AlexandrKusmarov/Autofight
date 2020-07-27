package autofight.domain;

import autofight.utils.MessageHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MouseAction {
    public static void waitForCursorPosition() throws IOException {
        MessageHandler.print("Press enter for sending cursor coordinate");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
    }
}
