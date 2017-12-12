/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1005.service;

import com.Kuis1005.entity.nilai1005;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1005.repo.nilai1005Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai1005Service")
@Transactional
public class nilai1005Service {

    @Autowired
    private nilai1005Repo repo;

    public nilai1005 insertOrUpdate(nilai1005 nilai1005) {
        return repo.save(nilai1005);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<nilai1005> findAll() {
        return repo.findAllNilai_1005();
    }

    public List<nilai1005> findByCv_1005(Long nilai1005Id) {
        return repo.findByCv_1005(nilai1005Id);
    }

    public List<nilai1005> findByNama(String nama) {
        return repo.findByNama("%" + nama + "%");
    }
}
