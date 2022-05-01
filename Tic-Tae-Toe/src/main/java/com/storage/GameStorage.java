package com.storage;

import com.model.Game;

import java.util.HashMap;
import java.util.Map;

public class GameStorage {

    private static Map<String, Game> games;
    private static GameStorage instance;

    private GameStorage() { // 생성자를 private로 만들어 접근을 막음
        games = new HashMap<>();
    }

    // getinstance : 고정된 메모리영역을 사용하여 메모리 낭비를 줄이고 공통된 객체를 사용할 때 매번 객체를 새로 생성하지 않는 방식
    // getInstance를 통해 한번만 생성된 객체를 가져옴
    public static synchronized GameStorage getInstance() {
        if (instance == null) { //최초 한번만 new 연산자를 통하여 메모리에 할당한다. 이후 getInstance() 메소드에 의해 한번만 할당된 객체의 주소값을 참조함.
            instance = new GameStorage();
        }
        return instance;
    }

    public Map<String, Game> getGames() {
        return games;
    }

    public void setGame(Game game) {
        games.put(game.getGameId(), game);
    }
}
