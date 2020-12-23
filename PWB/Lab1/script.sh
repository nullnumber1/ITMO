#!/bin/sh
mkdir vanillite3
mkdir spearow7
mkdir wormadam0
touch haxorus3
touch magcargo0
touch whiscash6

cd spearow7
mkdir poochyena
mkdir zweilous
mkdir grimer
touch charizard
touch jumpluff 

cd ..
cd vanillite3
mkdir meditite
mkdir golett
mkdir drowsee
mkdir taillow
mkdir sunkern
touch weavile

cd ..
cd wormadam0
mkdir metang
mkdir houndoom
touch gulpin
touch pansear
                     
cd ..
echo Живет Cave Mountain” > haxorus3

echo Overland=3 Jump=1 Power=3 Intelligence=4 Egg Warmer=0 Firestarter=0 Heater=0 Sinker=0 > magcargo0

echo Тип диеты Herbivore > whiscash6

cd spearow7
echo Ходы Air Cutter Air Slash‡ Blast Burn Body Slam Counter Defense Curl Double-Edge Dragon Claw‡ Dragon Pulse Dynamicpunch Fire Pledge Fire Punch Focus Punch Fury Cutter Growl Heat Wave Iron Tail Mega Kick Mega Punch Metal Claw Mud-Slap Ominous Wind Outrage Rage Roost Seismic Toss Shadow Claw‡ Sleep Talk Snore Steel Wing Swift Tailwind Thunderpunch Twister > charizard

echo Способности Synthesis Tail Whip Tackle Poisonpowder Stun Spore Sleep Powder Bullet Seed Leech Seed Mega Drain Acrobatics Rage Powder Cotton Spore U-Turn Worry Seed Giga Drain Bounce Memento > jumpluff
 
cd ..
cd vanillite3
echo Ходы Assurance‡ Avalanche Dark Pulse Defense Curl Double-Edge Dynamicpunch Embargo‡ Focus Punch Foul Play Fury Cutter Ice Punch Icy Wind Iron Tail Knock Off Low Kick Mud-Slap Revenge‡ Sleep Talk Snatch Snore Spite Swift Taunt‡ > weavile

cd .. 
cd wormadam0
echo Ходы Body Slam Bullet Seed Counter Defense Curl Double-Edge Dynamicpunch Fire Punch Gastro Acid Giga Drain Gunk Shot Ice Punch Mud-Slap Pain Split Rollout Seed Bomb Shock Wave Sleep Talk Snatch Snore Thunderpunch Water > gulpin

echo Способности Blaze Gluttony Inner Focus > pansear
cd ..

chmod 444 haxorus3
chmod 604 magcargo0
chmod 755 spearow7
chmod 752 vanillite3
chmod 620 whiscash6
chmod 555 wormadam0
cd spearow7
chmod 004 charizard
chmod 577 poochyena
chmod 361 zweilous
chmod 640 jumpluff
chmod 333 grimer
cd ..
cd vanillite3
chmod 570 meditite
chmod 444 weavile
chmod 333 golett
chmod 357 drowsee
chmod 737 taillow
chmod 524 sunkern
cd ..
cd wormadam0
chmod 400 gulpin
chmod 737 metang
chmod 315 houndoom
chmod 664 pansear

cd ~
ln -s /home/s307360/lab0/whiscash6 lab0/wormadam0/pansearwhiscash 
cat magcargo0 > vanillite3/weavilemagcargo
chmod u+r wormadam0
ln -s /home/s307360/lab0/wormadam0 Copy_43
chmod u-r wormadam0 
chmod u+r spearow7/charizard
cat spearow7/charizard spearow7/charizard > magcargo0_98
chmod u-r spearow7/Charizard
chmod u+r vanillite3/golett
chmod u+r vanillite3/drowse
cp -r vanillite3 wormadam0/houndoom
chmod u-r vanillite3/golett
chmod u-r vanillite3/golett
ln magcargo0 wormadam0/pansearmagcargo 
cp magcargo0 vanillite3/golett

wc * 2>/dev/null|sort -n
ls -lR 2>/tmp/err|egrep 'd|-'|grep "..:.. s"|head -2
cat $(ls -R 2>&1|grep "^s"|sort -r)
ls -Rt|grep "^w"
cat -n spearow7/jumpluff vanillite3/weavile 2>/dev/null|grep -v De
ls -Rl 2>&1|grep '3$'|grep -v total|sort -k 2n

rm whiscash6
rm spearow7/jumpluff
rm (ls -R|grep Copy_*)
rm (ls -R|grep pansearmagcar*)
rmdir wormadam0
rmdir wormadam0/houndoom