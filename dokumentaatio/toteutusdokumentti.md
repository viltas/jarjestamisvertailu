# Toteutusdokumentti


## Ohjelman yleisrakenne

Ohjelman kieli on java ja se on toteutettu netbeans-projektina. Ohjelman käyttöliittymä on toteutettu tekstikäyttöliittymänä.

Ohjelman käyttöliittymä, algoritmit ja yksikkötestit on eroteltu toisistaan seuraavasti:

- src/main/java/jarjestaminen/ui

	- Ui.java
		- ohjelman käyttöliittymä
	- Commands.java
		- metodit joiden avulla kutsutaan järjestämisalgoritmeja käyttöliittymään, ja mitataan niiden suoritukseen kulunut aika
	- SuoritusTestit.java
		- suorituskykytesteihin tarvittavat metodit

- src/main/java/jarjestaminen/algoritmit
	
	- HeapSort.java
	- InsertionSort.java
	- MergeSort.java
	- QuickSort.java
	- TimSort.java
	
- src/test/java/jarjestaminen/algoritmit 

	- HeapSortTest.java
	- InsertionSortTest.java
	- MergeSortTest.java
	- QuickSortTest.java
	- TimSortTest.java	


## Toteutetut algoritmit

### Järjestämisalgoritmit

- Insertion sort
	- Hidas (O(n2)) mutta vakaa järjestämisalgoritmi. Se pitää taulukon alkuosan järjestyksessä ja lisää siihen yksi kerrallaan alkioita taulukon loppuosasta oikealle paikalleen.

- Quicksort
	- Epävakaa järjestämisalgoritmi, jossa valitaan alkio ns. pivot-alkioksi ja muut alkiot lajitellaan kahteen ryhmään pivotia hyödyntäen, ja sama toistetaan ryhmille rekursiivisesti uudella pivot-alkiolla. Quicksortin aikavaativuus on keskimäärin O(n log(n)), mutta pahimmassa tapauksessa O(n2) jos alkiot ovat jo järjestyksessä.	
	
- Merge sort
	- Tehokas (O(n log n)) ja vakaa järjestämisalgoritmi. Taulukko jaetaan kahteen keskenään yhtä suureen osataulukkoon ja osataulukot järjestetään rekursiolla. Sen jälkeen järjestetyt osataulukot lomitetaan yhteen järjestetyksi taulukoksi.
	
- Heapsort
	- Kekorakenteeseen perustuva lajittelualgoritmi. Kekorakenteen muodostamisen jälkeen keon suurin alkio poistetaan ja se asetetaan valmiin listan alkuun ja keko käsitellään uudestaan siten, että kekoehto täyttyy. Näin tehdään niin kauan kunnes taulukko on järjestetty.
	



### Hybridialgoritmit

- Introsort
  - Tehokas hybridialgoritmi joka hyödyntää seuraavia algoritmeja:
    - Quicksort
    - Heapsort
    - insertion sort
  - Lähtökohtaisesti introsort järjestää taulukon quicksortin avulla. Tietyssä rekursiosyvyydessä introsort siirtyy kuitenkin käyttämään heapsortia väistäen näin quicksortin kannalta epäedulliset tilanteet. Järjestettävän määrän ollessa tarpeeksi pieni algoritmi siirtyy insertion sortiin joka on kaikkein nopein silloin kun järjestettävien alkioiden määrä on matala.   
  
  
- Timsort
  - Tehokas hybridialgoritmi joka hyödyntää seuraavia algoritmeja:
    - merge sort
    - insertion sort
  - Taulukko jaetaan lohkoihin jotka järjestetään insertion sortilla. Sen jälkeen lohkot yhdistetään toisiinsa merge sortin lomituksen avulla.



## Saavutetut aika- ja tilavaativuudet

- Määrittelydokumentissa esitetyt aikavaativuudet saavutettiin:
	- Quicksort (aikavaativuus keskimäärin O(n log n), tilavaativuus keskimäärin O(log n))
	- Merge sort (aikavaativuus O(n log n), tilavaativuus O(n))
	- Heapsort (aikavaativuus O(n log n), tilavaativuus O(1))
	- Insertion sort (aikavaativuus O(n2), tilavaativuus O(1))
	- Timsort (aikavaativuus keskimäärin O(n log n), tilavaativuus O(n))
	- Introsort (aikavaativuus O(n log n), tilavaativuus O(n))
	

## Suorituskykyvertailu

- Timsort ja introsort -hybridialgoritmit osoittautuivat todistetusti muita järjestämisalgoritmeja nopeammiksi varsinkin suurilla syötteillä. Tämä oli odotettavissa, sillä niissä yhdistyy useamman algoritmin vahvoja puolia joilla toisaalta väistetään käytettyjen algoritmien heikkoudet. Algoritmien nopeuseroista lisää testausdokumentissa.


## Puutteet ja parannusehdotukset

- Ohjelma olisi hyötynyt suuresti graafisesta käyttöliittymästä. Käyttöliittymä olisi voinut mahdollisesti piirtää käyttäjälle graafeja algoritmien nopeuseroista. Tällainen toteutus olisi käyttäjälle hyödyllisempi kun tarkoitus on vertailla algoritmien eroja.

- Quicksort-algoritmia olisi voinut optimoida. Nykyinen ratkaisu johtaa virheilmoitukseen (stackoverflowerror) joillakin suurilla syötteillä.

