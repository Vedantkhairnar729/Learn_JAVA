15. STRINGS
Definition: A String is a sequence of characters used to store text.

Create:
String name = "Vedant";

Common methods:
name.length();                   → String length
name.charAt(0);                  → character at index 0
name.equals("Vedant");           → compare Strings
name.equalsIgnoreCase("vedant"); → compare ignoring case
name.toUpperCase();              → uppercase
name.toLowerCase();              → lowercase


------------------------
Example 1 — Length:
String name = "Vedant";
System.out.println(name.length());

Example 2 — Character:
System.out.println(name.charAt(0));

Example 3 — Compare:
if (name.equals("Vedant")) {
    System.out.println("Matched");
}

Example 4 — Uppercase:
System.out.println(name.toUpperCase());

Example 5 — Lowercase:
System.out.println(name.toLowerCase());