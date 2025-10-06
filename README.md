# Inl-mningsuppgift_1_spel
## Upplägg spel 1 
### Tänkte göra ett spel inspererat från Super Mario
Du möter 4 spelare som ett race. Målet är att komma först i varje race och samla så mycket poäng som möjligt. Du kommer få hjälpmedel på vägen som du kan välja att använda för att ta dig i mål snabbare. 

### Checklista

 ---------

##### Klasser

- [ ] Race
- [ ] Racers
- [ ] Settings 
- [ ] Opptions 
- [ ] Shop (VG)

###### Race (abstract)

- [ ] ArrayList<Racers>
- [ ] int totalRounds
- [ ] int lapsPerRound
- [ ] int lapDistance
- [ ] int finishLine 

- [ ] public void nameRacer
- [ ] public void box

###### Laps extend (Race)

- [ ] public void eachLap 
- [ ] public boolean finishLap
- [ ] public void lapResult(int round)
- [ ] public void pointsForRounds 

###### Rounds extend (Lap)

- [ ] public void eachRounds 

###### TheRace extend (Lap)

- [ ] public void startRace
- [ ] public void standings
- [ ] public void theWinner

---------

###### Racers (abstract)
- [ ] String Name
- [ ] int speed
- [ ] int carHealth
- [ ] int coins
- [ ] int totalsPoints
- [ ] int lapLeft

- [ ] public String getName
- [ ] int getSpeed
- [ ] int getCarHealth
- [ ] int getCoins
- [ ] int getTotalPoints
- [ ] int getLapleft

- [ ] public boolen carHealthIsFunctional
- [ ] public void resetLap
- [ ] public void addLap
- [ ] public void addPoints
- [ ] public void addCoins

- [ ] public void roundNew
- [ ] public void increaseSpeed

- [ ] abstract takeDamage 
- [ ] abstract speedBoost 
- [ ] abstract playerspeed 
- [ ] abstract coinsCollected

###### Racer1 Extend Racers 

- [ ] public void setCarHealth
- [ ] public void setSpeed

- [ ] abstract takeDamage
- [ ] abstract speedBoost
- [ ] abstract playerspeed
- [ ] abstract coinsCollected


###### OtherRacers extend Racers

- [ ] abstract takeDamage
- [ ] abstract speedBoost
- [ ] abstract playerspeed
- [ ] abstract coinsCollected

------------

###### Settings (interface)

- [ ] static int randomSpeed
- [ ] static int randomBoos
- [ ] static int randomDamage
- [ ] static void slowDownText
- [ ] static int coinsRandom
- [ ] static int damageRandom

-------

###### Options

- [ ] readInt
- [ ] huvudmeny
- [ ] kontroll 

###### Shop extends Options (VG)

- [ ] readInt
- [ ] public void chooseCar
- [ ] public void shop1

- [ ] public void car1
- [ ] public void car1Install
- [ ] public void buy1
- 
- [ ] public void car2
- [ ] public void car2Install
- [ ] public void buy2

- [ ] public void car3
- [ ] public void car3Install
- [ ] public void buy3


