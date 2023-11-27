StringProcessor Class

The StringProcessor class provides various string processing methods for common tasks. This README provides an overview of the class and details the testing process.

Methods
1. isStrongPassword
Description: Checks if a given string meets the criteria for a strong password.
Parameters: String password
Returns: boolean - true if the password is strong, false otherwise.
2. calculateDigits
Description: Counts the number of digits in a given string.
Parameters: String sentence
Returns: int - the count of digits in the string.
3. calculateWords
Description: Counts the number of words in a given sentence.
Parameters: String sentence
Returns: int - the count of words in the sentence.

5. calculateExpression
Description: Evaluates a mathematical expression containing numbers, arithmetic operations, and parentheses.

Parameters: String expression
Returns: double - the result of the expression.
Testing Process
Test Cases
isStrongPassword:

Positive cases:

"StrongP@ssword1"
"AnotherStrong1@"
Negative cases:
"weakpassword"
"NoSpecialChar1"
"NoUppercase&Digit"
calculateDigits:

"abc123xyz" (Expected: 3 digits)

"Digit1234" (Expected: 4 digits)

"qwerty12345" (Expected: 5 digits)

"NoDigitsHere" (Expected: 0 digits)

Empty string (Expected: 0 digits)

calculateWords:

"This is a test" (Expected: 4 words)

"SingleWord" (Expected: 1 word)

"A sentence with multiple words" (Expected: 5 words)

"Hello World hello world hello world" (Expected: 6 words)

Empty string (Expected: 0 words)

calculateExpression:

"3 + 5 * ( 2 - 8 ) / 2" (Expected: -12.0)

"5 + 5" (Expected: 10)

"5 * 5" (Expected: 25)

"150 + 150 - 68" (Expected: 232)

"0 / 10" (Expected: 0)

Test Results

All test cases passed as expected.
Identified and resolved issues related to the setUp method and an unnecessary field.

Conclusion
The StringProcessor class has been successfully tested, providing accurate results for the specified string processing methods. The class is ready for use, and additional testing may be conducted to cover edge cases and further scenarios.
