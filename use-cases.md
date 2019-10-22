Opis skrócony przypadków użycia
===============================

Aktorzy procesu i ich cele
--------------------------

Aktor       Cel 
----------- -----------------------------
Użytkownik1 Wypłata z bankomatu
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

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje wpłata oraz podaje kwote wpłaty. Użytkownik wkłada pieniądze w wyznaczone miejsce. System sprawdza pieniądze i potwierdza wpłate, następnie karta się wysuwa i następuje wpłata pieniędzy.

### Use case 3: Przelew na inne konto

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje wykonania przelewu. Bankomat wyświetla formularz do przelewu, który zostaje wypełniony przez użytkownika(kwota,numer konta, tytuł przelewu, adres). System sprawdza, czy użytkownik ma wystarczającą ilośc pieniędzy. Po sprawdzeniu poprawności danych użytkownik potwierdza transakcje kodem pin. Karta się wysuwa, użytkownik bierze kartę i odchodzi.

### Use case 4: Zakup kodu pre-paid

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje zakupu kodu pre-paid. Bankomat wyświetla możliwe kwoty kodu. System sprawdza, czy użytkownik ma wystarczającą ilośc pieniędzy. System wyświetla zakupiony kod oraz potwierdz zakup. Karta się wysuwa, użytkownik bierze kartę i odchodzi.

### Use case 5: Sprawdzenie stanu konta

Użytkownik wkłada kartę do bankomatu. Bankomat stwierdza ważność karty. Użytkownik wybiera opcje sprawdzenie stanu konta. System sprawdza stan konta łącząc się z bankiem użytkownika wyświetlając stan konta. Karta wysuwa się, użytkownik ją odbiera i odchodzi.