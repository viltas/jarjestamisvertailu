# Määrittelydokumentti


## Sovelluksen tarkoitus

Sovelluksen avulla käyttäjä voi testata numeroarvoja sisältävien taulukoiden järjestämistä numerojärjestykseen erilaisten järjestämisalgoritmien sekä useampaa järjestämisalgoritmia hyödyntävien hybridialgoritmien avulla. Sovelluksen on tarkoitus havainnollistaa algoritmien tehokkuutta ja eroja eri kokoisia ja tyyppisiä taulukoita järjestettäessä.


## Käytettävät algoritmit

### Järjestämisalgoritmit

- Quicksort (aikavaativuus keskimäärin O(n log n), tilavaativuus keskimäärin O(log n))
- Merge sort (aikavaativuus O(n log n), tilavaativuus O(n))
- Heapsort (aikavaativuus O(n log n), tilavaativuus O(1))
- Insertion sort (aikavaativuus O(n2, tilavaativuus  O(1))


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

Käyttäjä antaa ohjelmalle taulukon pituuden (pituudelle on olemassa jokin järkevä yläraja) ja ohjelma täyttää taulukon satunnaisilla luvuilla. Käyttäjä valitsee vertailtavat algoritmit ja ohjelma järjestää taulukon näillä algoritmeilla. Lopuksi ohjelma tulostaa käyttäjälle tilastot algoritmien suoritusnopeuksista.


## Laajentamismahdollisuuksia

Jos aikaa jää, lisään ohjelmaan vielä lisää eri järjestämisalgoritmeja vertailtavaksi, sekä lisää käyttäjän antamia kriteerejä järjestettävän taulukon sisällölle. 

## Lähteet

- Wikipedia
  - https://en.wikipedia.org/wiki/Quicksort
  - https://en.wikipedia.org/wiki/Mergesort
  - https://en.wikipedia.org/wiki/Insertionsort
 
- Tirakirja (https://www.cs.helsinki.fi/u/ahslaaks/tirakirja/)
