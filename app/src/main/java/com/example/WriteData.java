package com.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class WriteData<bufferedImage> {
    public static void writeData (RenderedImage image , File path) throws IOException {
        try{
            File file = new File(String.valueOf(path));
            ImageIO.write((RenderedImage) image, "BMP", file);

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

    }

}
// https://blog.idrsolutions.com/2018/08/how-to-write-bmp-images-in-java/