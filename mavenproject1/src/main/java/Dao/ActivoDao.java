/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.awt.List;

/**
 *
 * @author JADPA02
 */
public interface ActivoDao<T> {
    void create(T t);
    List getAll(T t);
   
}
