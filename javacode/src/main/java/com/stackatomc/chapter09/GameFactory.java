package com.stackatomc.chapter09;

/**
 * @author MayerFang
 * @file GameFactory
 * @Description 工厂模式与接口
 * @date 2018/10/15
 */

interface Game{boolean move();}
interface GameFactories{Game getGame();}

class Checkers implements Game{

    private int moves=0;
    private static final int MOVES=3;

    @Override
    public boolean move(){
        System.out.println("Checkers move"+moves);
        return ++moves!=3;
    }
}

class CheckersFactory implements GameFactories{
    @Override
    public Game getGame(){
        return new Checkers();
    }
}

class Chess implements Game{

    private int moves=0;
    private static final int MOVES=4;
    @Override
    public boolean move(){
        System.out.println("Chess move"+moves);
        return ++moves!=MOVES;
    }
}

class ChessFactory implements GameFactories{
    @Override
    public Game getGame(){
        return new Chess();
    }
}

public class GameFactory {

    public static void playGame(GameFactories factories){
        Game s=factories.getGame();
        while(s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }


}
