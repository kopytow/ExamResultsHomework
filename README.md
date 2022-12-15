# ExamResultsHomework
1. Домашнее задание Productstar - Spring Application Context – от XML до Groovy
2. Реализовать Java-приложение с использованием Spring Framework для обработки результатов ЕГЭ
3. На вход приложение получает 2 файла – файл с ключами (правильными ответами) в формате 1 - А, 2- Б …. 10 - A (каждый ответ находится на отдельной строке) и файл с ответами ученика в том же самом формате
4. Необходимо зарегистрировать в Spring Application Context bean с именем ResultsProcessor и методом для получения суммарного количества баллов за тест, при условии, что задания 1-4 оцениваются в 1 балл, 5-8 - в 2 балла и 9-10 - в 3 балла каждое
5. Количество баллов за задания из 1-ой, 2-ой и 3-ей группы должно быть сконфигурировано через properties-файл
6. Все public методы классов должны быть покрыты unit-тестами
