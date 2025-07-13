# curex-4-kambu
Aplikacja przeliczająca kursy walut.


Żeby aplikacja działała, proszę o użycie `./gradlew bootRun` w folderze aplikacji aby włączyć aplikację.

Żeby zobaczyć dostępne waluty, użyj `curl http://localhost:8080/api/currencies` w wierszu polecenia cmd.

Żeby przeliczyć walutę, użyj `curl http://localhost:8080/api/convert?from=`(waluta szukana)`&to=`(waluta oczekiwana)`&amount=`(ilość) w wierszu polecenia cmd.
