# Lab1 - Introduksjon til Java
I denne labben vil vi implementere en rekke program med bruk av INF100-konsepter, men i Java-syntaks.

I INF100 høsten 2022 hadde vi tilnærmet ukentlige laboppgaver som dekket grunnleggende Python-programmering. I Java ønsker vi å benytte oss av akkurat de samme konseptene:
 * Datatyper
 * If-setninger
 * Loop'er
 * Lister
 * Funksjoner

Eneste forskjellen er at vi benytter oss av en annen syntaks. Istedenfor å skrive program i Python så skriver vi nå i Java.

I denne laboppgaven skal dere implementere en rekke oppgaver fra INF100 med bruk av Java istedenfor Python. Vi har valgt 2-3 oppgaver hver fra lab1, lab2, lab3, lab5 og lab7. Til slutt har vi en tidligere eksamensoppgave: Rock Paper Scissors. Denne oppgaven vil kombinere alle konsepter fra disse labbene.

### ✅ Bestå denne labben ved å passere alle testene og levere på Codegrade 

**Alle metodene har denne linjen:**
```java
throw new UnsupportedOperationException("Not implemented yet.");
```
**Denne skal dere fjerne. Det betyr enkelt at koden for denne metoden ikke er skrevet enda.**

## INF100 Lab1 - Printing og innlesning
De følgende oppgavene er tatt fra lab1 INF100h22. Du finner de opprinnelige oppgavene her:
https://inf100.ii.uib.no/lab/1/

### Oppgave 1
Implementer metoden `Lab1::task1`. Metoden skal skrive ut akkurat følgende output i terminalen:
```
Hei, det er meg, datamaskinen.
Hyggelig å se deg her.
Lykke til med INF101!
```

### Oppgave 2
Implementer metoden `Lab1::task2`. Metoden skal gjøre følgende, i oppgitt rekkefølge:

 1. Les inn brukerens navn ved å bruke `readInput`.
 2. Les inn brukerens gatedresse ved å bruke `readInput`.
 3. Les inn postkode og poststed ved å bruke `readInput`.
 4. Printer "*navn*-s adresse er:"
 5. Printer en tom linje
 6. Printer navn og adresse slik man skriver det på et brev

Eksempelkjøring:
```
Hva er ditt navn?
Kari Nordmann
Hva er din adresse?
Gateveien 1
Hva er ditt postnummer og poststed?
1234 Stedet
Kari Nordmanns adresse er:

Kari Nordmann
Gateveien 1
1234 Stedet
```
For å lese inn input fra brukeren kan du kalle på `readInput`.

✅ Kjør `Lab1Test.java` for å teste om du har klart alle oppgavene i denne seksjonen.

## INF100 Lab2 - If-setninger
De følgende oppgavene er tatt fra lab2 INF100h22. Du finner de opprinnelige oppgavene her:
https://inf100.ii.uib.no/lab/2/

### Oppgave 1 - `findLongestWord`
Implementer metoden `Lab2::findLongestWord`. Metoden har tre parametre `word1`, `word2` og `word3`. Skriv kode som skriver ut det lengste ordet. Hvis det er flere ord som er like langt som det lengste skal disse også skrives ut.

Hvis vi kaller metoden med de følgende ordene: `findLongestWord("Game", "Action", "Champion")` skal det skrives ut:
```
Champion
```
Hvis metoden kalles med disse ordene: `findLongestWord("apple", "carrot", "ananas")` skal det skrives ut:
```
carrot
ananas
```
Hvis metoden kalles med disse ordene: `findLongestWord("Four", "Five", "Nine")` skal det skrives ut:
```
Four
Five
Nine
```

### Oppgave 2 - `isLeapYear`
Implementer metoden `Lab2::isLeapYear`. Metoden tar inn et årstall som parameter. Skriv kode som returnerer `true` hvis året er et skuddår og `false` hvis ikke.

Regelen for å beregne om et år er et *skuddår* eller ikke er som følger:
 * Vanligvis er et år som er delelig med 4 et skuddår (for eksempel 1996 var et skuddår);
 * bortsett fra år som også er delelige med 100 (for eksempel 1900 er ikke skuddår);
 * men hvis året som er delelige med 100 også er delelig med 400, da er det et skuddår likevel (for eksempel er 2000 et skuddår).

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
boolean leapYear1 = isLeapYear(2022);
System.out.println(leapYear1); // false

boolean leapYear2 = isLeapYear(1996);
System.out.println(leapYear2); // true

boolean leapYear3 = isLeapYear(1900);
System.out.println(leapYear3); // false

boolean leapYear4 = isLeapYear(2000);
System.out.println(2000); // true
```

### Oppgave 3 - `isEvenPositiveInt`
Implementer metoden `Lab2::isEvenPositiveInt`. Metoden tar inn et heltall `num` som parameter. Metoden skal returnere `true` hvis `num` er et positivt partall, og `false` ellers.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
boolean evenPositive1 = isEvenPositiveInt(123456);
System.out.println(evenPositive1); // true

boolean evenPositive2 = isEvenPositiveInt(-2);
System.out.println(evenPositive2); // false

boolean evenPositive3 = isEvenPositiveInt(123);
System.out.println(evenPositive3); // false
```


✅ Kjør `Lab2Test.java` for å teste om du har klart alle oppgavene i denne seksjonen.

## INF100 Lab3 - Loop'er
De følgende oppgavene er tatt fra lab3 INF100h22. Du finner de opprinnelige oppgavene her:
https://inf100.ii.uib.no/lab/3/


### Oppgave 1 - `multiplesOfSeven`
Implementer metoden `Lab3::multiplesOfSeven`. Metoden tar inn et parameter `n`. Skriv kode for å skrive ut alle heltall mindre enn `n` som er delelig på 7.

Når metoden kalles med parameter `n = 49`: `multiplesOfSeven(49)` så skal det skrives ut:
```
7
14
21
28
35
42
```

### Oppgave 2 - `multiplicationTable`
Implementer metoden `Lab3::multiplicationTable`. Metoden tar inn et parameter `n`. Skriv kode for å skrive ut gangetabellen for alle tall fra og med `1` til og med `n`. Utskriften skal følge møsnteret vist under.

Eksempelkjøringer:
`multiplicationTable(3)`
```
1: 1 2 3
2: 2 4 6
3: 3 6 9
```
`multiplicationTable(5)`
```
1: 1 2 3 4 5
2: 2 4 6 8 10
3: 3 6 9 12 15
4: 4 8 12 16 20
5: 5 10 15 20 25
```

### Oppgave 3 - `crossSum`
Implementer metoden `Lab3::crossSum`. Metoden tar inn et parameter `n` og skal returnere tverrsummen av `n`. Tverrsummen er summen av sifferene i tallet, for eksempel er tverrsummen av 12 lik 3, siden 1 + 2 = 3.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
int sum = crossSum(1);
System.out.println(sum); // 1

int sum = crossSum(12);
System.out.println(sum); // 3

int sum = crossSum(123);
System.out.println(sum); // 6

int sum = crossSum(1234);
System.out.println(sum); // 10

int sum = crossSum(4321);
System.out.println(sum); // 10
```


✅ Kjør `Lab3Test.java` for å teste om du har klart alle oppgavene i denne seksjonen.

## INF100 Lab5 - Lister
De følgende oppgavene er tatt fra lab5 INF100h22. Du finner de opprinnelige oppgavene her:
https://inf100.ii.uib.no/lab/5/


### Oppgave 1 - `removeThrees`
Implementer metoden `Lab5::removeThrees`. Metoden tar inn en liste av heltall `list` som parameter. Skriv kode for å fjerne alle forekomster av tallet `3` i listen.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
ArrayList<Integer> arrayList1 = new ArrayList<>(list1);
removeThrees(arrayList1);
System.out.println(arrayList1); // [1, 2, 4]

List<Integer> list2 = Arrays.asList(1, 2, 3, 3);
ArrayList<Integer> arrayList2 = new ArrayList<>(list2);
removeThrees(arrayList2);
System.out.println(arrayList2); // [1, 2]

List<Integer> list3 = Arrays.asList(3, 3, 1, 3, 2, 4, 3, 3, 3);
ArrayList<Integer> arrayList3 = new ArrayList<>(list3);
removeThrees(arrayList3);
System.out.println(arrayList3); // [1, 2, 4]

List<Integer> list4 = Arrays.asList(3, 3);
ArrayList<Integer> arrayList4 = new ArrayList<>(list4);
removeThrees(arrayList4);
System.out.println(arrayList4); // [3, 3]
```

### Oppgave 2 - `uniqueValues`
Implementer metoden `Lab5::uniqueValues`. Metoden tar inn en liste heltall `list` som parameter. Skriv kode for å beholde alle unike verdier, men fjerne alle dulplikater. Sørg for at elementene som ikke fjernes beholder sin plassering i listen.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
List<Integer> list1 = Arrays.asList(1, 1, 2, 1, 3, 3, 3, 2);
ArrayList<Integer> arrayList1 = new ArrayList<>(list1);
removeThrees(arrayList1);
System.out.println(arrayList1); // [1, 2, 3]

List<Integer> list2 = Arrays.asList(4, 4, 4, 4, 4, 4, 4, 4, 4, 5);
ArrayList<Integer> arrayList2 = new ArrayList<>(list2);
removeThrees(arrayList2);
System.out.println(arrayList2); // [4, 5]
```

### Oppgave 3 - `addList`
Implementer metoden `Lab1::addList`. Metoden tar inn to lister med heltall `a` og `b` som parameter. Skriv kode for å endre listen `a` ved å addere alle verdiene med heltallene i `b` på samme indeks. Du skal endre på liste `a`, men ikke endre på `b`.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
ArrayList<Integer> b1 = new ArrayList<>(Arrays.asList(4, 2, -3));
addList(a1, b1);
System.out.println(a1); // [5, 4, 0]

ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 2, 3));
ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(47, 21, -30));
addList(a2, b2);
System.out.println(a2); // [48, 23, -27]
```


✅ Kjør `Lab5Test.java` for å teste om du har klart alle oppgavene i denne seksjonen.

## INF100 Lab7 - Todimensjonale lister
De følgende oppgavene er tatt fra lab7 INF100h22. Du finner de opprinnelige oppgavene her:
https://inf100.ii.uib.no/lab/7/


### Oppgave 1 - `removeRow`
Implementer metoden `Lab7::removeRow`. Metoden tar inn en todimensjonal liste av heltall `grid` og en rad-index `row` som parameter. Skriv kode for å fjerne raden på indeks `row` fra `grid`.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
ArrayList<ArrayList<Integer>> grid1 = new ArrayList<>();
grid1.add(new ArrayList<>(Arrays.asList(11, 12, 13)));
grid1.add(new ArrayList<>(Arrays.asList(21, 22, 23)));
grid1.add(new ArrayList<>(Arrays.asList(31, 32, 33)));

removeRow(grid1, 0);
for (int i = 0; i < grid1.size(); i++) {
    System.out.println(grid1.get(i));
}
// [21, 22, 23]
// [31, 32, 33]

ArrayList<ArrayList<Integer>> grid2 = new ArrayList<>();
grid2.add(new ArrayList<>(Arrays.asList(11, 12, 13)));
grid2.add(new ArrayList<>(Arrays.asList(21, 22, 23)));
grid2.add(new ArrayList<>(Arrays.asList(31, 32, 33)));

removeRow(grid2, 1);
for (int i = 0; i < grid2.size(); i++) {
    System.out.println(grid2.get(i));
}
// [11, 12, 13]
// [31, 32, 33]
```


### Oppgave 2 -`allRowsAndColsAreEqualSum`
Implementer metoden `Lab7::allRowsAndColsAreEqualSum`. Metoden tar inn en todimensjonal liste av heltall `grid` som parameter. Skriv kode som sjekker at alle rader summerer til det samme tallet, og at alle kollonner summerer til det samme tallet. Summen av radene og kollonnene trenger ikke å være det samme.

Koden skal skrive ut de følgende verdiene gitt de forskjellige parameterene:
```java
ArrayList<ArrayList<Integer>> grid1 = new ArrayList<>();
grid1.add(new ArrayList<>(Arrays.asList(3, 0, 9)));
grid1.add(new ArrayList<>(Arrays.asList(4, 5, 3)));
grid1.add(new ArrayList<>(Arrays.asList(6, 8, 1)));

boolean equalSums1 = allRowsAndColsAreEqualSum(grid1);
System.out.println(equalSums1); // false


ArrayList<ArrayList<Integer>> grid2 = new ArrayList<>();
grid2.add(new ArrayList<>(Arrays.asList(3, 4, 6)));
grid2.add(new ArrayList<>(Arrays.asList(0, 5, 8)));
grid2.add(new ArrayList<>(Arrays.asList(9, 3, 1)));

boolean equalSums2 = allRowsAndColsAreEqualSum(grid2);
System.out.println(equalSums2); // false

ArrayList<ArrayList<Integer>> grid3 = new ArrayList<>();
grid3.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
grid3.add(new ArrayList<>(Arrays.asList(2, 3, 4, 1)));
grid3.add(new ArrayList<>(Arrays.asList(3, 4, 1, 2)));
grid3.add(new ArrayList<>(Arrays.asList(4, 1, 2, 3)));

boolean equalSums3 = allRowsAndColsAreEqualSum(grid3);
System.out.println(equalSums3); // true
```


✅ Kjør `Lab7Test.java` for å teste om du har klart alle oppgavene i denne seksjonen.

# Bonusoppgave: Rock Paper Scissors
Dette programmet samler alle konseptene fra de andre oppgavene. Hvis du klarer å løse denne har du god kontroll på Java-syntaksen 👏 🙌
**Denne oppgaven må IKKE gjøres for å få godkjent på lab1. Den er helt frivelig.**

Det vellkjente spillet *Stein Saks Papir* var et eksamensspørsmål i [INF100 vår 2020](https://mitt.uib.no/courses/29690/files/3490285/download?wrap=1) (oppgave 14). I denne labben vil vi implmenetere det samme programmet, men istedenfor det velkjente Python-språket vil vi bruke Java.

Målet med denne labben er å lære dere Java-syntaks. Hvis du ikke husker alle programmeringskonseptene fra INF100 og trenger en oppfriskning så har vi implementert [Stein Saks Papir i Python](https://git.app.uib.no/ii/inf101/22v/students/lab1/-/blob/master/RockPaperScissors.py).

### Oppgave
Skriv et Java-program hvor et menneske spiller mot datamaskinen. Mennesket skal bli bedt om deres valg av stein, saks eller papir i konsollen, mens datamaskinen skal velge tilfeldig mellom de tre valgene. Mennesket skal bees om de ønsker å spille videre etter hver runde. Score'en til begge spillerne skal lagres og presenteres utgjennom alle rundene. All input fra mennesket skal valideres og ikke tillate at programmet kræsjer på feil input (se runde 3).

**Viktig**: Den eksiterende koden må fobli slik den er ved kloning. Implementer programmet i `run`. Du kan opprette hjelpemetoder (anbefalt) til dine behov. Bruk metoden `readInput` for innlesning av input fra brukeren.

Programmet skal printe ut det følgende i konsollen (inkludert input fra brukeren):
```
Let's play round 1
Your choice (Rock/Paper/Scissors)?
rock
Human chose rock, computer chose paper. Computer wins!
Score: human 0, computer 1
Do you wish to continue playing? (y/n)?
y
Let's play round 2
Your choice (Rock/Paper/Scissors)?
paper
Human chose paper, computer chose paper. It's a tie!
Score: human 0, computer 1
Do you wish to continue playing? (y/n)?
y
Let's play round 3
Your choice (Rock/Paper/Scissors)?
cardboard
I do not understand cardboard. Could you try again?
Your choice (Rock/Paper/Scissors)?
scissors
Human chose scissors, computer chose paper. Human wins!
Score: human 1, computer 1
Do you wish to continue playing? (y/n)?
n
Bye bye :)
```

✅ Kjør `RockPaperScissorsTest.java` for å teste om du har løst denne oppgaven riktig.

Testene sjekker hvorvidt output'en i konsollen er **akkurat** slik som i eksempel-output ovenfor.

