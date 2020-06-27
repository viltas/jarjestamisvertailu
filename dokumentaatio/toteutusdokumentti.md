# Toteutusdokumentti


## Ohjelman yleisrakenne

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

-

## Suorituskyky- ja O-analyysivertailu

-

## Puutteet ja parannusehdotukset

-
