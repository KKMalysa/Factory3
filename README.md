# Factory3
Początkowo chciałem to zrobić w nieco bardziej złożony sposób, dać użytkownikowi możliwość wybrania pojemności i rodzaju paliwa dla każdego modelu, 
ale był by to zwyczajnie przerost formy nad treścią



treść zadania:

Fabryka Samochodów
Twoim kolejnym zadaniem będzie utworzenie dwóch fabryk samochodów.

Jedna będzie produkować modele Forda (CMax, Focus), a druga BMW (X5, E60). Jeśli Twoje preferowane modele i marki są inne, możesz je dowolnie zmienić. Atrybuty jakimi będzie charakteryzowało się każde auto to pojemność silnika, rodzaj paliwa oraz rok produkcji.

Klasa Car musi być klasą abstrakcyjną, natomiast Ford i BMW jej potomkami.

Gdy już osiągniesz ten cel czas na rozwój biznesu i eksport na rynek Wielkiej Brytanii i terenów dawnego Imperium Brytyjskiego. Mamy jednak pewien problem - jazda drugą stroną ulicy. 

Zaimplementuj więc fabryki abstrakcyjne, które będą produkować te samochody z kierownicą po prawej lub lewej stronie.

Klasa Factory jest interfejsem, natomiast CommonwealthFactory i ContinentalFactory implementacjami.

Przykładowe wywołanie finalnej wersji zadania z metody main :

public static void main(String[] args) {
 
    Factory commonwealthFactory = new CommonwealthFactory();
    Factory continentalFactory = new ContinentalFactory();
 
    Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
    System.out.println(bmw.getSteeringWheelPosition());
 
    Car ford = continentalFactory.buildFord(FordModel.CMAX);
    System.out.println(ford.getSteeringWheelPosition());
 
}
powinno zwrócić informacje:

LEFT
RIGHT
