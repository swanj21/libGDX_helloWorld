package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.mygdx.game.HelloWorldImage;

public class HelloWorldLauncher {
    public static void main(String[] args) {
        HelloWorldImage mainProgram = new HelloWorldImage();
        LwjglApplication launcher = new LwjglApplication(mainProgram);
    }
}
