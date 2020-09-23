package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.api.IBait;
import ch.heigvd.amt.fishing.equipment.api.IBoat;
import ch.heigvd.amt.fishing.equipment.api.IBoots;
import ch.heigvd.amt.fishing.equipment.api.IFishingRod;
import ch.heigvd.amt.fishing.equipment.impl.Bait;
import ch.heigvd.amt.fishing.equipment.impl.Boat;
import ch.heigvd.amt.fishing.equipment.impl.Boots;
import ch.heigvd.amt.fishing.equipment.impl.FishingRod;

public class God {
    private Fisherman fisherman;

    public void createWorld() {
        IBoat boat = new Boat();
        IBoots boots = new Boots();
        IFishingRod fishingRod = new FishingRod();
        IBait bait = new Bait();
        this.fisherman = new Fisherman(boat, boots, bait, fishingRod);
    }

    public Fisherman lookupFisherman() {
        return fisherman;
    }
}
