/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import input.InputHandler;
import java.awt.Canvas;
import java.awt.Dimension;

/**
 *
 * @author Senai
 */
public class Game extends Canvas implements Runnable {
    static final int originalTileSize = 16;
    public static int scale = 3;
    public static final int TILE = originalTileSize * scale, maxScreenCol = 16, maxScreenRow = 12;
    public static final int HEIGHT = TILE * maxScreenRow, WIDTH = TILE * maxScreenCol;
    
    private static boolean running;
    
    private Thread thread;
    private Game game;
    private InputHandler input;
    
    /*
        Construtor principal da classe
    */
    public Game() {
        Dimension size = new Dimension(WIDTH, HEIGHT);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
        game = new Game();
        input = new InputHandler();
        addKeyListener(input);
    }
    
    @Override
    public void run() {
        while (running) {

        }
    }

    public void start() {
        if (running) return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        if (!running) return;
        running = false;
        try {
            thread.join();
        } catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    public void tick() {
        
    }
    
    public void render() {
        
    }
}
