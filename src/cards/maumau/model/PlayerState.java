package cards.maumau.model;

public abstract class PlayerState{

    protected PlayerHandler playerHandler;

    public PlayerState(PlayerHandler playerHandler) {
        this.playerHandler = playerHandler;
    }

    void nextTurn(int n){};
    void mau(Player p){};
    void maumau(Player p){};


}
