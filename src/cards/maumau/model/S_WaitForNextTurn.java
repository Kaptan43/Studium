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
            playerHandler.setState(new S_WaitforMau(playerHandler));
            return;
        }

        if(hand == 0){
            playerHandler.setRemember(current);
            playerHandler.setState(new S_WaitforMauMau(playerHandler));
            return;
        }

        //OTHERWISE
        playerHandler.doLocalNextTurn(n);
    }
}
