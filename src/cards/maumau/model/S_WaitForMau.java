package cards.maumau.model;

public class S_WaitForMau extends PlayerState {

    S_WaitForMau(PlayerHandler playerHandler) {
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
        final Player p = playerHandler.getRemember();
        if(p != null) p.drawCards(1);
        playerHandler.setRemember(null);
        playerHandler.doLocalNextTurn(n);
        playerHandler.setState(new S_WaitForNextTurn(playerHandler));
    }

}
