package com.tnsif.strings;
public class stringBuffer {
	public static void main(String[] args) {
		        StringBuffer sb = new StringBuffer("Hello");
		        // 1. Append
		        sb.append(" World");
		        System.out.println("After append: " + sb);
		        // 2. Insert
		        sb.insert(5, " Java");
		        System.out.println("After insert: " + sb);
		        // 3. Replace
		        sb.replace(6, 10, "Programming"); // replaces "Java" with "Programming"
		        System.out.println("After replace: " + sb);
		        // 4. Delete
		        sb.delete(6, 17); // deletes "Programming"
		        System.out.println("After delete: " + sb);
		        // 5. Reverse
		        sb.reverse();
		        System.out.println("After reverse: " + sb);
		        // Reverse back to original for further operations
		        sb.reverse();
		        // 6. Capacity
		        System.out.println("Capacity: " + sb.capacity());
		        // 7. Length
		        System.out.println("Length: " + sb.length());
		        // 8. Char at index
		        System.out.println("Character at index 1: " + sb.charAt(1));
		        // 9. Set character
		        sb.setCharAt(1, 'a');
		        System.out.println("After setCharAt: " + sb);
			    }
		}