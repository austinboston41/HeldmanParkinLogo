//Release 2.0
package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;


public class MyGdxGame extends ApplicationAdapter {
    int nBool=1;
    SpriteBatch batch;
    Texture imgBack, imgCount;
    Stage stage;
    TextButton bCtg1, bCtg2, bCtg3, bCtg4, bCtg5, bCtg6, bCtg7, bCtg8, bAppLogo;
    TextButton.TextButtonStyle bsCtg1, bsCtg2, bsCtg3, bsCtg4, bsCtg5, bsCtg6, bsCtg7, bsCtg8, bsAppLogo;
    BitmapFont font;
    Skin skin;
    TextureAtlas buttonAtlas;


    @Override
    public void create() {
        batch = new SpriteBatch();
        imgBack = new Texture("appbackground.jpg");
        imgCount = new Texture("Counter.png");
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        font = new BitmapFont();
        skin = new Skin();
        buttonAtlas = new TextureAtlas(Gdx.files.internal("ctg.pack"));
        skin.addRegions(buttonAtlas);

        bsCtg1 = new TextButton.TextButtonStyle();
        bsCtg1.font = font;
        bsCtg1.up = skin.getDrawable("ctg1");
        bsCtg1.down = skin.getDrawable("Dctg1");
        bsCtg1.checked = skin.getDrawable("ctg1");
        bCtg1 = new TextButton("", bsCtg1);
        bCtg1.setPosition(1020, 760);
        stage.addActor(bCtg1);

        bsCtg2 = new TextButton.TextButtonStyle();
        bsCtg2.font = font;
        bsCtg2.up = skin.getDrawable("ctg2");
        bsCtg2.down = skin.getDrawable("Dctg2");
        bsCtg2.checked = skin.getDrawable("ctg2");
        bCtg2 = new TextButton("", bsCtg2);
        bCtg2.setPosition(1320, 760);
        stage.addActor(bCtg2);

        bsCtg3 = new TextButton.TextButtonStyle();
        bsCtg3.font = font;
        bsCtg3.up = skin.getDrawable("ctg3");
        bsCtg3.down = skin.getDrawable("Dctg3");
        bsCtg3.checked = skin.getDrawable("ctg3");
        bCtg3 = new TextButton("", bsCtg3);
        bCtg3.setPosition(1020, 440);
        stage.addActor(bCtg3);

        bsCtg4 = new TextButton.TextButtonStyle();
        bsCtg4.font = font;
        bsCtg4.up = skin.getDrawable("ctg4");
        bsCtg4.down = skin.getDrawable("Dctg4");
        bsCtg4.checked = skin.getDrawable("ctg4");
        bCtg4 = new TextButton("", bsCtg4);
        bCtg4.setPosition(1320, 440);
        stage.addActor(bCtg4);

        bsCtg5 = new TextButton.TextButtonStyle();
        bsCtg5.font = font;
        bsCtg5.up = skin.getDrawable("ctg5");
        bsCtg5.down = skin.getDrawable("Dctg5");
        bsCtg5.checked = skin.getDrawable("ctg5");
        bCtg5 = new TextButton("", bsCtg5);
        bCtg5.setPosition(1620, 440);
        stage.addActor(bCtg5);

        bsCtg6 = new TextButton.TextButtonStyle();
        bsCtg6.font = font;
        bsCtg6.up = skin.getDrawable("ctg6");
        bsCtg6.down = skin.getDrawable("Dctg6");
        bsCtg6.checked = skin.getDrawable("ctg6");
        bCtg6 = new TextButton("", bsCtg6);
        bCtg6.setPosition(1020, 120);
        stage.addActor(bCtg6);

        bsCtg7 = new TextButton.TextButtonStyle();
        bsCtg7.font = font;
        bsCtg7.up = skin.getDrawable("ctg7");
        bsCtg7.down = skin.getDrawable("Dctg7");
        bsCtg7.checked = skin.getDrawable("ctg7");
        bCtg7 = new TextButton("", bsCtg7);
        bCtg7.setPosition(1320, 120);
        stage.addActor(bCtg7);

        bsCtg8 = new TextButton.TextButtonStyle();
        bsCtg8.font = font;
        bsCtg8.up = skin.getDrawable("ctg8");
        bsCtg8.down = skin.getDrawable("Dctg8");
        bsCtg8.checked = skin.getDrawable("ctg8");
        bCtg8 = new TextButton("", bsCtg8);
        bCtg8.setPosition(1620, 120);
        stage.addActor(bCtg8);

        bsAppLogo = new TextButton.TextButtonStyle();
        bsAppLogo.font = font;
        bsAppLogo.up = skin.getDrawable("applogo");
        bsAppLogo.down = skin.getDrawable("Dapplogo");
        bsAppLogo.checked = skin.getDrawable("applogo");
        bAppLogo = new TextButton("", bsAppLogo);
        bAppLogo.setPosition(0, 0);
        stage.addActor(bAppLogo);


        //Jash helped us with getting the buttons working.


        bCtg1.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 1 Pressed");
                nBool=0;
            }
        });
        bCtg2.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 2 Pressed");
                nBool=0;
            }
        });
        bCtg3.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 3 Pressed");
                nBool=0;
            }
        });
        bCtg4.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 4 Pressed");
                nBool=0;
            }
        });
        bCtg5.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 5 Pressed");
                nBool=0;
            }
        });
        bCtg6.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 6 Pressed");
                nBool=0;
            }
        });
        bCtg7.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 7 Pressed");
                nBool=0;
            }
        });
        bCtg8.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("Button 8 Pressed");
                nBool=0;
            }
        });
        bAppLogo.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("applogo Pressed");
                nBool=0;
            }
        });
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(imgBack, 0, 0);
        batch.draw(imgCount, 1570, 780);
        batch.end();

        if(nBool==1) {
            batch.begin();
            batch.end();
            super.render();
            stage.draw();
        }
    }


}
