# Testausdokumentti

## Mitä on testattu

Yksikkötestien avulla on tarkistettu, että järjestämisalgoritmit todella toimivat odotetusti ja järjestävät niille annetut satunnaisgeneroidut taulukot oikein. Testeissä algoritmien toimintaa verrataan javan Arrays.sort()-metodiin.

Suorituskykytesteissä on luotu erilaisia skenaarioita taulukkojen sisällöistä ja algoritmien toimintaa verrataan toisiinsa eripituisilla taulukoilla.

## Yksikkötestit

Jokaiselle toteutetulle järjestämisalgoritmille on toteutettu seuraavat yksikkötestit:

- Toimiiko algoritmi pienellä taulukolla
	- testissä käytettävän taulukon koko on 20.	

- Toimiiko algoritmi suurella taulukolla
	- testissä käytettävän taulukon koko on 20000.

- Toimiiko algoritmi tyhjällä taulukolla
	- testi varmistaa, että algoritmin suorittaminen ei epäonnistu tällaisessa tilanteessa.

- Toimiiko algoritmi taulukolla jossa on samoja arvoja
	- testi varmistaa, että algoritmin suorittaminen ei epäonnistu tällaisessa tilanteessa.

- Toimiiko algoritmi kun taulukossa on vain yksi arvo
	- testi varmistaa, että algoritmin suorittaminen ei epäonnistu tällaisessa tilanteessa.


## Suorituskykytestit

Suorituskykytesteissä on annettu neljä skenaariota joita testataan eripituisilla taulukoilla. Pituudet ovat 100, 1000, 10000 ja 200000.

Skenaariot ovat seuraavat:

### Kouluarvosanat

Kouluarvosanataulukossa on arvoja väliltä 4-10. Taulukon arvojen skaala on siis varsinkin pidemmissä taulukoissa erittäin suppea ja toisteisuutta on merkittävästi.

### Päinvastainen järjestys

Toisessa skenaariossa taulukon arvot ovat päinvastaisessa järjestyksessä suurimmasta pienempään.

### Valmiiksi järjestetty

Kolmannessa skenaariossa taulukko on valmiiksi järjestyksessä pienimmästä suurimpaan.

### Syklittäinen järjestys

Syklittäinen taulukko pyrkii simuloimaan lämpötiloja. Se generoidaan niin, että arvot laskevat ja nousevat sykleissä noin välillä -20 - 25. Kunkin arvon kohdalla on kuitenkin muutaman asteen verran satunnaisuutta.


## Testien toistaminen

Jacoco-testikattavuusraportin voi luoda komennolla

`mvn test jacoco:report`


Suorituskykytestit pääsee toistamaan syöttämällä ohjelman aloitusnäkymässä taulukon pituudeksi -1.