package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Character {
        protected String name;
        protected Integer location;
        protected Integer lifeSpan;
        protected Integer magicEnergy;
        protected String spells;


        //constructor
        public Character() {
        }


        //getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getLocation() {
            return location;
        }

        public void setLocation(Integer location) {
            this.location = location;
        }

        public Integer getLifeSpan() {
            return lifeSpan;
        }

        public void setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        public Integer getMagicEnergy() {
            return magicEnergy;
        }

        public void setMagicEnergy(Integer magicEnergy) {
            this.magicEnergy = magicEnergy;
        }

        public String getSpells() {
            return spells;
        }

        public void setSpells(String spells) {
            this.spells = spells;
        }

        //methods

        public void isDeadOrAlive(boolean dead){
            if (lifeSpan <= 0){
                dead = true;
            }else {
                dead = false;
            }
        }




        // Overrides

        @Override
        public boolean equals(Object obj){
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Character that = (Character) obj;
            return location == that.location &&
                    name.equals(that.name) &&
                    lifeSpan.equals(that.lifeSpan) &&
                    magicEnergy.equals(that.magicEnergy) &&
                    spells.equals(that.spells);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, location, lifeSpan, magicEnergy, spells);
        }

        @Override
        public String toString() {
            return String.format(
                    "Character{ Name= %s \n Location= %d \n Life span= %d \n Magic energy= %d \n Spells= %s \n}",
                    name,
                    location,
                    lifeSpan,
                    magicEnergy,
                    spells);
        }



    }


}
