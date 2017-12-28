/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.j2c.bookingcar.domain.repository;
import java.util.Collection;

import com.accenture.j2c.bookingcar.domain.entity.Driver;

/**
 *司机存储库
 * @author darren.shuxing.liu
 * @param <Driver>
 * @param <String>
 */
public interface DriverRepository<TE extends Driver, String> extends Repository<TE, String> {

    /**
     *
     * @param name
     * @return
     */
    boolean containsName(String name);

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public Collection<Driver> findByName(String name) throws Exception;
}
