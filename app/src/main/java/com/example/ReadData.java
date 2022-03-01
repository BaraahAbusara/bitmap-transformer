package com.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadData {
    public static BufferedImage readData (File bmpFile) throws IOException {
    //    File bmpFile= new File ("app/src/main/resources/MARBLES.dib");
        BufferedImage image = ImageIO.read(bmpFile);
        System.out.println("image has been read");
        return image ;
    }
}
// https://blog.idrsolutions.com/2017/03/how-to-read-bmp-images-in-java/
