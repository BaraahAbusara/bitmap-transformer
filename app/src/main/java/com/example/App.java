/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

//        bitmap outputImage = new bitmap("ouputImage.bmp");
//        System.out.println("Please enter your image path");
//        Scanner scanner = new Scanner(System.in);
//        File bmpFile= new File(scanner.nextLine());
//
//        System.out.println("Please enter your image printing path");
//        File printingFile = new File(scanner.nextLine());
//
//        System.out.println("Please enter your transformation");
//        String transformation = new String(scanner.nextLine());
//        inputImage.readData(new File("C:\\Users\\acer\\ASAC\\bitmap-transformer\\app\\src\\main\\resources\\MARBLESsquare.dib"));

        bitmap inputImage = new bitmap();
        inputImage.readData(new File(args[0]));

        if(args[2].equals("Mirror"))
            inputImage.renderImage(new File(args[1]),inputImage.Mirror());

        if(args[2].equals("Rotate"))
        {
            inputImage.renderImage(new File(args[1]),inputImage.Rotate180());
        }
        if(args[2].equals("BlackAndWhite"))
            inputImage.renderImage(new File(args[1]),inputImage.BlackAndWhite());



        


    }
}
