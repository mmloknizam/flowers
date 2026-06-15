## FLOWERS
## Opis projekta

Projekat *Flowers Recommendation App* predstavlja web aplikaciju razvijenu u programskom jeziku Clojure koja korisnicima omogućava pronalaženje i preporuku odgovarajućeg cveća na osnovu njihovih preferencija. Korisnik može da pretražuje ponudu prema različitim kriterijumima, kao što su vrsta cveća, boja, namena (poklon, dekoracija, venčanje i slično), sezona, pogodnost za zatvoren prostor, pogodnost za osobe sa alergijama, kao i lokacija.

Aplikacija koristi minimalan web stack koji čine Ring kao HTTP server, Compojure za rutiranje zahteva i Hiccup za generisanje HTML sadržaja. Cilj projekta bio je primena osnovnih i srednje naprednih koncepata programskog jezika Clojure kroz razvoj funkcionalne web aplikacije koja rešava konkretan problem preporuke cveća na osnovu korisničkih preferencija.

Arhitektura projekta organizovana je kroz više namespace-ova: `core`, `db`, `maps`, `web`, `routes` i `server`.

* `core` sadrži glavnu logiku filtriranja i preporuke cveća.
* `db` predstavlja skup podataka o dostupnim cvetnim aranžmanima.
* `maps` sadrži funkcionalnosti za računanje udaljenosti između korisnika i lokacije cveća.
* `web` i `routes` definišu korisnički interfejs i rukovanje HTTP zahtevima.
* `server` pokreće aplikaciju i povezuje sve njene komponente.

Projekat kombinuje principe funkcionalnog programiranja sa praktičnom primenom web tehnologija. Tokom razvoja korišćeni su koncepti rada sa kolekcijama, mapama, keyword-ima i funkcionalnim transformacijama podataka, čime je ostvarena jednostavna i pregledna implementacija poslovne logike.

Kroz izradu aplikacije stečeno je dublje razumevanje programskog jezika Clojure i njegovog funkcionalnog pristupa rešavanju problema. Iako aplikacija ostavlja prostor za buduća unapređenja, poput proširenja baze podataka, integracije sa eksternim servisima ili implementacije naprednijih sistema preporuke, ostvareni rezultat omogućava korisnicima jednostavnu, brzu i intuitivnu pretragu odgovarajućeg cveća prema zadatim kriterijumima.

## Korišćeni koncepti

Tokom razvoja projekta primenjeni su sledeći koncepti programskog jezika Clojure:

* organizacija koda kroz namespace-ove
* rad sa mapama i ključevima
* keyword vrednosti
* pristup podacima u mapama
* funkcionalna iteracija nad kolekcijama
* filtriranje podataka pomoću uslova
* transformacija podataka
* rekurzija
* logički uslovi
* rad sa sekvencama
* funkcije `map`, `filter` i `reduce`
* funkcije `assoc`, `conj`, `sort-by` i `take`
* korišćenje `first` i `rest`
* rad sa `nil` vrednostima
* boolean logika i truthy/falsy vrednosti
* računanje udaljenosti korišćenjem matematičkih funkcija
* sortiranje i ograničavanje rezultata pretrage

Veći deo navedenih koncepata usvojen je kroz rešavanje zadataka na platformi 4Clojure, a zatim primenjen tokom razvoja ove aplikacije.

## Literatura

### Primarni izvori

* Daniel Higginbotham, *Clojure for the Brave and True*
* Zadaci i vežbe sa platforme 4Clojure
* Advent of Code zadaci i primeri

### Sekundarni izvori

* https://clojure.org/reference/reader
* https://clojure-doc.org
* https://learnxinyminutes.com/compojure/
* Tutorial projekti dostupni na clojure-doc.org
* https://www.youtube.com/playlist?list=PLRGAFpvDgm2ylbXYIjvu3kI426zAP_Lqc
