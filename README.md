# bitmap-transformer
In this Project I will be building a bitmap (.bmp) transformer CLI.

In this project I managed to do the following :
- read a .bmp image.
- Do different transformations on the image such as : 
  1. Mirror: will mirror the picture diagonally , to use this transformation your image must be in size of a square or will not be mirrored. 
  2. Rotate : will rotate the picture 180 degrees.
  3. BlackAndWhite : will change the picture colors into black and white. 
- write the transformed image into a .bmp file. 

To test my project you can run your own test using the following command:  
`./gradlew run --args 'pictureReadingPath pictureRenderingPath transformation'`  
you can try this one as an example that will render a black and white image in the main resources file :  
`./gradlew run --args '/mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/MARBLES.dib /mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/outputImage.bmp BlackAndWhite'`  
to Mirror it (It will not be mirrored because it is not in a square size):
`./gradlew run --args '/mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/MARBLES.dib /mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/outputImage.bmp Mirror'`  
this one will be mirrored :  
`./gradlew run --args '/mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/MARBLESsquare.dib /mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/outputImage.bmp Mirror'`    
and for the rotating :  
`./gradlew run --args '/mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/MARBLESsquare.dib /mnt/c/Users/acer/ASAC/bitmap-transformer/app/src/main/resources/outputImage.bmp Rotate'`