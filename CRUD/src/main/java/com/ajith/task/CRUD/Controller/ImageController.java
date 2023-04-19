package com.ajith.task.CRUD.Controller;

import com.ajith.task.CRUD.Entity.Image;
import com.ajith.task.CRUD.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/demo_app/v1")
public class ImageController {
    @Autowired
    ImageRepository imageRepository;

    @PostMapping(value = "/images")
    public ResponseEntity<Image> uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        /**
         * Reading the file/image  into binary array of data
         */
        byte[] imageData= file.getBytes();

        /**
         * Create the image
         */
        Image image=new Image();

        image.setData(imageData);

        //upload the image to db

      Image savedImage=  imageRepository.save(image);

      return ResponseEntity.ok(savedImage);



    }
    /**
     * serve the uploaded image
     * GET http://localhost:8080/images/{imageId}
     *
     * response-> render the image
     */

    @GetMapping(value = "/images/{id}")
    public ResponseEntity<byte[]> getImageById( @PathVariable(name = "id") int id)
    {
      Optional<Image> optionalImage= imageRepository.findById(id);

      if(optionalImage.isPresent())
      {
          /**
           * Render the image
           */
          // read the image data into byte array
          byte[] imageData=optionalImage.get().getData();

          // pass the imageData into response body
          //set the Media type to Image

         return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageData);



      }
      else {
          /**
           * Say image not found
           */
          return ResponseEntity.notFound().build();

      }

    }
}
