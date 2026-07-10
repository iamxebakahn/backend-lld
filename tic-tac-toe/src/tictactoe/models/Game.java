package tictactoe.models;

import tictactoe.factories.WinningStrategyFactory;
import tictactoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    GameState gameState;
    Player winner;
    Integer nextPlayerindex;
    List<Move> moves;
    List<WinningStrategy> winningStrategies;

    private Game(Integer size, List<Player> players, List<WinningStrategyType> winningStrategiesTypes ){
        //Validation can be done here
        this.board = new Board(size);
        this.players = players;
        this.winningStrategies = new ArrayList<>();
        for(WinningStrategyType winningStrategyType: winningStrategiesTypes){
            this.winningStrategies.add(WinningStrategyFactory.getWinningStrategy(winningStrategyType));
        }
        this.gameState=GameState.IN_PROGRESS;
        this.winner=null;
        this.nextPlayerindex=0;
        this.moves=new ArrayList<>();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public Integer getNextPlayerindex() {
        return nextPlayerindex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setNextPlayerindex(Integer nextPlayerindex) {
        this.nextPlayerindex = nextPlayerindex;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public static class Builder(){
        Integer size;
        List<Player> players;
        List<WinningStrategyType> winningStrategiesTypes;

        public Integer getSize() {
            return size;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategyType> getWinningStrategiesTypes() {
            return winningStrategiesTypes;
        }

        public Builder setWinningStrategiesTypes(List<WinningStrategyType> winningStrategiesTypes) {
            this.winningStrategiesTypes = winningStrategiesTypes;
            return this;
        }

        //build class - we will create object of Game
        public Game build(){
            //Validation can be done here - will do this later
            return new Game(size,players,winningStrategiesTypes);
        }
    }
}
