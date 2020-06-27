# Määrittelydokumentti


## Sovelluksen tarkoitus

Sovelluksen avulla käyttäjä voi testata numeroarvoja sisältävien taulukoiden järjestämistä numerojärjestykseen erilaisten järjestämisalgoritmien sekä useampaa järjestämisalgoritmia hyödyntävien hybridialgoritmien avulla. Sovelluksen on tarkoitus havainnollistaa algoritmien tehokkuutta ja eroja eri kokoisia ja tyyppisiä taulukoita järjestettäessä.


## Käytettävät algoritmit

### Järjestämisalgoritmit

- Quicksort (aikavaativuus keskimäärin O(n log n), tilavaativuus keskimäärin O(log n))
- Merge sort (aikavaativuus O(n log n), tilavaativuus O(n))
- Heapsort (aikavaativuus O(n log n), tilavaativuus O(1))
- Insertion sort (aikavaativuus O(n2), tilavaativuus  O(1))


### Hybridialgoritmit

- Introsort (aikavaativuus O(n log n), tilavaativuus O(n))
  - käyttää algoritmeja:
    - Quicksort
    - Heapsort
    - insertion sort
  
  
- Timsort (aikavaativuus keskimäärin O(n log n), tilavaativuus O(n))
  - käyttää algoritmeja:
    - merge sort
    - insertion sort


## Perusversion toiminnallisuus

Käyttäjä antaa ohjelmalle taulukon pituuden sekä arvojen suuruuden ylä- ja alarajan. Sitten ohjelma täyttää taulukon satunnaisilla luvuilla. Seuraavaksi ohjelma järjestää äsken luodun taulukon kuudella yllä esitetyllä algoritmilla. Lopuksi ohjelma tulostaa käyttäjälle algoritmien suoritusnopeudet.


## Lähteet

- Wikipedia
  - https://en.wikipedia.org/wiki/Quicksort
  - https://en.wikipedia.org/wiki/Mergesort
  - https://en.wikipedia.org/wiki/Insertionsort
  - https://en.wikipedia.org/wiki/HeapSort
  - https://en.wikipedia.org/wiki/TimSort
  - https://en.wikipedia.org/wiki/IntroSort


 
- Tirakirja (https://www.cs.helsinki.fi/u/ahslaaks/tirakirja/)

- https://www.stackoverflow.com

- https://www.geeksforgeeks.org

- https://www.baeldung.com

