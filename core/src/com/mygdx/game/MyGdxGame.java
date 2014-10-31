package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture imgBack;
    Texture imgLogo;
    Texture imgCtg1,imgCtg2,imgCtg3,imgCtg4,imgCtg5,imgCtg6,imgCtg7,imgCtg8;

    @Override
    public void create () {
        batch = new SpriteBatch();
        imgBack = new Texture("appbackground.jpg");
        imgLogo = new Texture("applogo.png");
        imgCtg1 = new Texture("ctg1.jpg");
        imgCtg2 = new Texture("ctg2.jpg");
        imgCtg3 = new Texture("ctg3.jpg");
        imgCtg4 = new Texture("ctg4.jpg");
        imgCtg5 = new Texture("ctg5.jpg");
        imgCtg6 = new Texture("ctg6.jpg");
        imgCtg7 = new Texture("ctg7.jpg");
        imgCtg8 = new Texture("ctg8.jpg");
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(imgBack, 0, 0);
        batch.draw(imgLogo, 0, 0);
        batch.draw(imgCtg1, 1020, 760);
        batch.draw(imgCtg2, 1320, 760);
        batch.draw(imgCtg3, 1020, 440);
        batch.draw(imgCtg4, 1320, 440);
        batch.draw(imgCtg5, 1620, 440);
        batch.draw(imgCtg6, 1020, 120);
        batch.draw(imgCtg7, 1320, 120);
        batch.draw(imgCtg8, 1620, 120);
        batch.end();
    }
}