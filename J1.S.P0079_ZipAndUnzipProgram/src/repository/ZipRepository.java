/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.ZipDao;

/**
 *
 * @author Admin
 */
public class ZipRepository implements IZipRepository {
    @Override
    public void compression() {
        if (!ZipDao.Instance().compression()) {
            return;
        }
        System.out.println("Successfully");
    }
    
    @Override
    public void extract() {
        if (!ZipDao.Instance().extraction()) {
            return;
        }
        System.out.println("Successfully");
    }
}
