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


Use Case 2: Wpłata na konto.
=====================

**Aktor podstawowy:** Użytkownik


Główni odbiorcy i oczekiwania względem systemu:
-----------------------------------------------

- Odbiorca1: System(istnieje możliwość połączenia się z systemem) 

Warunki wstępne:
----------------

-	posiadanie konta w banku oraz karty
-	posiadanie pieniędzy do wpłaty (banknotów)


Warunki końcowe:
----------------

-	wpłata żądanej kwoty na konto, potwierdzenie wpłaty i wysunięcie karty
-	brak potwierdzenia wpłaty, wysunięcie karty oraz włożonych pieniędzy



Scenariusz główny (ścieżka podstawowa):
---------------------------------------

    1.	Włożenie karty do bankomatu.
    2.	Zczytanie danych z karty
    3.	Autentykacja danych z karty
    4.	Wybranie kwoty, którą chcemy wpłacić
    5.	Włożenie pieniędzy do bankomatu
    6.	Potwierdzenie wpłaty
    7.	Wysunięcie karty
    8.	Wydrukowanie potwierdzenia (wg. wyboru klienta)
    9.	Sukces


Rozszerzenia (ścieżki alternatywne):
------------------------------------

 1.Błąd autentykacji
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
 3. Błędy wpłaty:
    1.	Nieczytelny format banknotu
    2.	Błąd sprawdzenia banknotu
    3.	Nieprawidłowy banknot
    4.	Banknot nieczytelny (Zbyt pognieciony).
    5.	Zablokowanie się banknotu w bankomacie.
    6.	Brak miejsca na banknot (Bankomat przepełniony)
    7.	Brak obsługi nominału
    8.	Bank użytkownika zabrania wpłaty.



Wymagania specjalne:
--------------------

 -	Bankomat powinien przyjmować pieniądze o nominałach pokazanych w systemie.
 -	Bankomat powinien skutecznie wpłacać pieniądze zgodne z limitem wpłaty
 -	Bankomat powinien skutecznie czytać wartość jak i autentyczność banknotu w 99.9%      przypadków.
 -	Bankomat powinien drukować potwierdzenie wpłaty zgodnie z decyzją użytkownika
 -	Bankomat powinien posiadać historię wpłat.

  


Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
---------------------------------------------------------------

 2a. Wpłata nie może przekraczać limitu ustalonego w bankomacie (1000-10000).
  

 2b. Wpłata nie może przekraczać limitu ustalonego przez bank.


Kwestie otwarte:
----------------

  - Czy użytkownik powinien deklarować ilość wpłacanych pieniędzy, czy powinny być tylko sprawdzane przez automat
  

Use Case 3: Przelew na inne konto bankowe.
=====================

**Aktor podstawowy:** Użytkownik


Główni odbiorcy i oczekiwania względem systemu:
-----------------------------------------------

- Odbiorca1: System(istnieje możliwość połączenia się z systemem) 

Warunki wstępne:
----------------

-	posiadanie konta w banku oraz karty
-	posiadanie możliwości korzystania z takiej usługi
-	posiadanie wystarczającej kwoty na koncie



Warunki końcowe:
----------------

-	Przelew środków na wybrany numer konta.
-	Pokazanie błędu, nie zatwierdzenie transakcji i wysunięcie karty.
-	Pokazanie błędu, zatwierdzenie transakcji i wysunięcie karty z informacjami dalszego       postępowania.



Scenariusz główny (ścieżka podstawowa):
---------------------------------------

   1.	Włożenie karty do bankomatu.
   2.	Autoryzacja karty:
    1. Sprawdzenie numeru karty
    2. Sprawdzenie sumy kontrolnej
    3. Sprawdzenie konta
   3.	Wybór opcji Przelew.
   4.	Wypełnienie formularza do przelewu:
    1. Podanie Imienia i Nazwiska odbiorcy.
    2. Podanie numeru konta:
	   1. Sprawdzenie poprawności numeru konta.
    3. Podanie tytułu przelewu.
    4. Podanie kwoty do przelewu.  
   5.Potwierdzenie formularza kodem PIN.
   6.	Wysunięcie karty.
   7.	Sukces.



Rozszerzenia (ścieżki alternatywne):
------------------------------------

 1.Błąd autentykacji
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
 3.	Błędy z przelewem
    1.	Bank nie zatwierdza przelewu
    2.	Zbyt mało pieniędzy na koncie
    3.	Klient przestaje odpowiadać (Nie wykonuje operacji przez pewien czas)




Wymagania specjalne:
--------------------

-	Bankomat powinien przelewać prawidłową wartość w przynajmniej 99% przypadków.
-	Autoryzacja powinna przebiegać w 90% przypadków poniżej 20 sekund.
Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
-	Przelew nie może przekraczać limitu ustalonego przez bank.


  


Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
---------------------------------------------------------------

 2a. Przelew nie może przekraczać limitu ustalonego w bankomacie.
  

 2b. Przelew nie może przekraczać limitu ustalonego przez bank.


Kwestie otwarte:
----------------

  - Czy użytkownik może przelać pieniądze podczas wpłaty gotówki
  

Use Case 4: Zakup kodu do telefonii pre-paid.
=====================

**Aktor podstawowy:** Użytkownik


Główni odbiorcy i oczekiwania względem systemu:
-----------------------------------------------

- Odbiorca1: System(istnieje możliwość połączenia się z systemem) 

Warunki wstępne:
----------------

-	posiadanie konta w banku oraz karty
-	posiadanie możliwości korzystania z takiej usługi
-	posiadanie wystarczającej kwoty na koncie



Warunki końcowe:
----------------

-	wydrukowanie/pokazanie kodu pre-paid, zatwierdzenie transakcji oraz wysunięcie karty.
-	pokazanie błędu, nie zatwierdzenie transakcji i wysunięcie karty.
-	pokazanie błędu, zatwierdzenie transakcji i wysunięcie karty z informacjami dalszego       postępowania.




Scenariusz główny (ścieżka podstawowa):
---------------------------------------

 1.	Włożenie karty do bankomatu.
 2.	Autoryzacja karty.
 3.	Wybór opcji kupienie kodu pre-paid.
 4.	Wybór kwoty, kodu.
 5.	Wyświetlenie kodu pre-paid.
 6.	Potwierdzenie zakupu.
 8.	Wysunięcie karty.
 9.	Sukces.



Rozszerzenia (ścieżki alternatywne):
------------------------------------

 1.Błąd autentykacji
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
    5.	Brak wystarczających środków.
 3. Błąd systemu:
    1.	Brak komunikacji z bankiem systemu.
    2.	Brak komunikacji z operatorem.
    3.	Błąd generacji kodu pre-paid
    4.	Błąd wyświetlenia kodu pre-paid





Wymagania specjalne:
--------------------

-	posiadanie konta w banku oraz ważnej karty
-	posiadanie operatora, którego numery obsługiwane są przez bank.
-	posiadanie wystarczającej kwoty na koncie (minimum 10zł)



  


Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
---------------------------------------------------------------

 2a. Przelew nie może przekraczać limitu ustalonego w bankomacie.
  

 2b. Przelew nie może przekraczać limitu ustalonego przez bank.


Kwestie otwarte:
----------------

  - Czy użytkownik może przelać pieniądze podczas wpłaty gotówki