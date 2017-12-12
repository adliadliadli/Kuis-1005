/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1005.repo;

import com.Kuis1005.entity.nilai1005;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface nilai1005Repo extends CrudRepository<nilai1005, Long>{
    
    @Query("select p from nilai_1005 p")
    public List<nilai1005> findAllNilai_1005();
    
    @Query("select p from nilai_1005 p where p.cv_1005.id= :id")
    public List<nilai1005> findByCv_1005(@Param("id") Long id);
    
    @Query("select p from nilai_1005 p where LOWER(p.nama) LIKE LOWER(:nama)")
    public List<nilai1005> findByNama(@Param("nama") String nama);
}
