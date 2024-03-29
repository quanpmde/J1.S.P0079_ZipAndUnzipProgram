/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.ZipRepository;
import view.Menu;

/**
 *
 * @author Admin
 */
public class ZipController extends Menu {

    protected static String[] mc = {"Compression", "Extraction", "Exit"};
    protected ZipRepository repo;

    public ZipController() {
        super("========== Zipper Program =========", mc);
        repo = new ZipRepository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:{
                System.out.println("---------- Compression --------");
                repo.compression();
                break;
            }
            case 2:{
                System.out.println("---------- Extraction ---------");
                repo.extract();
                break;
            }
            case 3:{
                System.out.println("EXIT...");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice");
            }
        }
    }
}