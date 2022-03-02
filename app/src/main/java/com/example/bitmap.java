package com.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class bitmap {

    int height ;
    int width ;
    BufferedImage image;

    public void readData (File bmpFile)  {

        try {
            image = ImageIO.read(bmpFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("image has been read");
        height= image.getHeight();
        width= image.getWidth();
        System.out.println(height+" "+width);

    }
    public void Mirror (){

        for (int i = 0; i < height ; i++) {
            for (int j = 0; j <width ; j++) {
                image.setRGB(i,j,image.getRGB(j,i));
            }
        }
    }
//    public void BW (BufferedImage image){
//        newImage = image ;
//        for (int i = 0; i < height ; i++) {
//            for (int j = 0; j <width ; j++) {
//              
//            }
//        }
//    }

    public void renderImage ( File printingFile){
//        ImageIO.write(image ,"bmp", new File("C:\\Users\\acer\\ASAC\\bitmap-transformer\\app\\src\\main\\resources\\outputImage.bmp"));
        try {
            ImageIO.write(image ,"bmp", printingFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
