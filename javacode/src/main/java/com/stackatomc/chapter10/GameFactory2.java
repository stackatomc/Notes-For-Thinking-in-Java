package com.stackatomc.chapter10;

/**
 * @author MayerFang
 * @file GameFactory2
 * @Description 工厂模式和接口修改为匿名内部类实现设计
 * @date 2018/10/15
 */
interface Game{boolean move();}
interface GameFactories{
     Game getGame();}

class Checkers implements Game {

    private int moves=0;
    private static final int MOVES=3;

    @Override
    public boolean move(){
        System.out.println("Checkers move"+moves);
        return ++moves!=3;
    }

    public static GameFactories factories=new GameFactories() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {

    private int moves=0;
    private static final int MOVES=4;
    @Override
    public boolean move(){
        System.out.println("Chess move"+moves);
        return ++moves!=MOVES;
    }

    public static GameFactories factories=new GameFactories() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

public class GameFactory2 {

    public static void playGame(GameFactories factories){
        Game s=factories.getGame();
        while(s.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factories);
        playGame(Chess.factories);
    }


}
