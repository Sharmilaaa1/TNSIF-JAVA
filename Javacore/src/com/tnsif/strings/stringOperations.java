package com.tnsif.strings;
public class stringOperations {
	public static void main(String[] args) {
		        String str1 = "Hello";
		        String str2 = "Java";
		        // 1. Concatenation
		        String concat = str1 + " " + str2;
		        System.out.println("Concatenation: " + concat);
		        // 2. Length
		        System.out.println("Length of str1: " + str1.length());
		        // 3. Character at index
		        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
		        // 4. Substring
		        System.out.println("Substring of str2 (1 to 4): " + str2.substring(1, 4));
		        // 5. Equals & equalsIgnoreCase
		        System.out.println("str1 equals 'Hello'? " + str1.equals("Hello"));
		        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));
		        // 6. CompareTo
		        System.out.println("Compare str1 to str2: " + str1.compareTo(str2));
		        // 7. Convert case
		        System.out.println("Uppercase str1: " + str1.toUpperCase());
		        System.out.println("Lowercase str2: " + str2.toLowerCase());
		        // 8. Replace
		        String replaced = concat.replace("World", "Java");
		        System.out.println("After replace: " + replaced);
		        // 9. Trim
		        String str3 = "   Java Programming   ";
		        System.out.println("Before trim: '" + str3 + "'");
		        System.out.println("After trim: '" + str3.trim() + "'");
		        // 10. Split
		        String sentence = "Java is fun";
		        String[] words = sentence.split(" ");
		        System.out.println("Splitting 'Java is fun':");
		        for (String word : words) {
		            System.out.println(word);
		        }
		    }
		}