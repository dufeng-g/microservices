/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.j2c.bookingcar.domain.repository;

import java.util.Collection;

import com.accenture.j2c.bookingcar.domain.entity.Entity;

/**
 *
 * @author darren.shuxing.liu
 * @param <TE>
 * @param <T>
 */
public interface ReadOnlyRepository<TE extends Entity, T> {

    /**
     *
     * @param id
     * @return
     */
	TE get(T id);

    /**
     *
     * @return
     */
    Collection<TE> getAll();
}
