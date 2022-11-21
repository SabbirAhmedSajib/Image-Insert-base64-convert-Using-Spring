package com.tellermodule.imagebase64.service;

import com.tellermodule.imagebase64.dto.CommonResponseModelDTO;
import com.tellermodule.imagebase64.dto.ImageDTO;

public interface ImageService {

    ImageDTO getImageByID(long imageId);

    CommonResponseModelDTO insertImage(ImageDTO imageDTO);

}
