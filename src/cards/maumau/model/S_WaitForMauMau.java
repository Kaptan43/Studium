package cards.maumau.model;

public class S_WaitForMauMau extends PlayerState{

    S_WaitForMauMau(PlayerHandler playerHandler){
        super(playerHandler);
    }

    @Override
    void maumau(Player p){
        if(p == playerHandler.getRemember()){

            //Spieler fertig machen
            playerHandler.doFinishPlayer(p);
            playerHandler.setRemember(null);

            //Prüfen, ob das Spiel vorbei ist
            if(playerHandler.isFinished()){
                playerHandler.setState(new S_Finished(playerHandler));
            }
            else {
                playerHandler.setState(new S_WaitForNextTurn(playerHandler));
            }
        }
    }

    @Override
    void nextTurn(int n){
        //MauMau nicht rechtzeitig gesagt -> Strafe
        Player p = playerHandler.getRemember();
        if(p != null){
            p.drawCards(1);
        }
        playerHandler.setRemember(null);

        //dann normal weiterdrehen
        playerHandler.doLocalNextTurn(n);
        playerHandler.setState(new S_WaitForNextTurn(playerHandler));
    }

}
