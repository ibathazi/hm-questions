### Multiplication Table

#### Problem Statement:

Suppose you have a multiplication table that is N by N. That is, a 2D array where the value at the i-th row and j-th column is (i + 1) * (j + 1) (if 0-indexed) or i * j (if 1-indexed).

Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.

Examples
Testcase 1:
             Input: N = 6, X = 12
             Output: 4, since there are four 12’s in a 6x6 multiplication table
```
| 1 |  2 |  3 |  4 |  5 |  6 |
| 2 |  4 |  6 |  8 | 10 | 12 |
| 3 |  6 |  9 | 12 | 15 | 18 |
| 4 |  8 | 12 | 16 | 20 | 24 |
| 5 | 10 | 15 | 20 | 25 | 30 |
| 6 | 12 | 18 | 24 | 30 | 36 |
```


### Max Stock Loss

#### Problem Statement:

Given an array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum loss you could have from buying and selling that stock once. You must buy before you can sell it.

#### Examples

Testcase 1:
             Input: [9, 11, 8, 5, 7, 10]
Output: 6 since you could buy the stock at 11 dollars and sell it at 5 dollars.

#### test results:

![image](https://github.com/ibathazi/highmark-interview/assets/41767606/0df141f4-bfd7-4674-b93a-58dc487c1428)
