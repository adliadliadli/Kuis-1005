/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1005.repo;

import com.Kuis1005.entity.cv1005;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface cv1005Repo extends CrudRepository<cv1005, Long> {

    @Query("select c from Category c")
    public List<cv1005> findAllcv1005();
}
