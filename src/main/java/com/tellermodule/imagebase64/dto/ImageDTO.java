package com.tellermodule.imagebase64.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ImageDTO {
    private long imageId;

    private long boAcReqId;

    private String branchCode;

    private String imageType;

//    private String image;

    private byte[] image;

    private String status;

    private String operationStamp;

    private Timestamp timeStamp;

    private String updateBy;

    private Timestamp updateDate;
}
