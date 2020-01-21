USE case 3: Przelew na inne konto bankowe

Aktor podstawowy: Klient

Główni odbiorcy i oczekiwania względem systemu:


- Klient: Oczekuje przesłania kwoty pieniędzy z swego konta na inne konto wytypowane przez niego
- Osoba otrzymująca wpłatę (od teraz nazywany „odbiorcą”.): Oczekuje możliwości otrzymania wpłaty
- Bank (do którego należy używany bankomat): Chcę zaksięgować i przeprowadzić transakcje
- System bankowy (z którym kontaktuje się bankomat): Oczekuje informacji o przelewie od wywołującego go systemu, by móc go zapisać do kolejki i go wypełnić 
- Urząd Skarbowy: Oczekuje powiadomienia gdy przelew wydaje się podejrzany lub, gdy jest powyżej kwoty wyznaczonej przez US.


Warunki wstępne: Klient posiada konto bankowe. Odbiorca posiada konto bankowe.


Warunki końcowe: Pieniądze zostały przesłane. Pożądane dane zostały zaksięgowane. US, nie został zignorowany.

Scenariusz główny:


1. Klient wprowadza kartę kredytową oraz PIN, potwierdzając jego należność danego konta bankowego.
2. Bankomat sprawdza podane mu informacje
3. Klient podaje bankomatowi nr konta bankowego odbiorcy oraz wprowadza kwotę, którą chciałby przesłać
4. Bankomat sprawdza czy informacje wprowadzone przez klienta są prawidłowe
5. Bankomat komunikuje się z systemem bankowym by ten wykonał transakcje
6. Bankomat otrzymuje informacje o poprawnym zaksięgowaniu i wykonaniu operacji
7. Bankomat informuje klienta o sukcesie i zwraca kartę.

Rozszerzenia (ścieżki alternatywne):


2a. Bankomat nie może przyjąć karty
	a-1. Karta jest zapisana w systemie jako skradziona
		Bankomat kontaktuje bank i nie zwraca karty
	a-2. Karta jest uszkodzona
		Bankomat informuje o tym klienta, bankomat zwraca kartę
2b. Wprowadzony PIN jest nieprawidłowy
	Bankomat zwraca kartę
4a. Podany numer konta nie istnieje
Poproś o ponowne wprowadzenie numeru konta.
4b. Klient przekroczył ilość prób na wprowadzenie danych odbiorcy
	Bankomat zwraca kartę.
4c. Podany numer konta nie może przyjąć kwoty
Bankomat informuje o tym klienta i oferuje wybór między kontynuacją używania bankomatu lub zwróceniem karty.
4d. Klient nie posiada wystarczająco środków na transakcje
Bankomat informuje o tym klienta i oferuje wybór między kontynuacją używania bankomatu lub zwróceniem karty.
4e. Klient podał zbyt wysoką kwotę
	e-1. Klient posiada uprawnienie do wykonywania tak dużych przelewów
Transakcja zostaje przeprowadzona, US oraz bank zostaną poinformowani o transakcji
	e-2. Klient nie posiada uprawnienia do wykonywania tak dużych przelewów
	Transakcja nie zostaje przeprowadzona, US oraz bank zostaną poinformowani o transakcji
5a. Bankomat nie może skontaktować się z systemem bankowym
	Bankomat informuje o tym klienta i zwraca kartę.

6a. Bankomat nie otrzymuje żadnych informacji
	a-1. Bankomat nie może skontaktować się z systemem bankowym
Bankomat zawiadamia pracownika pomocy technicznej o tym problemie oraz zwraca kartę
	a-2. System bankowy nie może skontaktować się z bankomatem
		System bankowy zawiadamia pracownika pomocy technicznej o tym problemie

7a. Zwrócona karta nie jest odebrana w czasie
Bankomat przechowuje kartę oraz powiadamia bank, że jeden z klientów nie odebrał swojej karty

Wymagania specjalne:


  - Bankomat musi zawsze poprawnie przesłać przelew, lub nie wysyłać go w ogóle 
  - Urząd skarbowy musi zostać poinformowany, gdy kwota przelewu przekracza 15,000zl
  - Bankomat musi posiadać opcje działania w wielu językach

Wymagania technologiczne oraz ograniczenia na wprowadzane dane:


1.Karta kredytowa wprowadzana w czytnik, PIN wprowadzony przez klawisze na bankomacie
3. Numer konta bankowego jest wpisany ekranem dotykowym działającym na wyświetlaczu bankomatu

Kwestie otwarte:

 
 - Czy bankomat powinien być wyposażony w kamerę?
  - Czy bankomat powinien mieć zainstalowany swego rodzaju system wykrywający nakładanie różnego rodzaju spyware na niego?
  - Czy bankomat powinien wyświetlać reklamy?




