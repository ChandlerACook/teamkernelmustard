package tkm;

import tkm.gamelogic.Card;

/**
 * MurderDeck class holds the solution deck that 
 * consists of the correct suspect, weapon, and room.
 * Created by justin 10/19/2024
 */

public class MurderDeck {
    private Card correctSuspect;
    private Card correctWeapon;
    private Card correctRoom;

    public MurderDeck() {
        // Mock solution for now
        correctSuspect = new Card("Mr. Green", 1);
        correctWeapon = new Card("Revolver", 2);
        correctRoom = new Card("Library", 3);
    }

    public boolean checkAccusation(Card suspect, Card weapon, Card room) {
        return suspect.getName().equals(correctSuspect.getName()) &&
                weapon.getName().equals(correctWeapon.getName()) &&
                room.getName().equals(correctRoom.getName());
    }

    public boolean checkSuggestion(Card suspect, Card weapon, Card room) {
        // Suggestion check logic
        return suspect.getName().equals(correctSuspect.getName()) ||
                weapon.getName().equals(correctWeapon.getName()) ||
                room.getName().equals(correctRoom.getName());
    }
}