# Käyttöohje

## Ohjelman suorittaminen

Ohjelma voidaan suorittaa lataamalla release omalle tietokoneelle:
https://github.com/viltas/jarjestamisvertailu/releases/tag/loppupalautus

Tämän jälkeen ohjelma on suoritettavissa komennolla

`java -jar jarjestaminen.jar`


Ohjelma voidaan myös suorittaa lataamalla ohjelmakansio omalle tietokoneelle ja käyttämällä komentoa

`mvn compile exec:java -Dexec.mainClass=jarjestaminen.Main`

Suoritettava jar-tiedosto voidaan generoida komennolla

`mvn package`

Nyt ohjelma on suoritettavissa komennolla

`java -jar jarjestaminen.jar`


## Ohjelman käyttö ja sallitut syötteet

Ohjelman käyttö tapahtuu tekstikäyttöliittymän kautta.

Käynnistyttyään ohjelma kysyy käyttäjältä tarkasteltavan taulukon pituutta. Käyttäjän tulee antaa ohjelmalle numeroarvo eikä se saa olla negatiivinen (pl. -1 josta edempänä.) Jos käyttäjä antaa ohjelmalle kelvottoman arvon, kysyy ohjelma käyttäjältä taulukon pituutta uudestaan niin kauan kunnes käyttäjä antaa ei-negatiivisen numeroarvon taikka arvon -1.

Positiivisen arvon saatuaan ohjelma kysyy vielä kahta arvoa. Ensimmäinen näistä on generoitavan taulukon arvojen suuruuden yläraja. Tämän jälkeen ohjelma kysyy arvoille alarajaa. Näidenkin arvojen kohdalla ohjelma kysyy käyttäjältä uudelleen niin kauan kunnes käyttäjä antaa kelvollisen numeroarvon.

Käyttäjän syötettyä kolme arvoa ohjelma generoi niiden pohjalta taulukon (käyttäjän antamalla pituudella ja satunnaiset arvot väliltä käyttäjän antama yläraja - alaraja.) Sen jälkeen ohjelma järjestää taulukon kuudella eri järjestämisalgoritmilla ja tulostaa käyttäjälle järjestämiseen kuluneet ajat.


Jos ohjelman alussa käyttäjä tarjoaa taulukon pituudeksi arvoa -1, käynnistyy ohjelman suorituskykytestaus. Ohjelma ajaa testit ja sen jälkeen ohjelman suoritus lakkaa. Suorituskykytestien sisällöstä löytyy enemmän tietoa testausdokumentista.

