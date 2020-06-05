# Testausdokumentti

## Mitä on testattu

Yksikkötestien avulla on tarkistettu, että järjestämisalgoritmit todella toimivat odotetusti ja järjestävät niille annetut satunnaisgeneroidut taulukot oikein. Testeissä algoritmien toimintaa verrataan javan Arrays.sort()-metodiin.

## Yksikkötestit

Jokaiselle toteutetulle järjestämisalgoritmille on toteutettu seuraavat yksikkötestit:

- Toimiiko algoritmi pienellä taulukolla
	- testissä käytettävän taulukon koko on 20.	

- Toimiiko algoritmi suurella taulukolla
	- testissä käytettävän taulukon koko on 20 000.

- Toimiiko algoritmi tyhjällä taulukolla
	- testi varmistaa, että algoritmin suorittaminen ei epäonnistu tällaisessa tilanteessa.

- Toimiiko algoritmi taulukolla jossa on samoja arvoja
	- testi varmistaa, että algoritmin suorittaminen ei epäonnistu tällaisessa tilanteessa.

- Toimiiko algoritmi kun taulukossa on vain yksi arvo
	- testi varmistaa, että algoritmin suorittaminen ei epäonnistu tällaisessa tilanteessa.



## Testien toistaminen

Jacoco-testikattavuusraportin voi luoda komennolla

`mvn test jacoco:report`