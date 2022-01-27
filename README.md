# dizi-desen
Java kodu ile bir dizi kullanılarak, "*" ile B harfi yazdırma.


   0   1  2  3  
0  *    ------->   (0,0)
1  *   *    --->   (1,0), (1,1)
2  *      *   ->   (2,0), (2,2)
2  *         * >   (3,0), (3,3)
4  *      *   ->   (4,0), (4,2)
5  *   * 	  --->   (5,0), (5,1)
6  * 	  ------->   (6,0)
7  *   *	  --->   (7,0), (7,1)
8  *      *   ->   (8,0), (8,2)
9  *         * >   (9,0), (9,3)
10 *      * 	->   (10,0), (10,2)
11 *   * 	  --->   (11,0), (11,1)
12 *	   ------->  (12,0)


j'nin 0 olduğu  her yerde "*-boşluk-" olacak

count 0'dan başlar ve her i döngüsü başında değişir.

tur -1'den başlar
count her 3'e ulaştığında tur 1 arttırılır

tur çift sayı iken count arttırılır
tur tek sayı iken count azaltılır.

count=j iken dizinin i satır j sütununa * atanır
count!=j iken "-boşluk-" atanır

ve dizi foreach döngüsü ile yazdırılır. 
Her tam sütun döngüsü sonunda bir satır aşağı atlanır.
