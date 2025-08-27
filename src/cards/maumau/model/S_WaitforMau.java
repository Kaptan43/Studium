package cards.maumau.model;

public class S_WaitforMau extends PlayerState {

    S_WaitforMau(PlayerHandler playerHandler) {
        super(playerHandler);
    }

    @Override
    void mau(Player p) {
        if(p == playerHandler.getRemember()){
            playerHandler.setRemember(null);
            playerHandler.setState(new S_WaitForNextTurn(playerHandler));
        }
    }

    @Override
    void nextTurn(int n){
        //"Mau" verpasst --> Strafe, dann normal weiter
        final Player r = playerHandler.getRemember();
        if(r != null) r.drawCards(1);
        playerHandler.setRemember(null);
        playerHandler.doLocalNextTurn(n);
        playerHandler.setState(new S_WaitForNextTurn(playerHandler));
    }

}
