Use Case 2: Wpłata do bankomatu
=====================

**Aktor podstawowy:** Użytkownik


Główni odbiorcy i oczekiwania względem systemu:
-----------------------------------------------

- Użytkownik: oczekuje możliwości szybkiej wpłaty środków na konto, braku błędów

- Przedsiębiorstwo: chce zadowolenia klienta. Chce elementarnej tolerancji na błędy, aby umożliwić pracę nawet jeżeli składniki całego systemu nie działają (np. funkcjonalność deponowania pieniędzy) 

Warunki wstępne:
----------------

- Użytkownik posiada konto w banku oraz kartę

- Użytkownik posiada pieniądze do wpłaty (banknotów)

Warunki końcowe:
----------------

- wpłata żądanej kwoty na konto, potwierdzenie wpłaty i wysunięcie karty

Scenariusz główny (ścieżka podstawowa):
---------------------------------------

1. Włożenie karty do bankomatu.
2. Zczytanie danych z karty.
3. Autentykacja danych z karty.
4. Wybranie kwoty, którą chcemy wpłacić.
5. Włożenie pieniędzy do bankomatu.
6. Potwierdzenie wpłaty.
7. Wysunięcie karty.
8. Wydrukowanie potwierdzenia (wg. wyboru klienta).
9. Użytkownik odchodzi z kartą.


Rozszerzenia (ścieżki alternatywne):
------------------------------------

*a. W dowolnym czasie, dotyczy sytuacji w której bakomat się zawiesza
    Aby zapewnić poprawne funkcjonowanie, niezbędne są wszystkie kluczowe dane dotyczące usługi.  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System anuluje aktualne transakcje i się restartuje.

1a. W czytniku jest zostawiona karta poprzedniego użytkownika.  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje użytkownika o pozostawionej karcie przez poprzedniego Użytkownika.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System informuje najbliższą placówkę o pozostawionej karcie.  
    &nbsp;&nbsp;&nbsp;&nbsp;3. System prosi o skierowanie się do innego bankomatu.  

3a. Błąd autentykacji karty  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje o błędnym wpisaniu numeru PIN i wysuwa kartę.  

3b. Brak komunikacji z bankiem użytkownika  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System inforumje Użytkownika o błędzie z połączeniem i wysuwa kartę.  

3c. Nieaktualna karta Użytkownika  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika o stracie terminu ważności karty i wysuwa kartę  

3d. Karta została zidentyfikowana jako kradziona/zablokowana  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika, że karta jest zablokowana i wysuwa kartę.  

3e. Karta nie zostaje rozpoznana  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika o błędzie rozpoznania karty i wysuwa kartę.  

5a. Nieczytelny format banknotu  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika o nieczytelnym banknocie.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysuwa wszystkie banknoty i prosi o ponowienie operacji.  

5b. Błąd sprawdzenia banknotu  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika o błędzie podczas sprawdzania banknotu.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysuwa wszystkie banknoty i prosi o ponowienie operacji.  

5c. Nieprawidłowy banknot  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika o nieobsługiwanym banknocie.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysuwa wszystkie banknoty i prosi o ponowienie operacji.  

5d. Banknot nieczytelny (zbyt pognieciony)  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje Użytkownika o złej kondycji banknotu.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System informuje, że aby banknot był przyjęty nie może być pognieciony.  
    &nbsp;&nbsp;&nbsp;&nbsp;3. System wysuwa wszystkie banknoty i prosi o ponowienie operacji.  

5e. Zablokowanie się banknotu w bankomacie  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje użytkownika o zablokowaniu banknotu w bankomacie.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysyła informacje oraz raport błędu do najbliższej placówki o zablokowanym banknocie.  
    &nbsp;&nbsp;&nbsp;&nbsp;3. System wysuwa wszystkie banknoty i skierowanie się do najbliższej placówki w celu rozwiązania problemu.  

5f. Brak miejsca na banknot (bankomat przepełniony)  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje użytkownika o braku miejsca na kolejne banknoty.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysuwa wszystkie banknoty i prosi o skierowanie się do innego bankomatu.  

5g. Brak obsługi nominału  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje użytkownika o nieobsługiwanym nominale.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysuwa wszystkie banknoty i prosi o ponowienie operacji bez użycia odrzuconego banknotu.  

5h. Bank Użytkownika zabrania wpłat  
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje użytkownika o zablokowaniu wpłat przez bank.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysuwa wszystkie banknoty i prosi o skierowanie się do najbliższej placówki w celu wyjaśnienia sytuacji.  

7a. Zablokowanie się karty w bankomacie.    
    &nbsp;&nbsp;&nbsp;&nbsp;1. System informuje użytkownika, o zablokowaniu karty w czytniku.  
    &nbsp;&nbsp;&nbsp;&nbsp;2. System wysyła informacje o błędzie do najbliższej placówki.  
    &nbsp;&nbsp;&nbsp;&nbsp;3. System informuje Użytkownika aby skierował się on do najbliższej placówki, w celu rozwiązania problemu.  


Wymagania specjalne:
--------------------

  - Niezbędny ekran, z wąskim kątem widzenia, tekst musi być widoczny z odległości 0,6m

  - Autoryzacja musi być dokonana w czasie 60 ekund 2 90% przypadków

  - Odczytanie wartości i autentyczności banknotu musi być skuteczna w 99,9% przypadków

  - Możliwość interfejsu wielojęzycznego

  - Pieniądze powinny być wpłacane zgodnie z podaną kwotą

  - Potwierdzenie powinno być drukowane jeśli użytkownik podjął taką decyzje 

Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
---------------------------------------------------------------

 1a. Karta wprowadzona do czytnika kart

 3a. PIN do karty, zostaje wprowdzony z klawiatury 

 4a. Kwota wprowadzana z klawiatury

 5a. Banknoty włożone w wyznaczonym miejscu

 8a. Wydrukowanie potwierdzenia na papierze (jeśli klient sobie tego życzy)

Kwestie otwarte:
----------------

  - Możliwosć sterowania głosem?

  - Ekran dotykowy?
 
