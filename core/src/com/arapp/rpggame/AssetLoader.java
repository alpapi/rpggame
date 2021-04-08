package com.arapp.rpggame;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class AssetLoader {

    private static AssetLoader instance = new AssetLoader();
    private AssetManager assetManager = new AssetManager();

    private AssetLoader() {

    }

    public Texture getPlayer() {
        return assetManager.get("player.png", Texture.class);
    }

    public AssetManager getAssetManager() {
        return assetManager;
    }

    public void load(){
        assetManager.load("player.png", Texture.class);
        assetManager.finishLoading();
    }

    public void dispose(){
        assetManager.unload("player.png");
    }

    public static AssetLoader getInstance() {
        return instance;
    }
}
