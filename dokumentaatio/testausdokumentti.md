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


### Suorituskykytestit

Suorituskykytesteissä on annettu neljä skenaariota joita testataan eripituisilla taulukoilla. Pituudet ovat 100, 1000, 10000 ja 200000.

Skenaariot ovat seuraavat:

#### Kouluarvosanat

Kouluarvosanataulukossa on arvoja väliltä 4-10. Taulukon arvojen skaala on siis varsinkin pidemmissä taulukoissa erittäin suppea ja toisteisuutta on merkittävästi.

#### Päinvastainen järjestys

Toisessa skenaariossa taulukon arvot ovat päinvastaisessa järjestyksessä suurimmasta pienempään.

#### Valmiiksi järjestetty

Kolmannessa skenaariossa taulukko on valmiiksi järjestyksessä pienimmästä suurimpaan.

#### Syklittäinen järjestys

Syklittäinen taulukko pyrkii simuloimaan lämpötiloja. Se generoidaan niin, että arvot laskevat ja nousevat sykleissä noin välillä -20 - 25. Kunkin arvon kohdalla on kuitenkin muutaman asteen verran satunnaisuutta.


## Graafinen esitys

![](https://raw.githubusercontent.com/viltas/jarjestamisvertailu/master/dokumentaatio/kaaviot.jpg)

Yllä on kuvattu pylväskaaviona suorituskykytestien tuloksia kun taulukon pituus on ollut 200000 (ylempi) ja 100 (alempi). Valitsin nämä ääripäät graafiseen esitykseen sillä algoritmien erot näkyvät niistä parhaiten. On huomattava, että ensimmäisessä kaaviossa (suuri taulukko) on esitettynä vain nopeimmat algoritmit.

Suuren taulukon tapauksessa oli huomattavaa, että heapsort tuntui toimivan varsin tasaisesti skenaariosta huolimatta ja se vaikutti olevan parempi valinta verrattuna mergesortiin. Hybridialgoritmit olivat kuitenkin odotetusti sekä heapsortia että mergesortia nopeampia, ja timsort osoittautui hitaammaksi vain kun järjestettiin päinvastaisessa järjestyksessä olevaa taulukkoa. Introsort osoittautui kaikkein nopeimmaksi ja se hävisi timsortille vain tapauksessa jossa taulukko oli valmiiksi järjestetty.


Lyhyttä taulukkoa (100) järjestettäessä huomattiin, että insertionsort ja quicksort ovat pieniä tietomääriä järjestettäessä hyvinkin tehokkaita. Kouluarvosanat ja syklittäinen data vastaavat parhaiten tosielämässä kohdattavaa järjestettävää dataa ja niiden kohdalla quicksort osoittautui hyvin nopeaksi. Pienenkin datan kohdalla introsort osoittautui kuitenkin nopeimmaksi ratkaisuksi.




![](https://raw.githubusercontent.com/viltas/jarjestamisvertailu/master/dokumentaatio/kaaviot2.png)

Yllä olevassa kuvassa näemme kaavion joka kuvaa algoritmien toimintaa syklittäisessä järjestyksessä olleen taulukon järjestämisessä eri pituisilla taulukoilla. Kuvaus tukee esitettyjen algoritmien aikavaativuuksia. Insertionsortin aikavaativuus on O(n2) kun taas muiden O(n log n).


## Testien toistaminen

Jacoco-testikattavuusraportin voi luoda komennolla

`mvn test jacoco:report`


Suorituskykytestit pääsee toistamaan syöttämällä ohjelman aloitusnäkymässä taulukon pituudeksi -1.
