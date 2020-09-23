package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.api.IBait;
import ch.heigvd.amt.fishing.equipment.api.IBoat;
import ch.heigvd.amt.fishing.equipment.api.IBoots;
import ch.heigvd.amt.fishing.equipment.api.IFishingRod;

public class Fisherman {
  private IBoots boots;
  private IFishingRod fishingRod;
  private IBait bait;
  private IBoat boat;

  public Fisherman(IBoat boat, IBoots boots, IBait bait, IFishingRod fishingRod) {
    this.boat = boat;
    this.boots = boots;
    this.fishingRod = fishingRod;
    this.bait = bait;
  }

  public Fish goGetFish() {
    boots.wear();
    boat.putOnWater();
    boat.startEngine();
    bait.putOnHook();
    fishingRod.moveUpTheAir();
    Fish fish = fishingRod.pullOutOfWater();
    return fish;
  }

}
