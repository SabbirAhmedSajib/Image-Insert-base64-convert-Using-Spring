package com.tellermodule.imagebase64.repository;

import com.tellermodule.imagebase64.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image,Long> {
}
