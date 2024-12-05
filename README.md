# DS-lab-sheet-8
## How to Run the Code
### Clone the repository:
```bash
git clone https://github.com/ChinmayBarik214/DS-lab-sheet-8
cd DS-lab-sheet-8
```
#### Product and Product Manager class
To Run:
```bash
javac ProductManager.java
java ProductManager
```
Output:
```
Product added: {ID: 101, Name: ProductA, Price: 50.0, Rating: 4.5}
Product added: {ID: 102, Name: ProductB, Price: 75.0, Rating: 4.7}
Product added: {ID: 103, Name: ProductC, Price: 100.0, Rating: 4.2}
Product List:
{ID: 101, Name: ProductA, Price: 50.0, Rating: 4.5}
{ID: 102, Name: ProductB, Price: 75.0, Rating: 4.7}
{ID: 103, Name: ProductC, Price: 100.0, Rating: 4.2}
Product updated: {ID: 102, Name: UpdatedProductB, Price: 80.0, Rating: 4.7}
Product List:
{ID: 101, Name: ProductA, Price: 50.0, Rating: 4.5}
{ID: 102, Name: UpdatedProductB, Price: 80.0, Rating: 4.7}
{ID: 103, Name: ProductC, Price: 100.0, Rating: 4.2}
Product deleted: {ID: 101, Name: ProductA, Price: 50.0, Rating: 4.5}
Product List:
{ID: 102, Name: UpdatedProductB, Price: 80.0, Rating: 4.7}
{ID: 103, Name: ProductC, Price: 100.0, Rating: 4.2}
```
#### Q1. Insertion Sort by Price
To Run:
```bash
javac InsertionSortByPrice.java
java InsertionSortByPrice
```
Output:
```
[
  { ID: 2, Name: Product2, Price: 50.0, Rating: 4.8 },
  { ID: 3, Name: Product3, Price: 75.0, Rating: 4.2 },
  { ID: 1, Name: Product1, Price: 100.0, Rating: 4.5 },
]
```
#### Q2. Binary Search by ID
To Run:
```bash
javac BinarySearchByID.java
java BinarySearchByID
```
Output:
```
{ ID: 101, Name: ProductA, Price: 50.0, Rating: 4.8 }
```
#### Q3. Quicksort by Rating
To Run:
```bash
javac QuicksortByRating.java
java QuicksortByRating
```
Output:
```
[
  { ID: 2, Name: Product2, Price: 50.0, Rating: 4.8 },
  { ID: 1, Name: Product1, Price: 100.0, Rating: 4.5 },
  { ID: 3, Name: Product3, Price: 75.0, Rating: 4.2 },
]
```
#### Q4. Sequential Search by Name
To Run:
```bash
javac SequentialSearchByName.java
java SequentialSearchByName
```
Output:
```
{ ID: 101, Name: ProductA, Price: 50.0, Rating: 4.8 }
```
#### Q5. Merge Sort by Name
To Run:
```bash
javac MergeSortByName.java
java MergeSortByName
```
Output:
```
[
  { ID: 2, Name: ProductA, Price: 50.0, Rating: 4.8 },
  { ID: 3, Name: ProductB, Price: 75.0, Rating: 4.2 },
  { ID: 1, Name: ProductC, Price: 100.0, Rating: 4.5 },
]
```