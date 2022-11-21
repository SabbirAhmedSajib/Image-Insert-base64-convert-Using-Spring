package com.tellermodule.imagebase64.controller;


import com.tellermodule.imagebase64.dto.CommonResponseModelDTO;
import com.tellermodule.imagebase64.dto.ImageDTO;
import com.tellermodule.imagebase64.service.ImageService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://192.168.88.122:4200/", allowedHeaders = "*")
@RestController
@RequestMapping("/Teller/v1/Image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/{imageId}")
    private ImageDTO getImageByID(@PathVariable Long imageId){
        return imageService.getImageByID(imageId);
    }


    @PostMapping()
    public CommonResponseModelDTO addInsert(@RequestBody ImageDTO imageDTO) {
        return imageService.insertImage(imageDTO);
    }

}
