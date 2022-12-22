# Dates
program to manage date and to calc the weekday of a arbitray date

based on the task:

Object-oriented programming - class date
Gottfried Wilhelm Leibniz was born on 7/1/1646. What day of the week was that? To answer this
or similar questions, you must be able to calculate the day of the week from the date.
be able to. Participants in the World Mental Arithmetic Championships can answer this question in a few seconds.
seconds. We want to implement a class Date, which fulfills this task for the years
between 1600 and 3000 and have the following class structure: Implement the
class with its methods (including online documentation):
a) The method setDatum takes a correct date into the provided instance variables
day, month and year, sets switchYear and calculates weekDay. If
the passed date is not correct, the method resets the instance variables tag, monat,
and year to 0 and throws an exception (DateException).
b) The method calculateWeekDay is an auxiliary method for the method setDate. It
calculates the day of the week from the date according to the Gregorian calendar, which has been in effect since
1582.
c) The method toString creates for a date a string of the form:
Wednesday, on 15.12.2010
Test your class in a program DatumTest.java, which repeatedly reads in a date
repeatedly, analyzes it and outputs it as a string if it is correct. Check with your
program the following dates and determine the day of the week:
The founding of the University of Leipzig took place on 12/2/1409.
Gottfried Wilhelm Leibniz was born on 7/1/1646.
Neil Armstrong was the first man to walk on the moon on 21.7.1969.
Siegmund Jähn was the first German cosmonaut to launch into space on 8/26/1978.
Redirect the results into a file DatumTest.out and create an online
documentation for all used classes with
javadoc -private -d DatumDoc *.java
and note that all private attributes and methods must also be documented.
Hint:
Note that a date 2/29 is only correct in a leap year. Leap years are years divisible by 4
divisible years with the exception of century turns. These are leap years only if
the century is also divisible by 4. Example: 2000 was a leap year (20 modulo 4 = 0),
1900 was not a leap year (19 modulo 4 = 3)!3

based on the task in german language:

Objektorientierte Programmierung - Klasse Datum
Gottfried Wilhelm Leibniz ist am 1.7.1646 geboren. Was für ein Wochentag war das? Um diese
oder ähnliche Fragen zu beantworten, muss man den Wochentag aus dem Datum heraus berechnen
können. Teilnehmer der Kopfrechenweltmeisterschaften erledigen diese Frage in wenigen
Sekunden. Wir wollen eine Klasse Datum implementieren, welche diese Aufgabe für die Jahre
zwischen 1600 und 3000 erfüllt und folgenden Klassenaufbau haben soll: Implementieren Sie die
Klasse mit ihren Methoden (einschlieÿlich Online-Dokumentation):
a) Die Methode setDatum übernimmt ein korrektes Datum in die dafür vorgesehenen Instanzvariablen
tag, monat und jahr, setzt schaltJahr und berechnet wochenTag. Ist
das übergebene Datum nicht korrekt, setzt die Methode die Instanzvariablen tag, monat,
und jahr auf 0 zurück und wirft eine Ausnahme (DatumException).
b) Die Methode berechneWochentag ist eine Hilfsmethode für die Methode setDatum. Sie
berechnet aus dem Datum den Wochentag nach dem Gregorianischen Kalender, der seit
1582 gilt.
c) Die Methode toString erzeugt zu einem Datum einen String der Form:
Mittwoch, am 15.12.2010
Testen Sie Ihre Klasse in einem Programm DatumTest.java, welches wiederholt ein Datum
einliest, es analysiert und bei Korrektheit als String ausgibt. Überprüfen Sie mit Ihrem
Programm die folgenden Daten und ermitteln Sie den Wochentag:
Die Gründung der Universität Leipzig fand am 2.12.1409 statt.
Gottfried Wilhelm Leibniz wurde am 1.7.1646 geboren.
Neil Armstrong betrat am 21.7.1969 als erster Mensch den Mond.
Siegmund Jähn startete als erster deutscher Kosmonaut am 26.8.1978 in das Weltall.
Leiten Sie die Ergebnisse in eine Datei DatumTest.out um und erstellen Sie eine Online-
Dokumentation für alle verwendeten Klassen mit
javadoc -private -d DatumDoc *.java
und beachten Sie, dass auch alle privaten Attribute und Methoden zu dokumentieren sind.
Hinweis:
Beachten Sie, dass ein Datum 29.2. nur in einem Schaltjahr korrekt ist. Schaltjahre sind durch 4
teilbare Jahre mit der Ausnahme der Jahrhunderwenden. Diese sind nur dann Schaltjahre, wenn
auch das Jahrhundert durch 4 teilbar ist. Beispiel: 2000 war ein Schaltjahr (20 modulo 4 = 0),
1900 war kein Schaltjahr (19 modulo 4 = 3)!3
