# Inl-mningsuppgift_1_spel
## Upplägg spel 1 
### Tänkte göra ett spel inspererat från Super Mario
Du möter 10 spelare som ett race. Målet är att komma vidare i varje race tills det sista racet. Du kommer få hjälpmedel på vägen som du kan välja att använda för att ta dig i mål snabbare. 

### Checklista
##### Klasser

- [ ] Race
- [ ] Racers
- [ ] Help
- [ ] Shop (VG)

###### Race (abstract)

- [ ] int finishLine 
- [ ] start 
- [ ] wile logik rounds max 5
- [ ] While logik laps max 3
- [ ] list<Racers>

###### Race 1,2,3 extend (Race)

- [ ] laplonger 
- [ ] higherSpeed

###### Race 4 extend (Race 1,2,3)


###### Racers (abstract)
- [ ] String [] names
- [ ] int hastighet
- [ ] int health
- [ ] status ()
- [ ] takeDamage ()
- [ ] speedBoost ()
- [ ] abstract randomPowers()
- [ ] abstract playerspeed ()

###### Player1 Extend Racers 

- [ ] int suprise 
- [ ] boostHeath ()
- [ ] randomPowers ()
- [ ] playerSpeed ()
- [ ] if suprise: 
  - coin (VG)
  - speedBoost 
  - slowPlayersDown




###### Helper (interface)

- [ ] randomBoot 
- [ ] randomDamage
- [ ] randomSpeed
- [ ] timer 

##### VG 

###### Purchasable (interface)

- [ ] Array Speedboost

- [ ] Array FasterCar