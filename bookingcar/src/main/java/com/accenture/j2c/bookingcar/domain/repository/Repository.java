/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.j2c.bookingcar.domain.repository;

import com.accenture.j2c.bookingcar.domain.entity.Entity;

/**
 *
 * @author darren.shuxing.liu
 * @param <TE>
 * @param <T>
 */
public interface Repository<TE extends Entity, T> extends ReadOnlyRepository<TE, T> {

    /**
     *
     * @param entity
     */
    void add(TE entity);

    /**
     *
     * @param id
     */
    void remove(T id);

    /**
     *
     * @param entity
     */
    void update(TE entity);  

}