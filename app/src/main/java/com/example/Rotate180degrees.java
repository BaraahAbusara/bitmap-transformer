package com.example;

import java.awt.image.BufferedImage;
import java.io.File;

public class Rotate180degrees {

    public static BufferedImage Rotate180Degrees (BufferedImage image){
        BufferedImage rotatedImage = new BufferedImage(image.getHeight(),image.getWidth(),image.getType());
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                rotatedImage.setRGB(j,i,image.getRGB(i,j));
            }
        }
        return rotatedImage;
    }
}
