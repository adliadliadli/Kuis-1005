/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1005.controller;

import com.Kuis1005.entity.nilai1005;
import com.Kuis1005.service.nilai1005Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Kuis1005.repo.nilai1005Repo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/nilai1005")
public class nilai1005Controller {
    
    @Autowired
    private nilai1005Service nilai1005Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai1005 insertOrUpdate(@RequestBody nilai1005 nilai1005){
        return nilai1005Service.insertOrUpdate(nilai1005);
    }
  
}
