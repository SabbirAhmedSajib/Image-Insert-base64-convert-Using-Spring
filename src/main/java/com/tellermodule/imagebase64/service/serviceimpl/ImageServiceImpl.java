package com.tellermodule.imagebase64.service.serviceimpl;

import com.tellermodule.imagebase64.dto.CommonResponseModelDTO;
import com.tellermodule.imagebase64.dto.ImageDTO;
import com.tellermodule.imagebase64.exception.ResourceNotFoundException;
import com.tellermodule.imagebase64.model.Image;
import com.tellermodule.imagebase64.repository.ImageRepo;
import com.tellermodule.imagebase64.service.ImageService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Base64;


@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepo imageRepo;

    private final ModelMapper modelMapper;

    public ImageServiceImpl(ImageRepo imageRepo, ModelMapper modelMapper) {
        this.imageRepo = imageRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public ImageDTO getImageByID(long imageId) {
        Image image = imageRepo.findById(imageId).orElseThrow(() -> new ResourceNotFoundException("Image", "imageId", imageId));

         return mapToDTO(image);
    }


    @Override
    public CommonResponseModelDTO insertImage(ImageDTO imageDTO) {

        CommonResponseModelDTO commonResponseModel = new CommonResponseModelDTO();
        Image image = imageRepo.save(modelMapper.map(imageDTO, Image.class));

        if (image.getImageId() > 0){
            commonResponseModel.setResponseCode(1);
            commonResponseModel.setResponseMessage("Image Insert Save Successfully");
        }

        return commonResponseModel;
    }




    /*

        @Override
        public ImageDTO getImageByID(long imageId) {
            Image image = imageRepo.findById(imageId).orElseThrow(() -> new ResourceNotFoundException("Image", "imageId", imageId));
            ImageDTO imageDTO =  mapToDTO(image);

            String encoded = Base64.getEncoder().encodeToString(image.getImage());
            System.out.println("encoded = " + encoded);
            imageDTO.setImage(encoded);
            return imageDTO;
        }

     */

    private ImageDTO mapToDTO(Image image){
        ImageDTO imageDTO = modelMapper.map(image, ImageDTO.class);
        return imageDTO;
    }
}