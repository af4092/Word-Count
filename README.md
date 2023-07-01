# Word-Count
Following api takes text as an input and displays the count of word.

- Program counts the occurrences of words in a text and displays the words and their occurrences in alphabetical order of the words. The program uses a TreeMap to store an entry consisting of a word and its count. For each word, check whether it is already a key in the map. If not, add an entry to the map with the word as the key and value 1. Otherwise, increase the value for the word (key) by 1 in the map. Assume the words are case insensitive; e.g., 'Boy' is treated the same as 'boy' 

![image](https://user-images.githubusercontent.com/24220136/231359650-dd0aae52-aae0-49a5-99d8-1e45eb492307.png)

## [Implementation](https://github.com/af4092/Word-Count/blob/main/src/CountOccuranceOfWords.java)

- The `CountOccuranceOfWords` class is defined in the org.example package.
- The main method is the entry point of the program.
- A Scanner object named input is created to read input from the user.
- The user is prompted to enter a text.
- A `TreeMap` named map is created to store the words and their occurrences. The TreeMap is used to sort the words in alphabetical order.
- The text entered by the user is split into words using the split method, with the specified regular expression pattern `[ \n\t\r.,;:!?(){]`. This pattern matches spaces, newlines, tabs, punctuation marks, and parentheses as delimiters.
- A loop is used to iterate over the array of words.
- Inside the loop, each word is converted to lowercase using the toLowerCase method and stored in the key variable.
- If the length of the key is greater than 0 (i.e., it is not an empty word), the program checks if the map already contains the key.
- If the key is not present in the map, it is added with a count of 1.
- If the key is already present in the map, the count is incremented by 1.
- After counting the occurrences, a set of `Map.Entry<String, Integer>` objects named entrySet is obtained from the map.
- A loop is used to iterate over each entry in the `entrySet`.
- Inside the loop, the count (`getValue()`) and the word (`getKey()`) are printed to the console.
- The program exits after printing the word occurrences.
