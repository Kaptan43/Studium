package cards.maumau.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Handles players in a MauMau game.
 */
class PlayerHandler {
    private final MauMau game;
    private final List<Player> players = new LinkedList<>();
    private final List<Player> ranking = new ArrayList<>();
    private Player remember;

    private boolean finished = false;
    private PlayerState state = new S_WaitForNextTurn(this);

    /**
     * Constructs a PlayerHandler for the specified MauMau game.
     *
     * @param game The MauMau game instance.
     */
    PlayerHandler(MauMau game) {
        this.game = game;
    }

    Player getRemember() {
        return remember;
    }

    void setRemember(Player remember) {
        this.remember = remember;
    }

    void setState(PlayerState state) {
        this.state = state;
    }

    /**
     * Initiates the next turn in the game.
     *
     * @param n The number of turns to proceed.
     */
    void nextTurn(int n) {
        //TODO implement
        state.nextTurn(n);
    }

    /**
     * Handles a player calling "Mau".
     *
     * @param p The player calling "Mau".
     */
    void mau(Player p) {
        //TODO implement
        state.mau(p);
    }

    /**
     * Handles a player calling "Mau-Mau".
     *
     * @param p The player calling "Mau-Mau".
     */
    void maumau(Player p) {
        //TODO implement
        state.maumau(p);
    }

    /**
     * Returns the list of players participating in the game.
     *
     * @return The list of players.
     */
    List<Player> getPlayers() {
        return players;
    }

    /**
     * Returns the ranking of players based on the order they finished the game.
     *
     * @return The ranking of players.
     */
    List<Player> getRanking() {
        return ranking;
    }

    /**
     * Adds a player to the game.
     *
     * @param player The player to add.
     * @throws IllegalArgumentException if a player with the same name already exists.
     */
    void addPlayer(Player player) {
        //TODO implement
        for(Player  p : players) {
            if(p.getName().equals(player.getName())) {
                throw new IllegalArgumentException("Spieler existiert bereits" + p.getName());
            }
        }
        players.add(player);
    }

    /**
     * Moves to the next player's turn in the game.
     *
     * @param n The number of turns to proceed.
     */
    private void localNextTurn(int n) {
        //TODO implement
        for(int i = 0; i < n; i++) {
            if(players.isEmpty()) return;
            players.addLast(players.removeFirst());
        }
    }

    void doLocalNextTurn(int n) {
        localNextTurn(n);
    }

    void doFinishPlayer(Player p) {
        finishPlayer(p);
    }

    /**
     * Finishes a player's participation in the game.
     *
     * @param p The player to finish.
     */
    private void finishPlayer(Player p) {
        if (players.remove(p)) {
            ranking.add(p);
        }

        if (players.size() == 1) {
            ranking.add(players.get(0));
            finished = true;
            game.getActionHandler().finishGame();
            players.clear();
        }
    }

    boolean isFinished() {
        return finished;
    }

    /**
     * Returns the current player whose turn it is.
     *
     * @return The current player.
     */
    Player getCurrentPlayer() {
        return players.isEmpty() ? null : players.getFirst();
    }
}
