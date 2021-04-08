package com.arapp.rpggame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {

    private static final float SPEED = 250;
    private Texture texture;
    private float x;
    private float y;

    public Player(){
        texture = AssetLoader.getInstance().getPlayer();
        this.x = 200;
        this.y = 50;
    }

    public void render(SpriteBatch batch){
        batch.draw(texture, x, y);
    }

    public void update(){
        if(Gdx.input.isKeyPressed(Input.Keys.W))
            y += Gdx.graphics.getDeltaTime() * SPEED;
        if(Gdx.input.isKeyPressed(Input.Keys.S))
            y -= Gdx.graphics.getDeltaTime() * SPEED;
        if(Gdx.input.isKeyPressed(Input.Keys.A))
            x -= Gdx.graphics.getDeltaTime() * SPEED;
        if(Gdx.input.isKeyPressed(Input.Keys.D))
            x += Gdx.graphics.getDeltaTime() * SPEED;
    }

    public void dispose(){

    }
}
