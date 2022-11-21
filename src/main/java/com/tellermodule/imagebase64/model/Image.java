package com.tellermodule.imagebase64.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="BAS_IMAGE3" )
public class Image {
    @Id
    @Column(name ="IMAGE_ID" )
    private long imageId;
    @Column(name ="BO_AC_REQ_ID" )
    private long boAcReqId;
    @Column(name ="BRANCD" )
    private String branchCode;
    @Column(name ="IMAGE_TYPE" )
    private String imageType;
    @Column(name = "IMAGE")
    @Lob
    private byte[] image;
    @Column(name ="STATUS" )
    private String status;
    @Column(name ="OPRSTAMP" )
    private String createBy;
    @Column(name = "TIMSTAMP")
    private Timestamp createTime;
    @Column(name = "UPDATE_DY")
    private String updateBy;
    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;
}
