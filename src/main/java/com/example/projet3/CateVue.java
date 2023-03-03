package com.example.projet3;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CateVue extends ImageView {

    public CateVue (){
        this.setImage(new Image("file:src/main/resources/com/example/projet3/yugiyoBack.jpeg"));
        this.setFitHeight(150);
        this.setFitWidth(100);
    }


}
