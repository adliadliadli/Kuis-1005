/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1005.controller;

import com.Kuis1005.entity.cv1005;
import com.Kuis1005.service.cv1005Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv1005")
public class cv1005Controller {

    @Autowired
    private cv1005Service cv1005Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv1005 insert(@RequestBody cv1005 cv1005) {
        return cv1005Service.insert(cv1005);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv1005 update(@RequestBody cv1005 cv1005) {
        return cv1005Service.update(cv1005);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv1005Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv1005 getById(@PathVariable("id") Long id){
        return cv1005Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv1005> getAll(){
        return cv1005Service.getAll();
    }
}
