class Solution(object):
    def reverseWords(self, s):
        words = []
        word = ""
        
        for char in s:
            if char != " ":
                word += char
            elif word:
                words.append(word)
                word = ""
        
        if word:
            words.append(word)
        
        return " ".join(words[::-1])