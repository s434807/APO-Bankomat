Use Case 1: Wypłata z bankomatu.
=====================

**Aktor podstawowy:** Użytkownik


Główni odbiorcy i oczekiwania względem systemu:
-----------------------------------------------

- Odbiorca1: System(istnieje mozliwosc polaczenia sie z systemem) 

Warunki wstępne:
----------------

-	posiadanie konta w banku oraz karty
-	połączenie z systemem musi być aktywne
-	bankomat musi posiadać jakiekolwiek pieniądze do wydania


Warunki końcowe:
----------------

-	wypłata żądanej kwoty z bankomatu, wysunięcie karty klienta i zarejestrowanie wypłaty     na koncie użytkownika.
-	wysunięcie karty bez zarejestrowanej wypłaty.


Scenariusz główny (ścieżka podstawowa):
---------------------------------------

  1.	Włożenie karty do bankomatu
  2.	Zczytywanie danych z karty.
  3.	Autentykacja karty.
    3.1. Sprawdzenie daty ważności
    3.2 Sprawdzenie sumy kontrolnej
    3.2 Sprawdzenie czy konto istnieje
  4.	Wybranie opcji “wypłata”.
  5.	Wybranie kwoty do wypłaty.
  6.	Potwierdzenie wypłaty
  7.	Wysunięcie karty
  8.	Wypłata pieniędzy
  9.	Sukces.


Rozszerzenia (ścieżki alternatywne):
------------------------------------

 Błąd autentykacji:
 -------------------------------
    1.	Brak komunikacji z systemem.
    2.	Brak komunikacji z bankiem użytkownika
    3.	Nieaktualna karta
    4.	Ukradziona/zablokowana karta
    5.	Nieprawidłowa suma kontrolna
    6.	Nieprawidłowy PIN
    2. Błędy karty
    1.	Zablokowanie się karty w bankomacie.
    2.	Nieczytelna karta.
    3.	Nieprawidłowa karta
    4.	Karta zostawiona w bankomacie.



  Błędy z wypłatą:
  ------------------------------
    1.	Bank nie zatwierdza wypłaty
    2.	Problemy z wysunięciem pieniędzy
    3.	Pieniądze zostawione w bankomacie przez klienta
    4.	Zbyt mało pieniędzy w bankomacie
    5.	Klient przestaje odpowiadać (Nie wykonuje operacji przez pewien czas)


Wymagania specjalne:
--------------------

  -Bankomat powinien wypłacać prawidłową wartość w przynajmniej 99% przypadków.
  
  -Autoryzacja powinna przebiegać w 90% przypadków poniżej 20 sekund.
  Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
  


Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
---------------------------------------------------------------

 2a. Wypłata nie może przekraczać limitu ustalonego w bankomacie (1000-10000).
  

 2b. Wypłata nie może przekraczać limitu ustalonego przez bank.


Kwestie otwarte:
----------------

  - Czy jeżeli jest możliwość wykorzystania nominałów których jest więcej bankomat powinien wypłacać w tym nominale, zamiast w większym (2x20 i 1x10 zamiast 1x50)

