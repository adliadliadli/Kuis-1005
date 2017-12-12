/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1005.service;

import com.Kuis1005.entity.cv1005;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1005.repo.cv1005Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("cv1005Service")
@Transactional
public class cv1005Service {

    @Autowired
    private cv1005Repo repo;

    public cv1005 insert(cv1005 cv1005) {
        return repo.save(cv1005);
    }
    
    public cv1005 update(cv1005 cv1005) {
        return repo.save(cv1005);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv1005 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv1005> getAll(){
        return repo.findAllcv1005();
    }
}
