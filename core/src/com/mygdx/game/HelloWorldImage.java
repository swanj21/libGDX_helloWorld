package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloWorldImage extends Game {
    // Object that stores image related data.
    //   Dimensions, color of each pixel
    private Texture texture;

    // Object that draws images to the screen
    private SpriteBatch spriteBatch;

    @Override
    public void create() {
        FileHandle worldFile = Gdx.files.internal("D:\\Java_LibGDX_Games\\libGDX_helloWorld\\core\\images\\world.png");
        texture = new Texture(worldFile);
        spriteBatch = new SpriteBatch();
    }

    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        spriteBatch.draw(texture, 192, 112);
        spriteBatch.end();
    }
}
