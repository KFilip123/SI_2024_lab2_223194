# Втора лабараториска вежба по софтверско инженерство
## Филип Кралевски, бр. на индекс 223194

### Control Flow Graph

![image](https://github.com/KFilip123/SI_2024_lab2_223194/assets/167019790/1fb13730-3b21-4a9a-a2db-78663577bb7e)

### Цикломатска комплексност

Цикломатската комплексност ја добив со броење на циклусите и "if" условите во нив, односно предикатните јазли. Таа изнесува 9.

### Тест случаи според критериумот Every Branch

Тест случај 1: allItems = null, payment = 100
Се појавува исклучок RuntimeException("allItems list can't be null!").

Тест случај 2: allItems = [], payment = 100
Не фрла исклучок, бидејќи вредноста е празна низа и враќа true.

Тест случај 3: allItems = [new Item(null, "111", 20, 0)], payment = 1000
Се додава предмет кој има "null" вредност кај полето за име. По проверката, неговото име го променува на "unknown".

Тест случај 4: allItems = [new Item("jabuka", null, 15, 0)], payment = 1000
Се појавува исклучок RuntimeException("No barcode!").

Тест случај 5: allItems = [new Item("monitor", "5b5", 15, 0)], payment = 1000
Се појавува исклучок RuntimeException("Invalid character in item barcode!").

Тест случај 6: allItems = [new Item("telefon", "567", 1000, 0.1f)], payment = 1000
Нема исклучок. Дадена е вредност за попуст, со што се извршува формулата за попуст на предметот.

Тест случај 7: allItems = [new Item("tastatura", "089", 320, 0.1f)], payment = 1000
Се проверува дали баркодот на предметот почнува со 0, цената е поголема од 300 и има попуст. Бидејки е исполнет условот од сумата се одзима 30.

Тест случај 8: Тест случај 7: allItems = [new Item("moliv", "239", 10, 0)], payment = 100
Се проверува дали сумата е помала или еднаква на паричните средства. Во овој случај е помала, и затоа се враќа true.

Тест случај 9: Тест случај 7: allItems = [new Item("tablet", "257", 500, 0)], payment = 100
Се проверува дали сумата е помала или еднаква на паричните средства. Во овој случај не е помала, и затоа се враќа false.

### Тест случаи според критериумот Multiple Condition за условот - if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

Тест Случај 1: true && true && true "allItems = [new Item("tocak", "056", 350, 0.1f)], payment = 1000"
Сите од условите се вистинити, па затоа се одзема 30 од сумата.

Тест Случај 2: true && true && false "allItems = [new Item("trotinet", "251", 500, 0.1f)], payment = 1000"
Еден од условите не е вистинит (баркодот не започнува на 0), па затоа не се одзема 30 од сумата.

Тест Случај 3: true && false && true "allItems = [new Item("tocak", "056", 500, 0)], payment = 1000"
Еден од условите не е вистинит (нема попуст), па затоа не се одзема 30 од сумата.

Тест Случај 4: true && false && false "allItems = [new Item("ranec", "528", 500, 0)], payment = 1000"
Два од условите не се вистинити (нема попуст и баркодот не започнува на 0), па затоа не се одзема 30 од сумата.

Тест Случај 5: false && true && true "allItems = [new Item("cokolada", "013", 30, 0.1f)], payment = 1000"
Еден од условите не е вистинит (цената не е поголема од 300), па затоа не се одзема 30 од сумата.

Тест Случај 6: false && true && false "allItems = [new Item("torta", "167", 120, 0.1f)], payment = 1000"
Два од условите не се вистинити (цената не е поголема од 300 и баркодот не започнува на 0), па затоа не се одзема 30 од сумата.

Тест Случај 7: false && false && true "allItems = [new Item("stol", "028", 250, 0)], payment = 1000"
Два од условите не се вистинити (цената не е поголема од 300 и нема попуст), па затоа не се одзема 30 од сумата.

Тест Случај 7: false && false && false "allItems = [new Item("kreda", "468", 25, 0)], payment = 1000"
Сите услови не се вистинити, па затоа не се одзема 30 од сумата.



