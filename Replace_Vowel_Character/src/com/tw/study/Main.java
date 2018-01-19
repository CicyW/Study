package com.tw.study;

public class Main {
	private static Reader reader;
	
    public static void main(String[] args) {
        Game game = new Game(new FormatCheck(),new PercentageCheck(),new Replace(),new Reader(), new Printer());
        game.start();
    }
}
