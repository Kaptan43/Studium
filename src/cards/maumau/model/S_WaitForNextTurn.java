package cards.maumau.model;

public class S_WaitForNextTurn extends PlayerState {

    S_WaitForNextTurn(PlayerHandler playerHandler) {
        super(playerHandler);
    }

    @Override
    void nextTurn(int n){
        final Player current = playerHandler.getCurrentPlayer();
        if(current == null) return;

        final int hand = current.getCards().size();

        if(hand == 1){
            playerHandler.setRemember(current);
            playerHandler.doLocalNextTurn(n);
            playerHandler.setState(new S_WaitForMau(playerHandler));
            return;
        }

        if(hand == 0){
            playerHandler.setRemember(current);
            playerHandler.doLocalNextTurn(n);
            playerHandler.setState(new S_WaitForMauMau(playerHandler));
            return;
        }

        //OTHERWISE
        playerHandler.doLocalNextTurn(n);
        //playerHandler.setState(new S_WaitForNextTurn(playerHandler));    --> Unnötig, da ich mich in dem S_WaitForNextTurn bereits befinde!
    }

}
