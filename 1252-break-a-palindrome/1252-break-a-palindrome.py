class Solution:
    def breakPalindrome(self, palindrome: str) -> str:
        # If the length of the palindrome is 1, return an empty string
        if len(palindrome) == 1:
            return ""
        
        # Iterate over each character in the first half of the palindrome
        for i in range(len(palindrome) // 2):
            # If the character is not 'a', replace it with 'a' and return the string
            if palindrome[i] != 'a':
                return palindrome[:i] + 'a' + palindrome[i+1:]

        # If all characters in the first half of the palindrome are 'a',
        # replace the last character with 'b' and return the string
        return palindrome[:-1] + 'b'
