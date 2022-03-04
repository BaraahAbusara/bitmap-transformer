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

    public void readData (File bmpFile)  { //https://dyclassroom.com/image-processing-project/how-to-read-and-write-image-file-in-java

        try {
            image = ImageIO.read(bmpFile);
            System.out.println("image has been read");
        } catch (IOException e) {
            e.printStackTrace();
        }
        height= image.getHeight();
        width= image.getWidth();
        System.out.println(height+" "+width);

    }

    public BufferedImage Mirror (){
        if(width != height )
        {
            System.out.println("Error, Please enter a squared picture");
            return image;
        }
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j <width ; j++) {
                image.setRGB(i,j,image.getRGB(j,i));
            }
        }
        System.out.println("Image has been Mirror-ed");
        return image ;

    }
    public BufferedImage Rotate180 (){  //got help from https://www.delftstack.com/howto/java/java-rotate-image/

        int widthOfImage = image.getWidth();
        int heightOfImage = image.getHeight();
        int typeOfImage = image.getType();

        BufferedImage newImageFromBuffer = new BufferedImage(widthOfImage, heightOfImage, typeOfImage);
        Graphics2D graphics2D = newImageFromBuffer.createGraphics();

        graphics2D.rotate(Math.toRadians(180), widthOfImage , heightOfImage );
        graphics2D.drawImage(image, null, widthOfImage, heightOfImage);

        System.out.println("Image has been Rotate-ed");

        return newImageFromBuffer;

    }
    public BufferedImage BlackAndWhite () // https://memorynotfound.com/convert-image-grayscale-java/
    {
        BufferedImage result = new BufferedImage(
                image.getWidth(),
                image.getHeight(),
                BufferedImage.TYPE_INT_RGB);

        Graphics2D graphic = result.createGraphics();
        graphic.drawImage(image, 0, 0, Color.WHITE, null);
        for (int i = 0; i < result.getHeight(); i++) {
            for (int j = 0; j < result.getWidth(); j++) {
                Color c = new Color(result.getRGB(j, i));
                int red = (int) (c.getRed() * 0.299);
                int green = (int) (c.getGreen() * 0.587);
                int blue = (int) (c.getBlue() * 0.114);
                Color newColor = new Color(
                        red + green + blue,
                        red + green + blue,
                        red + green + blue);
                result.setRGB(j, i, newColor.getRGB());
            }
        }
        System.out.println("Image has been BlackAndWhite-ed");

        return result ;
    }

    public void renderImage ( File printingFile , BufferedImage imageToPrint ){
//        ImageIO.write(image ,"bmp", new File("C:\\Users\\acer\\ASAC\\bitmap-transformer\\app\\src\\main\\resources\\outputImage.bmp"));
        try {
            ImageIO.write(imageToPrint ,"bmp", printingFile);
            System.out.println("Image has been render-ed");

        } catch (IOException err) {
            System.out.println("Error: "+err);
        }

    }




}
