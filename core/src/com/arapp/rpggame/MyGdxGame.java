package com.arapp.rpggame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {

	private SpriteBatch batch;
	private OrthographicCamera camera;
	private Player player;

	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		AssetLoader.getInstance().load();
		player = new Player();
	}

	@Override
	public void render () {
		update();
		ScreenUtils.clear(0, 0, 0.2f, 1);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		player.render(batch);
		batch.end();
	}

	public void update(){
		player.update();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		AssetLoader.getInstance().dispose();
	}
}
