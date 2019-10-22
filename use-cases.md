Opis skrócony przypadków użycia
===============================

Aktorzy procesu i ich cele
--------------------------

Aktor       Cel 
----------- -----------------------------
|Użytkownik1| Wypłata z bankomatu|
Użytkownik1 Wpłata na konto
Użytkownik1 Przelew na inne konto
Użytkownik2 Przelew na inne konto
Użytkownik1 Sprawdzenie środków
Użytkownik1 Zakup kodu pre-paid

Słownik
-------

Przypadki użycia
----------------

### Use case 1: Wypłata z bankomatu

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje wypłata oraz podaje kwote wypłaty. System potwierdza wypłate, następnie karta się wysuwa i następuje wypłata pieniędzy. Użytkownik bierze pieniądze oraz karte i odchodzi. 

### Use case 2: Wpłata do banomatu

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje wpłata oraz podaje kwote wpłaty. Użytkownik wkłada pieniądze w wyznaczone miejsce. System sprawdza pieniądze i potwierdza wpłate, następnie karta się wysuwa. Użytkownik bierze karte i odchodzi. 

### Use case 3: Przelew 

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje wykonania przelewu. Użytkownik wprowadza numer konta, kwote przelewu, adres oraz nazwe odbiorcy. System sprawdza, czy użytkownik ma wystarczającą ilośc pieniędzy. Po sprawdzeniu poprawności danych użytkownik potwierdza transakcje kodem pin. Karta się wysuwa, użytkownik bierze kartę i odchodzi.

### Use case 4: Zakup kodu pre-paid

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje zakupu kodu pre-paid. Bankomat wyświetla możliwe kwoty kodu. Użytkownik wybiera kwotę doładowania. System sprawdza, czy użytkownik ma wystarczającą ilośc pieniędzy. System wyświetla zakupiony kod oraz potwierdzenie zakupu(z kodem). Karta się wysuwa, użytkownik bierze kartę i odchodzi.

### Use case 5: Sprawdzenie stanu konta

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje sprawdzenie stanu konta. System sprawdza stan konta łącząc się z bankiem użytkownika, wyświetla stan konta. Użytkownik potwierdza odczytanie stanu. Karta wysuwa się, użytkownik ją odbiera i odchodzi.