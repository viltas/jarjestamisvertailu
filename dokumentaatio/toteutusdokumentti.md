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


## Saavutetut aika- ja tilavaativuudet

- Määrittelydokumentissa esitetyt aika- ja tilavaativuudet saavutettiin:
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

